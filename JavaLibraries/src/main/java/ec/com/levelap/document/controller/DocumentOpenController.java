package ec.com.levelap.document.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.document.entity.Document;
import ec.com.levelap.document.entity.DocumentCategory;
import ec.com.levelap.document.entity.DocumentSearch;
import ec.com.levelap.document.entity.DocumentType;
import ec.com.levelap.document.service.DocumentService;

@RestController
@RequestMapping(value="open/document", produces=MediaType.APPLICATION_JSON_VALUE)
public class DocumentOpenController {
	@Autowired
	private DocumentService documentService;
	
	@RequestMapping(value="download/{id}", method=RequestMethod.GET)
	public void download(@PathVariable Long id, HttpServletResponse response) throws ServletException, IOException {
		Document document = documentService.getDocumentRepo().findOne(id);
		File file = documentService.getFile(document);
		
		response.setContentType(document.getMimeType());
		response.setHeader("Content-Disposition", String.format("inline; filename=\"" + document.getName() +"\""));
		response.setContentLengthLong(file.length());
		
		InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
		FileCopyUtils.copy(inputStream, response.getOutputStream());
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST, consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Document> save(@RequestPart Document document, @RequestPart MultipartFile file) throws ServletException, IOException {
		document = documentService.save(document, -1L, file);
		return new ResponseEntity<Document>(document, HttpStatus.OK);
	}
	
	@RequestMapping(value="getAllDocumentTypes", method=RequestMethod.GET)
	public ResponseEntity<List<DocumentType>> getAllDocumentTypes() throws ServletException {
		List<DocumentType> types = documentService.getDocumentTypeRepo().findAll();
		return new ResponseEntity<List<DocumentType>>(types, HttpStatus.OK);
	}
	
	@RequestMapping(value="findDocumentTypes", method=RequestMethod.POST)
	public ResponseEntity<List<DocumentType>> findDocumentTypes(@RequestBody DocumentSearch search) throws ServletException {
		List<DocumentType> types = documentService.getDocumentTypeRepo().findDocumentType(search.getCode(), search.getGroupCode(), search.getCategory());
		return new ResponseEntity<List<DocumentType>>(types, HttpStatus.OK);
	}
	
	@RequestMapping(value="getDocumentType/{code}", method=RequestMethod.GET)
	public ResponseEntity<DocumentType> getDocumentType(@PathVariable String code) throws ServletException {
		DocumentType type = documentService.getDocumentTypeRepo().findByCode(code);
		return new ResponseEntity<DocumentType>(type, HttpStatus.OK);
	}
	
	@RequestMapping(value="getDocumentCategories", method=RequestMethod.GET)
	public ResponseEntity<List<DocumentCategory>> getDocumentCategories() throws ServletException {
		List<DocumentCategory> categories = documentService.getDocumentCategoryRepo().findAll();
		return new ResponseEntity<List<DocumentCategory>>(categories, HttpStatus.OK);
	}
	
	@RequestMapping(value="getDocumentCategory/{code}", method=RequestMethod.GET)
	public ResponseEntity<DocumentCategory> getDocumentCategory(@PathVariable String code) throws ServletException {
		DocumentCategory category = documentService.getDocumentCategoryRepo().findByCode(code);
		return new ResponseEntity<DocumentCategory>(category, HttpStatus.OK);
	}
}
