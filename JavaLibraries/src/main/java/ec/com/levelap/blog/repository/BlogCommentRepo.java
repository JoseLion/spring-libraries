package ec.com.levelap.blog.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.blog.entity.BlogComment;

@Repository
public interface BlogCommentRepo extends JpaRepository<BlogComment, Long> {
	public Page<BlogComment> findByBlogArticleId(Long articleId, Pageable page);
	
	public List<BlogComment> findByParent_Id(Long parentId);
}