package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.jobPosition.CreateJobPositionRequest;
import kodlamaio.hrms.dtos.requests.jobPosition.DeleteJobPositionRequest;
import kodlamaio.hrms.dtos.requests.jobPosition.UpdateJobPositionRequest;
import kodlamaio.hrms.dtos.responses.GetAllJobPositionResponses;


public interface JobPositionService {

	DataResult<List<GetAllJobPositionResponses>> getAll();
	
	Result add(CreateJobPositionRequest createJobPositionRequest);

	Result delete(DeleteJobPositionRequest deleteJobPositionRequest);

	Result update(UpdateJobPositionRequest updateJobPositionRequest);
}
