package ec.com.levelap.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.levelap.base.entity.BaseEntity;

@Entity
@Table(schema="blog", name="blog_extra")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BlogExtra extends BaseEntity {
	@Column(columnDefinition="VARCHAR")
	private String text;
	
	@Column(name="is_tag", columnDefinition="BOOLEAN DEFAULT FALSE")
	private Boolean isTag = false;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getIsTag() {
		return isTag;
	}

	public void setIsTag(Boolean isTag) {
		this.isTag = isTag;
	}
}
