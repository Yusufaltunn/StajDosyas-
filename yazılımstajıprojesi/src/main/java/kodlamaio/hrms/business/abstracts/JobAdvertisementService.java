package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.jobAdvertiesement.CreateJobAdvertisementRequest;
import kodlamaio.hrms.dtos.requests.jobAdvertiesement.DeleteJobAdvertisementRequest;
import kodlamaio.hrms.dtos.requests.jobAdvertiesement.UpdateJobAdvertisementRequest;
import kodlamaio.hrms.dtos.responses.GetAllJobAdvertisementResponses;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<GetAllJobAdvertisementResponses>> getall();

	Result add(CreateJobAdvertisementRequest createJobAdvertisementRequest);

	Result delete(DeleteJobAdvertisementRequest deleteJobAdvertisementRequest);

	Result update(UpdateJobAdvertisementRequest updateJobAdvertisementRequest);

	DataResult<List<JobAdvertisement>> findByIsActiveTrue();

	DataResult<List<JobAdvertisement>> findByJobDescription(String jobDescription);

	
}
