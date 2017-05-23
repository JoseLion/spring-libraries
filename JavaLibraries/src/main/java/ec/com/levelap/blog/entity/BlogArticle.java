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
import javax.persistence.Transient;

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
	
	@Column(columnDefinition="VARCHAR")
	private String summary;
	
	@Column(columnDefinition="TEXT", nullable=false)
	private String body;
	
	@Column(columnDefinition="VARCHAR")
	private String author;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, optional = true)
	@JoinColumn(name="category", foreignKey=@ForeignKey(name="category_blog_extra_fk"))
	private BlogExtra category;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="blog_tag", schema="blog", joinColumns=@JoinColumn(name="blog_article", foreignKey=@ForeignKey(name="blog_article_fk")), inverseJoinColumns=@JoinColumn(name="blog_extra", foreignKey=@ForeignKey(name="blog_extra_fk")))
	private List<BlogExtra> tags = new ArrayList<>();
	
	@Column(name="is_featured", columnDefinition="BOOLEAN DEFAULT FALSE")
	private Boolean isFeatured = false;
	
	@Column(name="times_seen", columnDefinition="INTEGER DEFAULT 0")
	private Integer timesSeen = 0;
	
	@Transient
	private Long nextArticleId;
	
	@Transient
	private String nextArticleTitle;
	
	@Transient
	private Long prevArticleId;
	
	@Transient
	private String prevArticleTitle;

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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	public Integer getTimesSeen() {
		return timesSeen;
	}

	public void setTimesSeen(Integer timesSeen) {
		this.timesSeen = timesSeen;
	}

	public Long getNextArticleId() {
		return nextArticleId;
	}

	public void setNextArticleId(Long nextArticleId) {
		this.nextArticleId = nextArticleId;
	}

	public String getNextArticleTitle() {
		return nextArticleTitle;
	}

	public void setNextArticleTitle(String nextArticleTitle) {
		this.nextArticleTitle = nextArticleTitle;
	}

	public Long getPrevArticleId() {
		return prevArticleId;
	}

	public void setPrevArticleId(Long prevArticleId) {
		this.prevArticleId = prevArticleId;
	}

	public String getPrevArticleTitle() {
		return prevArticleTitle;
	}

	public void setPrevArticleTitle(String prevArticleTitle) {
		this.prevArticleTitle = prevArticleTitle;
	}

}
