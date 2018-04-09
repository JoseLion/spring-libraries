package ec.com.levelap.archive;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.Normalizer;
import java.util.Date;

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
		
		String fileName = renameIfDuplicate(path.toString(), file.getOriginalFilename());
		fileName = Normalizer.normalize(fileName, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
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

	private String renameIfDuplicate(String path, String name) throws ServletException {
		File file = new File(path + name);
		
		if (file.exists()) {
			int dotIndex = name.lastIndexOf(".");
			Date today = new Date();
			
			return name.substring(0, dotIndex) + "-" + today.getTime() + name.substring(dotIndex);
		}
		
		return name;
	}

	public ArchiveRepo getArchiveRepository() {
		return archiveRepository;
	}
}
