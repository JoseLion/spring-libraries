package ec.com.levelap.blog.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.levelap.base.entity.BaseEntity;
import ec.com.levelap.commons.archive.Archive;

@Entity
@Table(schema="blog", name="Blog_article")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BlogArticle extends BaseEntity {
	@Column(columnDefinition="VARCHAR", nullable=false)
	private String title;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="banner", foreignKey=@ForeignKey(name="banner_archive_fk"))
	private Archive banner;
	
	@Column(columnDefinition="TEXT", nullable=false)
	private String body;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="category", foreignKey=@ForeignKey(name="category_blog_extra_fk"))
	private BlogExtra category;
	
	@ManyToMany(targetEntity=BlogTag.class, fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="blog_tag", schema="blog", joinColumns=@JoinColumn(name="blog_article", foreignKey=@ForeignKey(name="blog_article_fk")), inverseJoinColumns=@JoinColumn(name="blog_extra", foreignKey=@ForeignKey(name="blog_extra_fk")))
	private List<BlogExtra> tags = new ArrayList<>();
	
	@Column(name="is_featured", columnDefinition="BOOLEAN DEFAULT FALSE")
	private Boolean isFeatured = false;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Archive getBanner() {
		return banner;
	}

	public void setBanner(Archive banner) {
		this.banner = banner;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public BlogExtra getCategory() {
		return category;
	}

	public void setCategory(BlogExtra category) {
		this.category = category;
	}

	public List<BlogExtra> getTags() {
		return tags;
	}

	public void setTags(List<BlogExtra> tags) {
		this.tags = tags;
	}

	public Boolean getIsFeatured() {
		return isFeatured;
	}

	public void setIsFeatured(Boolean isFeatured) {
		this.isFeatured = isFeatured;
	}
}
