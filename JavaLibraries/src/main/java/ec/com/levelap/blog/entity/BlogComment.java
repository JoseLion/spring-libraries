package ec.com.levelap.blog.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.levelap.base.entity.BaseEntity;

@Entity
@Table(schema="blog", name="blog_comment")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BlogComment extends BaseEntity {
	@Column(columnDefinition="VARCHAR")
	private String user;
	
	@Column(columnDefinition="VARCHAR")
	private String email;
	
	@Column(columnDefinition="VARCHAR")
	private String comment;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="parent", foreignKey=@ForeignKey(name="parent_blog_comment"))
	private BlogComment parent;
	
	@ManyToMany(mappedBy="parent", fetch=FetchType.LAZY)
	private List<BlogComment> children = new ArrayList<>();
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.DETACH)
	@JoinColumn(name="blog_article", foreignKey=@ForeignKey(name="blog_article_fk"))
	private BlogArticle blogArticle;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public BlogComment getParent() {
		if (this.parent != null) {
			this.parent.setChildren(new ArrayList<>());
		}
		
		return parent;
	}

	public void setParent(BlogComment parent) {
		this.parent = parent;
	}

	public List<BlogComment> getChildren() {
		return children;
	}

	public void setChildren(List<BlogComment> children) {
		this.children = children;
	}
}
