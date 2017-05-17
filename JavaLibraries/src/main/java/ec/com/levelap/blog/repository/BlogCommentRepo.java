package ec.com.levelap.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.blog.entity.BlogComment;

@Repository
public interface BlogCommentRepo extends JpaRepository<BlogComment, Long> {
	
}