package ec.com.levelap.commons.catalog;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/catalog", produces = MediaType.APPLICATION_JSON_VALUE)
public class CatalogController {
	@Autowired
	private CatalogService catalogService;
	
	@RequestMapping(value="findAll", method=RequestMethod.GET)
	public ResponseEntity<List<Catalog>> findAll() throws ServletException {
		List<Catalog> catalogs = catalogService.getCatalogRepo().findAllByOrderByName();
		return new ResponseEntity<List<Catalog>>(catalogs, HttpStatus.OK);
	}
	
	@RequestMapping(value="findOne/{id}", method=RequestMethod.GET)
	public ResponseEntity<Catalog> findOne(@PathVariable Long id) throws ServletException {
		Catalog catalog = catalogService.getCatalogRepo().findOne(id);
		return new ResponseEntity<Catalog>(catalog, HttpStatus.OK);
	}
	
	@RequestMapping(value="findOne/{code}", method=RequestMethod.GET)
	public ResponseEntity<Catalog> findOne(@PathVariable String code) throws ServletException {
		Catalog catalog = catalogService.getCatalogRepo().findByCode(code);
		return new ResponseEntity<Catalog>(catalog, HttpStatus.OK);
	}
	
	@RequestMapping(value="findChildrenOf/{code}", method=RequestMethod.GET)
	public ResponseEntity<List<Catalog>> findChildrenOf(@PathVariable String code) throws ServletException {
		List<Catalog> children = catalogService.getCatalogRepo().findByParentCode(code);
		return new ResponseEntity<List<Catalog>>(children, HttpStatus.OK);
	}
}
