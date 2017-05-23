package ec.com.levelap.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.blog.entity.BlogExtra;

@Repository
public interface BlogExtraRepo extends JpaRepository<BlogExtra, Long> {
	public List<BlogExtra> findByIsTag(Boolean isTag);
	
	public List<BlogExtra> findByStatusIsTrueAndIsTag(Boolean isTag);
	
	public BlogExtra findByTextAndIsTag(String text, Boolean isTag);
	
	public BlogExtra findByTextAndTextNotAndIsTag(String text, String notText, Boolean isTag);
}