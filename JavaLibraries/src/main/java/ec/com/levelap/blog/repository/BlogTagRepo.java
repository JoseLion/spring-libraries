package ec.com.levelap.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.blog.entity.BlogTag;

@Repository
public interface BlogTagRepo extends JpaRepository<BlogTag, Long> {

	List<BlogTag> findByBlogArticleId(Long blogArticleId);

}
