package ec.com.levelap.blog.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.levelap.base.entity.BaseEntity;

@Entity
@Table(schema="blog", name="blog_tag")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BlogTag extends BaseEntity {
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.DETACH, optional=false)
	@JoinColumn(name="blog_content", foreignKey=@ForeignKey(name="blog_content_fk"))
	private BlogArticle blogContent;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.DETACH, optional=false)
	@JoinColumn(name="blog_extra", foreignKey=@ForeignKey(name="blog_extra_fk"))
	private BlogExtra blogExtra;

	public BlogArticle getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(BlogArticle blogContent) {
		this.blogContent = blogContent;
	}

	public BlogExtra getBlogExtra() {
		return blogExtra;
	}

	public void setBlogExtra(BlogExtra blogExtra) {
		this.blogExtra = blogExtra;
	}
}
