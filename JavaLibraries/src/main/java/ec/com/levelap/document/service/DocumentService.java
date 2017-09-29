package ec.com.levelap.document.service;

import javax.servlet.ServletException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.document.entity.Document;
import ec.com.levelap.document.repository.DocumentRepo;

@Service
public class DocumentService {
	@Autowired
	private DocumentRepo documentRepo;
	
	@Transactional
	public Document storeDocument(Document document, MultipartFile file) throws ServletException {
		return null;
	}
}
