package ec.com.levelap.blog.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ec.com.levelap.archive.Archive;
import ec.com.levelap.archive.ArchiveService;
import ec.com.levelap.base.entity.ErrorControl;
import ec.com.levelap.base.entity.FileData;
import ec.com.levelap.blog.entity.BlogArticle;
import ec.com.levelap.blog.entity.BlogComment;
import ec.com.levelap.blog.entity.BlogExtra;
import ec.com.levelap.blog.repository.BlogArticleRepo;
import ec.com.levelap.blog.repository.BlogCommentRepo;
import ec.com.levelap.blog.repository.BlogExtraRepo;
import ec.com.levelap.blog.repository.BlogTagRepo;

@Service
public class BlogService {
	@Autowired
	private BlogArticleRepo blogArticleRepo;
	
	@Autowired
	private BlogCommentRepo blogCommentRepo;
	
	@Autowired
	private BlogExtraRepo blogExtraRepo;
	
	@Autowired
	private BlogTagRepo blogTagRepo;
	
	@Autowired
	public ArchiveService archiveService;

	public BlogArticleRepo getBlogArticleRepo() {
		return blogArticleRepo;
	}

	public BlogCommentRepo getBlogCommentRepo() {
		return blogCommentRepo;
	}
	
	public BlogExtraRepo getBlogExtraRepo() {
		return blogExtraRepo;
	}
	
	public BlogTagRepo getBlogTagRepo() {
		return blogTagRepo;
	}

	@Transactional
	public ResponseEntity<?> saveArticle(BlogArticle article, MultipartFile banner, MultipartFile diamond, MultipartFile square) throws ServletException, IOException {
		if (banner != null) {
			Archive archive = new Archive();
			
			if (article.getId() != null) {
				BlogArticle original = blogArticleRepo.findOne(article.getId());
				archiveService.deleteFile(original.getBanner().getName(), BlogArticle.class.getSimpleName());
				archive = original.getBanner();
			}
			
			FileData fileData = archiveService.saveFile(banner, BlogArticle.class.getSimpleName());
			
			archive.setModule(BlogArticle.class.getSimpleName());
			archive.setName(fileData.getName());
			archive.setType(banner.getContentType());
			article.setBanner(archive);
		}
		
		if (diamond != null) {
			Archive archive = new Archive();
			
			if (article.getId() != null) {
				BlogArticle original = blogArticleRepo.findOne(article.getId());
				
				if (original.getDiamond() != null) {
					archiveService.deleteFile(original.getDiamond().getName(), BlogArticle.class.getSimpleName());
					archive = original.getDiamond();
				}
			}
			
			FileData fileData = archiveService.saveFile(diamond, BlogArticle.class.getSimpleName());
			
			archive.setModule(BlogArticle.class.getSimpleName());
			archive.setName(fileData.getName());
			archive.setType(diamond.getContentType());
			article.setDiamond(archive);
		}
		
		if (square != null) {
			Archive archive = new Archive();
			
			if (article.getId() != null) {
				BlogArticle original = blogArticleRepo.findOne(article.getId());
				
				if (original.getSquare() != null) {
					archiveService.deleteFile(original.getSquare().getName(), BlogArticle.class.getSimpleName());
					archive = original.getSquare();
				}
			}
			
			FileData fileData = archiveService.saveFile(square, BlogArticle.class.getSimpleName());
			
			archive.setModule(BlogArticle.class.getSimpleName());
			archive.setName(fileData.getName());
			archive.setType(square.getContentType());
			article.setSquare(archive);
		}
		
		if (article.getCategory() != null) {
			if (article.getCategory().getId() == null) {
				article.setCategory(blogExtraRepo.saveAndFlush(article.getCategory()));
			}
		}
		
		if (article.getTags() != null && article.getTags().size() > 0) {
			for (BlogExtra extra : article.getTags()) {
				if (extra.getId() == null) {
					extra = blogExtraRepo.saveAndFlush(extra);
				}
			}
		}
		
		blogArticleRepo.save(article);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@Transactional
	public BlogComment saveComment(BlogComment comment) throws ServletException {
		BlogArticle article = blogArticleRepo.findOne(comment.getArticleId());
		BlogComment parent = null;
		
		if (comment.getParentId() != null) {
			parent = blogCommentRepo.findOne(comment.getParentId());
		}
		
		comment.setBlogArticle(article);
		comment.setParent(parent);
		
		comment = blogCommentRepo.save(comment);
		return comment;
	}
	
	@Transactional
	public ResponseEntity<?> saveBlogExtra(BlogExtra blogExtra) throws ServletException {
		if (blogExtra.getId() == null) {
			BlogExtra found = blogExtraRepo.findByTextAndIsTag(blogExtra.getText(), blogExtra.getIsTag());
			
			if (found != null) {
				return new ResponseEntity<ErrorControl>(new ErrorControl("El registro ingresado ya existe", true), HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} else {
			BlogExtra original = blogExtraRepo.findOne(blogExtra.getId());
			BlogExtra found = blogExtraRepo.findByTextAndTextNotAndIsTag(blogExtra.getText(), original.getText(), blogExtra.getIsTag());
			
			if (found != null) {
				return new ResponseEntity<ErrorControl>(new ErrorControl("El registro ingresado ya existe", true), HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		blogExtra = blogExtraRepo.save(blogExtra);
		return new ResponseEntity<BlogExtra>(blogExtra, HttpStatus.OK);
	}
}
