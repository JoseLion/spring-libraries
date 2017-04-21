package ec.com.levelap.archive;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import ec.com.levelap.base.service.BaseService;
import ec.com.levelap.base.service.DocumentService;

@Service
public class ArchiveService extends BaseService<Archive> {

	public ArchiveService() {
		super(Archive.class);
	}

	@Autowired
	private ArchiveRepository archiveRepository;

	@Autowired
	private DocumentService documentService;
	
	public void downloadFile(String path, HttpServletResponse response) throws ServletException, IOException {
		String[] split = null;
		if (File.separator.equals("\\")) {
			split = path.split("\\\\");
		} else {
			split = path.split(File.separator);
		}
		InputStream inputStream = this.documentService.getFile(path);
		response.setHeader("Content-Disposition", String.format("inline; filename=\"" + split[split.length - 1] + "\""));
		response.setContentType("application/octet-stream");
		FileCopyUtils.copy(inputStream, response.getOutputStream());
		response.flushBuffer();
		inputStream.close();
	}

	public ArchiveRepository getArchiveRepository() {
		return archiveRepository;
	}

	public DocumentService getDocumentService() {
		return documentService;
	}
}
