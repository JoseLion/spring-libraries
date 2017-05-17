package ec.com.levelap.blog.service;

import javax.servlet.ServletException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.blog.repository.BlogCommentRepo;
import ec.com.levelap.blog.entity.BlogArticle;
import ec.com.levelap.blog.repository.BlogArticleRepo;

@Service
public class BlogService {
	@Autowired
	private BlogArticleRepo blogArticleRepo;
	
	@Autowired
	private BlogCommentRepo blogCommentRepo;

	public BlogArticleRepo getBlogArticleRepo() {
		return blogArticleRepo;
	}

	public BlogCommentRepo getBlogCommentRepo() {
		return blogCommentRepo;
	}
	
	@Transactional
	public ResponseEntity<?> save(BlogArticle article, MultipartFile banner) throws ServletException {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
