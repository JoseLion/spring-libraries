package ec.com.levelap.document.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.document.LevelapDocument;
import ec.com.levelap.document.entity.Document;
import ec.com.levelap.document.repository.DocumentRepo;

@Service
public class DocumentService {
	@Autowired
	private DocumentRepo documentRepo;
	
	@Autowired
	private LevelapDocument levelapDocument;
	
	@Transactional
	public Document save(Document document, Long entityId, MultipartFile file) throws ServletException, IOException {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String virtualDirectory = document.getType().getRoot() + File.separator + Long.toString(entityId) + File.separator + document.getType().getCategory().getName();
		String[] split = file.getOriginalFilename().split(".");
		String fileName = document.getType().getName().replaceAll("\\s+", "-") + "-" + df.format(new Date()) + "." + split[split.length - 1];
		
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
		}
		
		String managerId = levelapDocument.getDocumentConfig().storeInContentManager(file, document.getMetaData());
		
		document.setName(fileName);
		document.setMimeType(file.getContentType());
		document.setRoute(virtualDirectory);
		document.setContentManagerId(managerId);
		
		document = documentRepo.save(document);
		return document;
	}
	
	
}
