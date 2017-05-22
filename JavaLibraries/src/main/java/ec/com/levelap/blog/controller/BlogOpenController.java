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
import ec.com.levelap.blog.entity.BlogComment;
import ec.com.levelap.blog.entity.BlogExtra;
import ec.com.levelap.blog.service.BlogService;
import ec.com.levelap.blog.util.BlogConst;

@RestController
@RequestMapping(value = "/open/levelapBlog", produces = MediaType.APPLICATION_JSON_VALUE)
public class BlogOpenController {
	@Value("${levelap.blog.comment-page-size}")
	private Integer commentPageSize;
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping(value="findOne/{id}", method=RequestMethod.GET)
	public ResponseEntity<BlogArticle> findOne(@PathVariable Long id) throws ServletException {
		BlogArticle article = blogService.getBlogArticleRepo().findOne(id);
		return new ResponseEntity<BlogArticle>(article, HttpStatus.OK);
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
}
