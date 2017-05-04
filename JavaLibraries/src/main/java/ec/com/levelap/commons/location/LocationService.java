package ec.com.levelap.commons.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.levelap.base.service.BaseService;

@Service
public class LocationService extends BaseService<Location> {
	public LocationService() {
		super(Location.class);
	}

	@Autowired
	private LocationRepo locationRepo;

	public LocationRepo getLocationRepo() {
		return locationRepo;
	}
}