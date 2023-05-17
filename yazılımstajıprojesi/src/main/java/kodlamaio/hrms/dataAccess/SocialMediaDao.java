package kodlamaio.hrms.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.SocialMedia;

@Repository
public interface SocialMediaDao extends JpaRepository<SocialMedia, Integer> {
    
}
