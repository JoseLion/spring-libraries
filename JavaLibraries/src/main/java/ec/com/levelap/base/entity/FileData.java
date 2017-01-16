package ec.com.levelap.base.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class FileData {

	private String name;

	private String path;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
