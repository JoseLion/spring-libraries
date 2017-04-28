package ec.com.levelap.commons.archive;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/open/archive", produces = MediaType.APPLICATION_JSON_VALUE)
public class ArchiveOpenController {
	@Autowired
	private ArchiveService archiveService;
	
	@RequestMapping(value = "/downloadFile", method = RequestMethod.POST)
	public void downloadFileFromPath(@RequestBody HashMap<String, String> obj, HttpServletResponse response) throws ServletException, IOException {
		archiveService.downloadFile(obj.get("name"), obj.get("module"), response);
	}
}
