package ec.com.levelap.blog.entity;

import java.util.Date;
import java.util.List;

public interface BlogArticleLite {
	public Long getId();
	
	public Boolean getStatus();
	
	public String getTitle();
	
	public Date getCreationDate();
	
	public BlogExtra getCategory();
	
	public List<BlogExtra> getTags();
	
	public void setTags(List<BlogExtra> tags);
	
	public Boolean getIsFeatured();
}
