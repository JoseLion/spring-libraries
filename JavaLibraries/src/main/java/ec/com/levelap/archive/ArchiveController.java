package ec.com.levelap.archive;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/archive", produces = MediaType.APPLICATION_JSON_VALUE)
public class ArchiveController {
	@Autowired
	private ArchiveService archiveService;
	
	@Deprecated
	@RequestMapping(value="/downloadFile", method=RequestMethod.POST)
	public void downloadFileFromPath(@RequestBody HashMap<String, String> obj, HttpServletResponse response) throws ServletException, IOException {
		archiveService.downloadFile(obj.get("name"), obj.get("module"), response);
	}
	
	@RequestMapping(value="download/{id}", method=RequestMethod.GET)
	public void download(@PathVariable Long id, HttpServletResponse response) throws ServletException, IOException {
		Archive archive = archiveService.getArchiveRepository().findOne(id);
		
		if (archive != null) {
			File file = archiveService.getFile(archive.getName(), archive.getModule());
			response.setContentType(archive.getType());
			response.setHeader("Content-Disposition", String.format("inline; filename=\"" + archive.getName() +"\""));
			response.setContentLengthLong(file.length());
			
			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
			FileCopyUtils.copy(inputStream, response.getOutputStream());
		}
	}
}
