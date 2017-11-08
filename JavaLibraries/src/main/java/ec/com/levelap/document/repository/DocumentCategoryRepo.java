package ec.com.levelap.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.document.entity.DocumentCategory;

@Repository
public interface DocumentCategoryRepo extends JpaRepository<DocumentCategory, Long> {
	public DocumentCategory findByCode(String code);
}
