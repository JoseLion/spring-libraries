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
		System.out.println("VARIABLE DE ENTORNO: "
				+ fileEnvironment);
		
		StringBuilder path = new StringBuilder(environment.getProperty(fileEnvironment));
		path.append(module);
		
		System.out.println("DIRECTORIO: " + path.toString());
		
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
		
		System.out.println("DIRECTORIO DEL ARCHIVO: " + path.toString());
		return path.toString();
	}
}
