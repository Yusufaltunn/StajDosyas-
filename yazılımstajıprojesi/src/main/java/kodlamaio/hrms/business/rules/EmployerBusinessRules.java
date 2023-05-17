package kodlamaio.hrms.business.rules;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.exceptions.BusinessException;
import kodlamaio.hrms.dataAccess.EmployerDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmployerBusinessRules {

    private EmployerDao employerDao;

    public void checkIfCompanyNameExists(String companyName) {
        if (this.employerDao.existsByCompanyName(companyName)) {
            throw new BusinessException("Company was already exists!");
        }
    }

    public void checkIfTaxNumberExists(String taxNumber) {
        if(this.employerDao.existsByTaxNumber(taxNumber)) {
            throw new BusinessException("Tax number was already exists!");
        }
    }

    public void checkIfWebSiteExists(String webSite) {
        if(this.employerDao.existsByWebSite(webSite)) {
            throw new BusinessException("Website was already exists!");
        }
    }

    public void checkIfEmailExists(String email) {
        if(this.employerDao.existsByEmail(email)) {
            throw new BusinessException("Email was already exists!");
        }
    }
 
    
}
