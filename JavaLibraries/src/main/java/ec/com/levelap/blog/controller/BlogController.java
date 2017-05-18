package ec.com.levelap.blog.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.blog.entity.BlogArticle;
import ec.com.levelap.blog.entity.BlogArticleLite;
import ec.com.levelap.blog.entity.BlogComment;
import ec.com.levelap.blog.entity.BlogExtra;
import ec.com.levelap.blog.service.BlogService;
import ec.com.levelap.blog.util.BlogConst;

@RestController
@RequestMapping(value = "/api/levelapBlog", produces = MediaType.APPLICATION_JSON_VALUE)
public class BlogController {
	@Autowired
	private BlogService blogService;
	
	@RequestMapping(value="findArticles", method=RequestMethod.POST)
	public ResponseEntity<Page<BlogArticleLite>> findArticles(@RequestBody(required=false) Search search) throws ServletException {
		if (search == null) {
			search = new Search();
		}
		
		Page<BlogArticleLite> articles = blogService.getBlogArticleRepo().findArticles(search.title, search.status, search.startDate, search.endDate, search.category, (search.tags == null || search.tags.isEmpty() ? true : false), search.tags, search.isFeatured, new PageRequest(search.page, BlogConst.TABLE_SIZE));
		
		for (BlogArticleLite lite : articles.getContent()) {
			BlogArticle article = blogService.getBlogArticleRepo().findOne(lite.getId());
			lite.setTags(article.getTags());
		}
		
		return new ResponseEntity<Page<BlogArticleLite>>(articles, HttpStatus.OK);
	}
	
	@RequestMapping(value="findOne/{id}", method=RequestMethod.GET)
	public ResponseEntity<BlogArticle> findOne(@PathVariable Long id) throws ServletException {
		BlogArticle article = blogService.getBlogArticleRepo().findOne(id);
		return new ResponseEntity<BlogArticle>(article, HttpStatus.OK);
	}
	
	@RequestMapping(value="saveArticle", method=RequestMethod.POST, consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> saveArticle(@RequestPart BlogArticle article, @RequestPart(required=false) MultipartFile banner) throws ServletException, IOException {
		return blogService.saveArticle(article, banner);
	}
	
	@RequestMapping(value="findBlogExtra", method=RequestMethod.POST)
	public ResponseEntity<List<BlogExtra>> findBlogExtra(@RequestBody HashMap<String, String> search) throws ServletException {
		String text = search.get("text") != null ? search.get("text") : "";
		List<BlogExtra> extras = blogService.getBlogExtraRepo().findByTextContainingAndIsTag(text, Boolean.parseBoolean(search.get("isTag")));
		return new ResponseEntity<List<BlogExtra>>(extras, HttpStatus.OK);
	}
	
	@RequestMapping(value="getCategories", method=RequestMethod.GET)
	public ResponseEntity<List<BlogExtra>> getCategories() throws ServletException {
		List<BlogExtra> categories = blogService.getBlogExtraRepo().findByStatusIsTrueAndIsTag(false);
		return new ResponseEntity<List<BlogExtra>>(categories, HttpStatus.OK);
	}
	
	@RequestMapping(value="getTags", method=RequestMethod.GET)
	public ResponseEntity<List<BlogExtra>> getTags() throws ServletException {
		List<BlogExtra> tags = blogService.getBlogExtraRepo().findByStatusIsTrueAndIsTag(true);
		return new ResponseEntity<List<BlogExtra>>(tags, HttpStatus.OK);
	}
	
	@RequestMapping(value="changeArticleStatus/{id}", method=RequestMethod.GET)
	public ResponseEntity<Boolean> changeArticleStatus(@PathVariable Long id) throws ServletException {
		BlogArticle article = blogService.getBlogArticleRepo().findOne(id);
		article.setStatus(!article.getStatus());
		article = blogService.getBlogArticleRepo().save(article);
		
		return new ResponseEntity<Boolean>(article.getStatus(), HttpStatus.OK);
	}
	
	@RequestMapping(value="getCommentsOf/{articleId}/{page}")
	public ResponseEntity<Page<BlogComment>> getCommentsOf(@PathVariable Long articleId, @PathVariable(required=false) Integer page) throws ServletException {
		if (page == null) {
			page = 0;
		}
		
		Page<BlogComment> comments = blogService.getBlogCommentRepo().findByBlogArticleId(articleId, new PageRequest(page, BlogConst.TABLE_SIZE));
		
		for (BlogComment comment : comments.getContent()) {
			comment.setChildren(new ArrayList<>());
		}
		
		return new ResponseEntity<Page<BlogComment>>(comments, HttpStatus.OK);
	}
	
	@RequestMapping(value="getRepliesOf/{parentId}", method=RequestMethod.GET)
	public ResponseEntity<List<BlogComment>> getRepliesOf(@PathVariable Long parentId) throws ServletException {
		List<BlogComment> replies = blogService.getBlogCommentRepo().findByParent_Id(parentId);
		return new ResponseEntity<List<BlogComment>>(replies, HttpStatus.OK);
	}
	
	@RequestMapping(value="saveComment", method=RequestMethod.POST)
	public ResponseEntity<BlogComment> saveComment(@RequestBody BlogComment comment) throws ServletException {
		comment = blogService.saveComment(comment);
		return new ResponseEntity<BlogComment>(comment, HttpStatus.OK);
	}
 	
	private static class Search {
		public String title = "";
		
		public Boolean status;
		
		public Date startDate = new Date(0);
		
		public Date endDate = new Date();
		
		public BlogExtra category;
		
		public List<BlogExtra> tags;
		
		public Boolean isFeatured;
		
		public Integer page = 0;
	}
}
