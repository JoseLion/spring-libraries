package ec.com.levelap.base.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

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
		if (environment.getProperty(fileEnvironment) == null) {
			throw new IOException("NO SE PUDO ENCOTRAR LA VARIABLE DE ENTORNO ".concat(fileEnvironment).concat(" EN SU EQUIPO"));
		}
		StringBuilder path = new StringBuilder(environment.getProperty(fileEnvironment));
		path.append(File.separator);
		path.append(module);
		File directory = new File(path.toString());
		if (!directory.exists()) {
			directory.mkdirs();
		}
		path.append(File.separator);
		path.append(file.getOriginalFilename());
		File serverFile = new File(path.toString());
		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile, true));
		stream.write(bytes);
		stream.close();
		return path.toString();
	}

	public InputStream getFile(String module, String fileName) throws IOException {
		if (environment.getProperty(fileEnvironment) == null) {
			throw new IOException("NO SE PUDO ENCOTRAR LA VARIABLE DE ENTORNO ".concat(fileEnvironment).concat(" EN SU EQUIPO"));
		}
		StringBuilder path = new StringBuilder(environment.getProperty(fileEnvironment));
		path.append(File.separator);
		path.append(module);
		path.append(File.separator);
		path.append(fileName);
		File serverFile = new File(path.toString());
		return new FileInputStream(serverFile);
	}
}
