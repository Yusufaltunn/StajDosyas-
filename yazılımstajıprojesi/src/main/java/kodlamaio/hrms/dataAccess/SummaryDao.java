package kodlamaio.hrms.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.Summary;

@Repository
public interface SummaryDao extends JpaRepository<Summary, Integer>{
    
}
