package ec.com.levelap.document;

import java.io.File;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface DocumentConfig {
	public String fileSystemBasePath();
	
	public String storeInContentManager(MultipartFile file, Map<String, String> metaData);
	
	public File retrieveFromContentManager(String id);
}