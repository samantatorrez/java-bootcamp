package demo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository extends JpaRepository<Meeting, Long>{

	Collection<Meeting> findById(Long id);

}
