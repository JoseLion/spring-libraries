package ec.com.levelap.base.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.PatternSyntaxException;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.base.entity.FileData;

@Service
public class DocumentService {

	@Autowired
	private Environment environment;

	@Value("${levelap.file.environment}")
	private String fileEnvironment;

	public FileData saveFile(MultipartFile file, String module) throws IOException, ServletException {
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
		FileData fileData = sameFileName(path.toString(), 0);
		fileData.setPath(fileData.getPath());
		File serverFile = new File(fileData.getPath());
		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile, true));
		stream.write(bytes);
		stream.close();
		return fileData;
	}

	public InputStream getFile(String path) throws IOException {
		// if (environment.getProperty(fileEnvironment) == null) {
		// throw new IOException("NO SE PUDO ENCOTRAR LA VARIABLE DE ENTORNO
		// ".concat(fileEnvironment).concat(" EN SU EQUIPO"));
		// }
		// StringBuilder path = new
		// StringBuilder(environment.getProperty(fileEnvironment));
		// path.append(File.separator);
		// path.append(module);
		// path.append(File.separator);
		// path.append(fileName);
		File serverFile = new File(path);
		return new FileInputStream(serverFile);
	}

	public void deleteFile(String module, String fileName) throws IOException {
		if (environment.getProperty(fileEnvironment) == null) {
			throw new IOException("NO SE PUDO ENCOTRAR LA VARIABLE DE ENTORNO ".concat(fileEnvironment).concat(" EN SU EQUIPO"));
		}

		StringBuilder path = new StringBuilder(environment.getProperty(fileEnvironment));
		path.append(File.separator);
		path.append(module);
		path.append(File.separator);
		path.append(fileName);
		File file = new File(path.toString());

		if (file.exists()) {
			file.delete();
		}
	}

	private FileData sameFileName(String path, int counter) throws ServletException {
		File serverFile = new File(path);
		String[] split = null;
		if (serverFile.exists()) {
			try {
				String[] splitAuxOpen = path.split("\\(");
				if (splitAuxOpen != null && splitAuxOpen.length > 0) {
					String[] splitAuxClose = splitAuxOpen[splitAuxOpen.length - 1].split("\\)");
					if (splitAuxOpen.length > 1) {
						counter = Integer.parseInt(splitAuxClose[splitAuxClose.length - 2]);
					}
				}
			} catch (PatternSyntaxException | NumberFormatException ex) {
			}
			path = path.replace("(" + counter + ")", "");
			split = path.split("\\.");
			if (split.length < 1) {
				throw new ServletException("El archivo no contiene extensión.");
			}
			split[split.length - 2] = split[split.length - 2] + "(" + (++counter) + ")";
			StringBuilder fullName = new StringBuilder();
			for (int i = 0; i < split.length; i++) {
				fullName.append(split[i]);
				if (i != (split.length - 1)) {
					fullName.append(".");
				}
			}
			return sameFileName(fullName.toString(), counter);
		}

		FileData fileData = new FileData();
		fileData.setPath(path);
		if (File.separator.equals("\\")) {
			split = path.toString().split("\\\\");
		} else {
			split = path.toString().split(File.separator);
		}
		fileData.setName(split[split.length - 1]);
		return fileData;
	}
}
