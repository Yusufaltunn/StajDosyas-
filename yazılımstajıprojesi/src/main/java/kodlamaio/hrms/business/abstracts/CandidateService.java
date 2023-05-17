package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.candidate.CreateCandidateRequest;
import kodlamaio.hrms.dtos.requests.candidate.DeleteCandidateRequest;
import kodlamaio.hrms.dtos.requests.candidate.UpdateCandidateRequest;
import kodlamaio.hrms.dtos.responses.GetAllCandidateResponses;

public interface CandidateService {

	DataResult<List<GetAllCandidateResponses>> getAll();
	
	Result add(CreateCandidateRequest createCandidateRequest);

	Result delete(DeleteCandidateRequest deleteCandidateRequest);

	Result update(UpdateCandidateRequest updateCandidateRequest);
	
}
