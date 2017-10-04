package ec.com.levelap.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.document.entity.DocumentType;

@Repository
public interface DocumentTypeRepo extends JpaRepository<DocumentType, Long> {
	
}
