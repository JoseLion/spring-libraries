package ec.com.levelap.document.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ec.com.levelap.document.entity.DocumentCategory;
import ec.com.levelap.document.entity.DocumentType;

@Repository
public interface DocumentTypeRepo extends JpaRepository<DocumentType, Long> {
	public DocumentType findByCode(String code);
	
	@Query(	"SELECT dt FROM DocumentType dt WHERE " +
				"(:code IS NULL OR dt.code=:code) AND " +
				"(:groupCode IS NULL OR dt.groupCode=:groupCode) AND " +
				"(:category IS NULL OR dt.category=:category) " +
			"ORDER BY dt.name")
	public List<DocumentType> findDocumentType(@Param("code") String code,
			@Param("groupCode") String groupCode,
			@Param("category") DocumentCategory category);
}
