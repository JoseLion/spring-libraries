package ec.com.levelap.blog.entity;

import java.util.Date;
import java.util.List;

import ec.com.levelap.commons.archive.Archive;

public interface BlogArticleOpen {
	public Long getId();
	
	public String getTitle();
	
	public Date getCreationDate();
	
	public BlogExtra getCategory();
	
	public Archive getBanner();
	
	public String getAuthor();
	
	public List<BlogExtra> getTags();
	
	public void setTags(List<BlogExtra> tags);
	
	public String getSummary();
}
