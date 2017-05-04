package ec.com.levelap.commons.location;

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
@RequestMapping(value = "/api/location", produces = MediaType.APPLICATION_JSON_VALUE)
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@RequestMapping(value="findAll", method=RequestMethod.GET)
	public ResponseEntity<List<Location>> findAll() throws ServletException {
		List<Location> locations = locationService.getLocationRepo().findAllByOrderByName();
		return new ResponseEntity<List<Location>>(locations, HttpStatus.OK);
	}
	
	@RequestMapping(value="findOne/{id}", method=RequestMethod.GET)
	public ResponseEntity<Location> findOne(@PathVariable Long id) throws ServletException {
		Location location = locationService.getLocationRepo().findOne(id);
		return new ResponseEntity<Location>(location, HttpStatus.OK);
	}
	
	@RequestMapping(value="findOne/{code}", method=RequestMethod.GET)
	public ResponseEntity<Location> findOne(@PathVariable String code) throws ServletException {
		Location location = locationService.getLocationRepo().findByCode(code);
		return new ResponseEntity<Location>(location, HttpStatus.OK);
	}
	
	@RequestMapping(value="findChildrenOf/{code}", method=RequestMethod.GET)
	public ResponseEntity<List<Location>> findChildrenOf(@PathVariable String code) throws ServletException {
		List<Location> children = locationService.getLocationRepo().findByParentCode(code);
		return new ResponseEntity<List<Location>>(children, HttpStatus.OK);
	}
	
	@RequestMapping(value="changeStatus/{id}", method=RequestMethod.GET)
	public ResponseEntity<Boolean> changeStatus(@PathVariable Long id) throws ServletException {
		Location location = locationService.getLocationRepo().findOne(id);
		location = locationService.changeStatusRecursively(location);
		location = locationService.getLocationRepo().save(location);
		
		return new ResponseEntity<Boolean>(location.getStatus(), HttpStatus.OK);
	}
}
