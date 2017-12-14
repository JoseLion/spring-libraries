package ec.com.levelap.archive;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.base.entity.FileData;

@Service
public class ArchiveService {
	@Autowired
	private ArchiveRepo archiveRepository;
	
	@Autowired
	private Environment environment;

	@Value("${levelap.file.environment}")
	private String fileEnvironment;
	
	public void downloadFile(String name, String module, HttpServletResponse response) throws ServletException, IOException {
		InputStream inputStream = new FileInputStream(this.getFile(name, module));
		response.setHeader("Content-Disposition", String.format("inline; filename=\"" + name + "\""));
		response.setContentType("application/octet-stream");
		FileCopyUtils.copy(inputStream, response.getOutputStream());
		response.flushBuffer();
		inputStream.close();
	}
	
	public FileData saveFile(MultipartFile file, String module) throws IOException, ServletException {
		if (environment.getProperty(fileEnvironment) == null) {
			throw new IOException("NO SE PUDO ENCOTRAR LA VARIABLE DE ENTORNO ".concat(fileEnvironment).concat(" EN SU EQUIPO"));
		}
		
		StringBuilder path = new StringBuilder(environment.getProperty(fileEnvironment));
		path.append(File.separator);
		
		if (module != null && !module.isEmpty()) {
			path.append(module);
		}
		
		File directory = new File(path.toString());
		
		if (!directory.exists()) {
			directory.mkdirs();
		}
		
		if (module != null && !module.isEmpty()) {
			path.append(File.separator);
		}
		
		String fileName = renameIfDuplicate(path.toString(), file.getOriginalFilename(), 0);
		fileName = fileName.trim().replace(" ", "");
		path.append(fileName);
		
		File serverFile = new File(path.toString());
		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile, true));
		
		stream.write(bytes);
		stream.close();
		
		FileData fileData = new FileData();
		fileData.setName(fileName);
		fileData.setPath(path.toString());
		
		return fileData;
	}
	
	public File getFile(String name, String module) throws IOException {
		if (environment.getProperty(fileEnvironment) == null) {
			throw new IOException("NO SE PUDO ENCOTRAR LA VARIABLE DE ENTORNO ".concat(fileEnvironment).concat(" EN SU EQUIPO"));
		}
		
		StringBuilder path = new StringBuilder(environment.getProperty(fileEnvironment));
		path.append(File.separator);
		
		if (module != null && !module.isEmpty()) {
			path.append(module);
			path.append(File.separator);
		}
		
		path.append(name);
		return new File(path.toString());
	}

	public boolean deleteFile(String name, String module) throws IOException {
		if (environment.getProperty(fileEnvironment) == null) {
			throw new IOException("NO SE PUDO ENCOTRAR LA VARIABLE DE ENTORNO ".concat(fileEnvironment).concat(" EN SU EQUIPO"));
		}
		
		StringBuilder path = new StringBuilder(environment.getProperty(fileEnvironment));
		path.append(File.separator);
		
		if (module != null && !module.isEmpty()) {
			path.append(module);
			path.append(File.separator);
		}
		
		path.append(name);
		File file = new File(path.toString());

		if (file.exists()) {
			return file.delete();
		}
		
		return false;
	}

	private String renameIfDuplicate(String path, String name, int counter) throws ServletException {
		File file = new File(path + name);
		
		if (file.exists()) {
			counter++;
			int openIndex = 0;
			for (int i = 1; i < name.length(); i++) {
				if (name.substring(i-1, i).equals("(")) {
					openIndex = i;
					break;
				}
			}
			
			int closeIndex = 0;
			for (int i = 1; i < name.length(); i++) {
				if (name.substring(i-1, i).equals(")")) {
					closeIndex = i-1;
					break;
				}
			}
			
			if (openIndex != 0 && closeIndex != 0 && isInteger(name.substring(openIndex, closeIndex))) {
				name = name.substring(0, openIndex-1) + "(" + counter + ")" + name.substring(closeIndex+1);
			} else {
				int dotIndex = 0;
				for (int i = name.length()-1; i >= 0; i--) {
					if (i-1 >= 0 && name.substring(i-1, i).equals(".")) {
						dotIndex = i-1;
						break;
					}
				}
				
				name = name.substring(0, dotIndex) + " (" + counter + ")" + name.substring(dotIndex);
			}
			
			name = renameIfDuplicate(path, name, counter);
		}
		
		return name;
	}
	
	private boolean isInteger(String value) {
		try {
			int number = Integer.parseInt(value);
			
			if (number > 0) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public ArchiveRepo getArchiveRepository() {
		return archiveRepository;
	}
}
