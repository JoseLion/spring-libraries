package ec.com.levelap.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.blog.entity.BlogComment;

@Repository
public interface BlogCommentRepo extends JpaRepository<BlogComment, Long> {
	public Page<BlogComment> findByParentIsNullAndBlogArticleIdOrderByCreationDateAsc(Long articleId, Pageable page);
	
	public Page<BlogComment> findByParent_IdOrderByCreationDateAsc(Long parentId, Pageable page);

	public Page<BlogComment> findByParentIsNullAndBlogArticleIdOrderByCreationDateDesc(Long articleId, Pageable page);
	
	public Page<BlogComment> findByParent_IdOrderByCreationDateDesc(Long parentId, Pageable page);
	
}