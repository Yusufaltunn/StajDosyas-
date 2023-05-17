package kodlamaio.hrms.business.rules;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.exceptions.BusinessException;
import kodlamaio.hrms.dataAccess.CandidateDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CandidateBusinessRules {

    private CandidateDao candidateDao;

    public void checkIfCandidateIdentityNumberExists(String identityNumber) {

        if (this.candidateDao.existsByIdentityNumber(identityNumber)) {
            throw new BusinessException("Candidate was already exists!");
        }
    }

    public void checkIfEmailExists(String email) {
        if(this.candidateDao.existsByEmail(email)) {
            throw new BusinessException("Email was already exists!");

        }
    }
}
