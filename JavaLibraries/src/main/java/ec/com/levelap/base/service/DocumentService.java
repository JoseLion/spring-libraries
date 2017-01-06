package ec.com.levelap.base.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocumentService {

	@Autowired
	private Environment environment;

	@Value("${levelap.file.environment}")
	private String fileEnvironment;

	public String saveFile(MultipartFile file, String module) throws IOException {
		StringBuilder path = new StringBuilder(environment.getProperty(fileEnvironment));
		path.append(File.separator);
		path.append(module);

		File directory = new File(path.toString());
		if(!directory.exists()) {
			directory.mkdirs();
		}
		path.append(File.separator);
		path.append(file.getOriginalFilename());
		File serverFile = new File(path.toString());

		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
		stream.write(bytes);
		stream.close();

		return path.toString();
	}
	
	public MultipartFile getFile() {
		return null;
	}
	
}
