package ec.com.levelap.commons.archive;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import ec.com.levelap.commons.service.DocumentService;

@Service
public class ArchiveService {
	@Autowired
	private ArchiveRepo archiveRepository;

	@Autowired
	private DocumentService documentService;
	
	public void downloadFile(String name, String module, HttpServletResponse response) throws ServletException, IOException {
		InputStream inputStream = this.documentService.getFile(name, module);
		response.setHeader("Content-Disposition", String.format("inline; filename=\"" + name + "\""));
		response.setContentType("application/octet-stream");
		FileCopyUtils.copy(inputStream, response.getOutputStream());
		response.flushBuffer();
		inputStream.close();
	}

	public ArchiveRepo getArchiveRepository() {
		return archiveRepository;
	}

	public DocumentService getDocumentService() {
		return documentService;
	}
}
