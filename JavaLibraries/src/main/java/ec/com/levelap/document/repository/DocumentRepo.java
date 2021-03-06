package ec.com.levelap.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.document.entity.Document;

@Repository
public interface DocumentRepo extends JpaRepository<Document, Long> {
	
}