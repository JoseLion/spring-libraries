package ec.com.levelap.commons.archive;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.levelap.base.entity.BaseEntity;

@Entity
@Table(schema="commons", name="archive")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Archive extends BaseEntity {

	@Column(nullable=false, columnDefinition="VARCHAR")
	private String name;

	@Column(columnDefinition="VARCHAR")
	private String module;

	@Column(columnDefinition="VARCHAR")
	private String type;

	public Archive() {
		super();
	}

	public Archive(String name, String module, String type) {
		super();
		this.name = name;
		this.module = module;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
