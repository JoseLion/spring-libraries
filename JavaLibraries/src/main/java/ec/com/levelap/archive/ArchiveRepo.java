package ec.com.levelap.archive;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchiveRepo extends JpaRepository<Archive, Long> {

	Archive findByName(String name);
}
