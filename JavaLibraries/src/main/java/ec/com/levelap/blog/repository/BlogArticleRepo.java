package ec.com.levelap.blog.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ec.com.levelap.blog.entity.BlogArticle;
import ec.com.levelap.blog.entity.BlogArticleLite;
import ec.com.levelap.blog.entity.BlogExtra;

@Repository
public interface BlogArticleRepo extends JpaRepository<BlogArticle, Long> {
	@Query(	"SELECT DISTINCT " +
				"a.id AS id, " +
				"a.title AS title, " +
				"a.status AS status, " +
				"a.creationDate AS creationDate, " +
				"a.category AS category, " +
				"a.isFeatured AS isFeatured " +
			"FROM BlogArticle a " +
				"LEFT JOIN a.tags t " +
			"WHERE " +
				"UPPER(a.title) LIKE UPPER('%' || :title || '%') AND " +
				"(:status IS NULL OR a.status=:status) AND " +
				"DATE(a.creationDate) BETWEEN DATE(:startDate) AND DATE(:endDate) AND " +
				"(:category IS NULL OR a.category=:category) AND " +
				"(:isTagsEmpty=TRUE OR t IN :tags) AND " +
				"(:isFeatured IS NULL OR a.isFeatured=:isFeatured) " +
			"ORDER BY a.creationDate DESC")
	public Page<BlogArticleLite> findArticles(
		@Param("title") String title,
		@Param("status") Boolean status,
		@Param("startDate") Date startDate,
		@Param("endDate") Date endDate,
		@Param("category") BlogExtra category,
		@Param("isTagsEmpty") Boolean isTagsEmpty,
		@Param("tags") List<BlogExtra> tags,
		@Param("isFeatured") Boolean isFeatured,
		Pageable page
	);
}