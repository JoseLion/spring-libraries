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
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.levelap.base.entity.BaseEntity;

@Entity
@Table(schema="blog", name="blog_comment")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BlogComment extends BaseEntity {
	@Column(columnDefinition="VARCHAR")
	private String username;
	
	@Column(columnDefinition="VARCHAR")
	private String email;
	
	@Column(columnDefinition="VARCHAR")
	private String comment;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="parent", foreignKey=@ForeignKey(name="parent_blog_comment"))
	private BlogComment parent;
	
	@JsonIgnore
	@ManyToMany(mappedBy="parent", fetch=FetchType.LAZY)
	private List<BlogComment> children = new ArrayList<>();
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.DETACH)
	@JoinColumn(name="blog_article", foreignKey=@ForeignKey(name="blog_article_fk"))
	private BlogArticle blogArticle;
	
	@Transient
	private Integer level = 0;
	
	@Transient
	private Integer childrenSize;
	
	@Transient
	private Long parentId;
	
	@Transient
	private Long articleId;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public BlogArticle getBlogArticle() {
		return blogArticle;
	}

	public void setBlogArticle(BlogArticle blogArticle) {
		this.blogArticle = blogArticle;
	}

	public Integer getLevel() {
		this.level = 0;
		BlogComment currentParent = this.parent;
		
		while (currentParent != null) {
			this.level++;
			currentParent = currentParent.getParent();
		}
		
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getChildrenSize() {
		this.childrenSize = 0;
		
		if (this.children != null) {
			this.childrenSize = this.children.size();
		}
		
		return this.childrenSize;
	}

	public void setChildrenSize(Integer childrenSize) {
		this.childrenSize = childrenSize;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
}
