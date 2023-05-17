package kodlamaio.hrms.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.School;

@Repository
public interface SchoolDao extends JpaRepository<School, Integer> {
    
}
