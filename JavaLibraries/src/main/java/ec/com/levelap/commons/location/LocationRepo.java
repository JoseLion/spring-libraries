package ec.com.levelap.commons.location;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location, Long> {
	public List<Location> findAllByOrderByName();
	
	public List<Location> findByParentCode(String parentCode);
	
	public Location findByCode(String code);
}