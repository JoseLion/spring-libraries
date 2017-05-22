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
import ec.com.levelap.blog.entity.BlogArticleOpen;
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

	@Query(value = "SELECT DISTINCT "
			+ "     a.id AS id, "
			+ "     a.title AS title, "
			+ "     a.creationDate AS creationDate, "
			+ "     c AS category, "
			+ "     a.banner AS banner, "
			+ "     a.author AS author, "
			+ "     a.summary AS summary "
			+ "FROM BlogArticle a "
			+ "     LEFT JOIN a.category c "
			+ "     LEFT JOIN a.tags t "
			+ "WHERE "
			+ "     a.status IS TRUE "
			+ "     AND (:isFeatured IS NULL OR a.isFeatured = :isFeatured) "
			+ "     AND (:isMostSeen IS NULL OR a.timesSeen > 0) "
			+ "ORDER BY a.creationDate DESC ")
	public Page<BlogArticleOpen> findArticles(
			@Param("isFeatured") Boolean isFeatured,
			@Param("isMostSeen") Boolean isMostSeen,
			Pageable page);

	@Query(value = "SELECT a.title FROM BlogArticle a WHERE a.id = ?1")
	public String findArtitleTitle(Long id);
	
	@Query(value = "SELECT a.nextVal "
			+ "FROM ( "
			+ "     SELECT "
			+ "          a2.id AS id, "
			+ "          LEAD(a2.id) OVER (ORDER BY a2.id ASC) AS nextVal "
			+ "     FROM blog.blog_article a2"
			+ "     ORDER BY a2.id ASC"
			+ ") AS a "
			+ "WHERE a.id = ?1", nativeQuery = true)
	public Long findNextId(Long id);
	
	@Query(value = "SELECT a.prevVal "
			+ "FROM ( "
			+ "     SELECT "
			+ "          a2.id AS id, "
			+ "          LAG(a2.id) OVER (ORDER BY a2.id ASC) AS prevVal "
			+ "     FROM blog.blog_article a2"
			+ "     ORDER BY a2.id ASC"
			+ ") AS a "
			+ "WHERE a.id = ?1", nativeQuery = true)
	public Long findPrevId(Long id);
	
	@Query(value = "SELECT DISTINCT "
			+ "     a.id AS id, "
			+ "     a.title AS title, "
			+ "     a.creationDate AS creationDate, "
			+ "     c AS category, "
			+ "     a.banner AS banner, "
			+ "     a.author AS author, "
			+ "     a.summary AS summary "
			+ "FROM BlogArticle a "
			+ "     LEFT JOIN a.category c "
			+ "     LEFT JOIN a.tags t "
			+ "WHERE "
			+ "     a.status IS TRUE "
			+ "     AND ("
			+ "          UPPER(a.title) LIKE '%' || UPPER(?1) || '%' "
			+ "          OR UPPER(a.body) LIKE '%' || UPPER(?1) || '%' "
			+ "          OR UPPER(a.summary) LIKE '%' || UPPER(?1) || '%' "
			+ "          OR UPPER(c.text) LIKE '%' || UPPER(?1) || '%' "
			+ "          OR UPPER(t.text) LIKE '%' || UPPER(?1) || '%' "
			+ "     ) "
			+ "ORDER BY a.creationDate DESC ")
	public Page<BlogArticleOpen> searchArticles(String text, Pageable page);
	
}