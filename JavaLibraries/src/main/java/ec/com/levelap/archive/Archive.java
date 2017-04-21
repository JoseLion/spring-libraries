package ec.com.levelap.archive;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.levelap.base.entity.BaseEntity;

@Entity
@Table(schema="commons", name="archive", uniqueConstraints=@UniqueConstraint(columnNames="path", name="archive_path_uk"))
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Archive extends BaseEntity {

	@Column(nullable=false, columnDefinition="VARCHAR")
	private String name;

	@Column(nullable=false, columnDefinition="VARCHAR")
	private String path;

	@Column(columnDefinition="VARCHAR")
	private String type;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
