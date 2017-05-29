package ec.com.levelap.blog.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec.com.levelap.blog.entity.BlogArticle;
import ec.com.levelap.blog.entity.BlogArticleOpen;
import ec.com.levelap.blog.entity.BlogComment;
import ec.com.levelap.blog.entity.BlogExtra;
import ec.com.levelap.blog.service.BlogService;

@RestController
@RequestMapping(value = "/open/levelapBlog", produces = MediaType.APPLICATION_JSON_VALUE)
public class BlogOpenController {

	@Value("${levelap.blog.comment-page-size}")
	private Integer commentPageSize;

	@Value("${levelap.blog.home-page-size}")
	private Integer homePageSize;

	@Value("${levelap.blog.important-size}")
	private Integer importantSize;

	@Value("${levelap.blog.most-seen-size}")
	private Integer mostSeenSize;

	@Value("${levelap.blog.search-size}")
	private Integer searchSize;

	@Autowired
	private BlogService blogService;

	@RequestMapping(value = "findOne/{id}", method = RequestMethod.GET)
	public ResponseEntity<BlogArticle> findOne(@PathVariable Long id) throws ServletException {
		BlogArticle article = this.blogService.getBlogArticleRepo().findOne(id);
		article.setNextArticleId(this.blogService.getBlogArticleRepo().findNextId(article.getId()));
		article.setNextArticleTitle(this.blogService.getBlogArticleRepo().findArtitleTitle(article.getNextArticleId()));
		article.setPrevArticleId(this.blogService.getBlogArticleRepo().findPrevId(article.getId()));
		article.setPrevArticleTitle(this.blogService.getBlogArticleRepo().findArtitleTitle(article.getPrevArticleId()));
		return new ResponseEntity<BlogArticle>(article, HttpStatus.OK);
	}

	@RequestMapping(value = "getCategories", method = RequestMethod.GET)
	public ResponseEntity<List<BlogExtra>> getCategories() throws ServletException {
		List<BlogExtra> categories = blogService.getBlogExtraRepo().findByStatusIsTrueAndIsTag(false);
		return new ResponseEntity<List<BlogExtra>>(categories, HttpStatus.OK);
	}

	@RequestMapping(value = "getTags", method = RequestMethod.GET)
	public ResponseEntity<List<BlogExtra>> getTags() throws ServletException {
		List<BlogExtra> tags = blogService.getBlogExtraRepo().findByStatusIsTrueAndIsTag(true);
		return new ResponseEntity<List<BlogExtra>>(tags, HttpStatus.OK);
	}

	@RequestMapping(value = "getCommentsOf/{articleId}/{page}")
	public ResponseEntity<Page<BlogComment>> getCommentsOf(@PathVariable Long articleId, @PathVariable(required = false) Integer page) throws ServletException {
		if (page == null) {
			page = 0;
		}

		Page<BlogComment> comments = blogService.getBlogCommentRepo().findByParentIsNullAndBlogArticleIdAndStatusIsTrueOrderByCreationDateDesc(articleId, new PageRequest(page, commentPageSize));
		return new ResponseEntity<Page<BlogComment>>(comments, HttpStatus.OK);
	}

	@RequestMapping(value = "getRepliesOf/{parentId}/{page}", method = RequestMethod.GET)
	public ResponseEntity<Page<BlogComment>> getRepliesOf(@PathVariable Long parentId, @PathVariable(required = false) Integer page) throws ServletException {
		if (page == null) {
			page = 0;
		}

		Page<BlogComment> replies = blogService.getBlogCommentRepo().findByParent_IdAndStatusIsTrueOrderByCreationDateDesc(parentId, new PageRequest(page, commentPageSize));
		return new ResponseEntity<Page<BlogComment>>(replies, HttpStatus.OK);
	}

	@RequestMapping(value = "saveComment", method = RequestMethod.POST)
	public ResponseEntity<BlogComment> saveComment(@RequestBody BlogComment comment) throws ServletException {
		comment = blogService.saveComment(comment);
		return new ResponseEntity<BlogComment>(comment, HttpStatus.OK);
	}

	@RequestMapping(value = "findArticles", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> findArticles(@RequestBody Search search) throws ServletException {
		if (search.isHomePage != null && search.isHomePage) {
			Page<BlogArticleOpen> articles = this.blogService.getBlogArticleRepo().findArticles(search.isFeatured, search.isMostSeen, new PageRequest(search.page, homePageSize));
			return new ResponseEntity<>(this.setTagsOnOpen(articles), HttpStatus.OK);
		} else if (search.isFeatured != null && search.isFeatured) {
			return new ResponseEntity<>(this.blogService.getBlogArticleRepo().findArticles(search.isFeatured, search.isMostSeen, new PageRequest(search.page, importantSize)), HttpStatus.OK);
		} else if (search.isMostSeen != null && search.isMostSeen) {
			return new ResponseEntity<>(this.blogService.getBlogArticleRepo().findArticles(search.isFeatured, search.isMostSeen, new PageRequest(search.page, mostSeenSize)), HttpStatus.OK);
		} else if (search.isSearch != null && search.isSearch) {
			if(search.text == null) {
				search.text = "";
			}
			Page<BlogArticleOpen> articles = this.blogService.getBlogArticleRepo().searchArticles(search.text, new PageRequest(search.page, searchSize));
			return new ResponseEntity<>(this.setTagsOnOpen(articles), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	private Page<BlogArticleOpen> setTagsOnOpen(Page<BlogArticleOpen> articles) {
		articles.getContent().forEach(article -> {
			List<BlogExtra> extras = new ArrayList<>();
			this.blogService.getBlogTagRepo().findByBlogArticleId(article.getId()).forEach(tag -> {
				extras.add(tag.getBlogExtra());
			});
			article.setTags(extras);
		});
		return articles;
	}

	private static class Search {

		public Boolean isHomePage;

		public Boolean isFeatured;

		public Boolean isMostSeen;

		public Boolean isSearch;

		public String text;

		public Integer page = 0;

	}

}
