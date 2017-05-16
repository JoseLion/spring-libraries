package ec.com.levelap.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.blog.entity.BlogExtra;

@Repository
public interface BlogExtraRepo extends JpaRepository<BlogExtra, Long> {
	
}