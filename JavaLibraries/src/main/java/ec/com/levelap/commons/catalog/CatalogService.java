package ec.com.levelap.commons.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {
	@Autowired
	private CatalogRepository catalogRepository;

	public CatalogRepository getCatalogRepository() {
		return catalogRepository;
	}
}
