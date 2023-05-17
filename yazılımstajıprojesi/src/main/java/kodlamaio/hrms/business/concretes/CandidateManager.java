package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.rules.CandidateBusinessRules;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.CandidateDao;
import kodlamaio.hrms.dtos.requests.candidate.CreateCandidateRequest;
import kodlamaio.hrms.dtos.requests.candidate.DeleteCandidateRequest;
import kodlamaio.hrms.dtos.requests.candidate.UpdateCandidateRequest;
import kodlamaio.hrms.dtos.responses.GetAllCandidateResponses;
import kodlamaio.hrms.entities.concretes.Candidate;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private ModelMapperService modelMapperService;
	private CandidateBusinessRules candidateBusinessRules;

	@Override
	public DataResult<List<GetAllCandidateResponses>> getAll() {

		List<Candidate> candidates = candidateDao.findAll();

		List<GetAllCandidateResponses> getAllCandidateResponses = candidates.stream()
				.map(candidate -> this.modelMapperService.forResponse()
						.map(candidate, GetAllCandidateResponses.class))
				.collect(Collectors.toList());

		return new DataResult<List<GetAllCandidateResponses>>(getAllCandidateResponses, true,
				"Employee information brought!");

	}

	@Override
	public Result add(CreateCandidateRequest createCandidateRequest) {

		this.candidateBusinessRules.checkIfCandidateIdentityNumberExists(createCandidateRequest.getIdentityNumber());

		Candidate candidate = this.modelMapperService.forRequest()
				.map(createCandidateRequest, Candidate.class);

		this.candidateDao.save(candidate);
		return new SuccessResult("The candidate has been added to the system!");
	}

	@Override
	public Result delete(DeleteCandidateRequest deleteCandidateRequest) {

		Candidate candidate = this.modelMapperService.forRequest()
				.map(deleteCandidateRequest, Candidate.class);
		this.candidateDao.delete(candidate);
		return new SuccessResult("The candidate has been deleted from the system!");
	}

	@Override
	public Result update(UpdateCandidateRequest updateCandidateRequest) {
		Candidate inDbCandidate = candidateDao.findById(updateCandidateRequest.getId()).get();
		Candidate candidate = new Candidate();
		candidate.setId(updateCandidateRequest.getId());
		candidate.setFirstName(updateCandidateRequest.getFirstName());
		candidate.setLastName(updateCandidateRequest.getLastName());
		candidate.setIdentityNumber(updateCandidateRequest.getIdentityNumber());
		candidate.setEmail(updateCandidateRequest.getEmail());
		candidate.setPassword(updateCandidateRequest.getPassword());

		this.candidateDao.save(candidate);

		return new SuccessResult("Candidate updated successfully!");
	}

}
