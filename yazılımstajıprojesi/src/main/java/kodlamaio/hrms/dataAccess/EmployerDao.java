package kodlamaio.hrms.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.Employer;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {

    boolean existsByCompanyName(String name);
    boolean existsByTaxNumber(String taxNumber);
    boolean existsByWebSite(String webSite);
    boolean existsByEmail(String email);
    

}
