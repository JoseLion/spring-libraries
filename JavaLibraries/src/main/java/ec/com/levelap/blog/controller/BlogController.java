package ec.com.levelap.blog.controller;

import java.util.Date;
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
import ec.com.levelap.blog.entity.BlogExtra;
import ec.com.levelap.blog.service.BlogService;
import ec.com.levelap.blog.util.BlogConst;

@RestController
@RequestMapping(value = "/api/blog", produces = MediaType.APPLICATION_JSON_VALUE)
public class BlogController {
	@Autowired
	private BlogService blogService;
	
	@RequestMapping(value="findArticles", method=RequestMethod.POST)
	public ResponseEntity<Page<BlogArticleLite>> findArticles(@RequestBody(required=false) Search search) throws ServletException {
		if (search == null) {
			search = new Search();
		}
		
		Page<BlogArticleLite> articles = blogService.getBlogArticleRepo().findArticles(search.title, search.status, search.startDate, search.endDate, search.category, search.tags, search.isFeatured, new PageRequest(search.page, BlogConst.TABLE_SIZE));
		
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
	
	@RequestMapping(value="save", method=RequestMethod.POST, consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> save(@RequestPart BlogArticle article, @RequestPart(required=false) MultipartFile banner) throws ServletException {
		return blogService.save(article, banner);
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
