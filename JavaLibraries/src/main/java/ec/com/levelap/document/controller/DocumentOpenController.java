package ec.com.levelap.document.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.document.entity.Document;
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
}
