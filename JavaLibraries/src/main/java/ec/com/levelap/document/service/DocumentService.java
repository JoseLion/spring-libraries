package ec.com.levelap.document.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.document.LevelapDocument;
import ec.com.levelap.document.entity.Document;
import ec.com.levelap.document.entity.DocumentType;
import ec.com.levelap.document.repository.DocumentCategoryRepo;
import ec.com.levelap.document.repository.DocumentRepo;
import ec.com.levelap.document.repository.DocumentTypeRepo;

@Service
public class DocumentService {
	@Autowired
	private DocumentRepo documentRepo;
	
	@Autowired
	private DocumentTypeRepo documentTypeRepo;
	
	@Autowired
	private DocumentCategoryRepo documentCategoryRepo;
	
	@Autowired
	private LevelapDocument levelapDocument;
	
	@Transactional
	public Document save(Document document, Long entityId, MultipartFile file) throws ServletException, IOException {
		if (document.getType() != null && document.getType().getId() != null) {
			if (document.getType().getName() == null || document.getType().getCategory() == null || document.getType().getRoot() == null) {
				DocumentType type = documentTypeRepo.findOne(document.getType().getId());
				document.setType(type);
			}
		}
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String virtualDirectory = document.getType().getRoot() + File.separator + Long.toString(entityId) + File.separator + document.getType().getCategory().getName();
		String[] split = file.getOriginalFilename().split("\\.");
		String fileName = Normalizer.normalize(document.getType().getName().replaceAll("\\s+", "-") + "-" + df.format(new Date()) + "." + (split.length > 0 ? split[split.length - 1] : ""), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase();
		
		if (levelapDocument.getDocumentConfig().fileSystemBasePath() != null) {
			File directory = new File(levelapDocument.getDocumentConfig().fileSystemBasePath() + File.separator + virtualDirectory);
			File archive = new File(directory + File.separator + fileName);
			
			if (archive.exists()) {
				archive.delete();
			}
			
			if (!directory.exists()) {
				directory.mkdirs();
			}
			
			BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(archive));
			outputStream.write(file.getBytes());
			outputStream.close();
		} else {
			System.err.println("Warning: Backup store in file system no configured");
		}
		
		String managerId = levelapDocument.getDocumentConfig().storeInContentManager(file, document.getMetaData());
		
		document.setName(fileName);
		document.setMimeType(file.getContentType());
		document.setRoute(virtualDirectory);
		document.setContentManagerId(managerId);
		
		document = documentRepo.save(document);
		return document;
	}
	
	public File getFile(Long documentId) {
		Document document = documentRepo.findOne(documentId);
		return getFileFromDocument(document);
	}
	
	public File getFile(Document document) {
		return getFileFromDocument(document);
	}
	
	private File getFileFromDocument(Document document) {
		File file = levelapDocument.getDocumentConfig().retrieveFromContentManager(document.getContentManagerId());
		
		if (file == null && levelapDocument.getDocumentConfig().fileSystemBasePath() != null) {
			file = new File(levelapDocument.getDocumentConfig().fileSystemBasePath() + File.separator + document.getRoute() + File.separator + document.getName());
		}
		
		return file;
	}

	public DocumentRepo getDocumentRepo() {
		return documentRepo;
	}

	public DocumentTypeRepo getDocumentTypeRepo() {
		return documentTypeRepo;
	}

	public DocumentCategoryRepo getDocumentCategoryRepo() {
		return documentCategoryRepo;
	}
}
