package ec.com.levelap.commons.catalog;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long> {
	public List<Catalog> findAllByOrderByName();
	
	public List<Catalog> findByParentCode(String parentCode);
	
	public Catalog findByCode(String code);
}
