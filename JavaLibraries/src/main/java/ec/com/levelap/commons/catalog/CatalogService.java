package ec.com.levelap.commons.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {
	@Autowired
	private CatalogRepo catalogRepo;

	public CatalogRepo getCatalogRepo() {
		return catalogRepo;
	}
}
