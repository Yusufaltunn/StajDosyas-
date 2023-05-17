package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.JobPositionDao;
import kodlamaio.hrms.dtos.requests.jobPosition.CreateJobPositionRequest;
import kodlamaio.hrms.dtos.requests.jobPosition.DeleteJobPositionRequest;
import kodlamaio.hrms.dtos.requests.jobPosition.UpdateJobPositionRequest;
import kodlamaio.hrms.dtos.responses.GetAllJobPositionResponses;
import kodlamaio.hrms.entities.concretes.JobPosition;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	private ModelMapperService modelMapperService;

	@Override
	public DataResult<List<GetAllJobPositionResponses>> getAll() {

		List<JobPosition> jobPositions = jobPositionDao.findAll();
		List<GetAllJobPositionResponses> getAllJobPositionResponses = new ArrayList<>();
		for (JobPosition jobPosition : jobPositions) {
			GetAllJobPositionResponses getAllJobPositionResponse = new GetAllJobPositionResponses();
			getAllJobPositionResponse.setId(jobPosition.getId());
			getAllJobPositionResponse.setJobs(jobPosition.getJobs());

			getAllJobPositionResponses.add(getAllJobPositionResponse);
		}

		return new DataResult<List<GetAllJobPositionResponses>>(getAllJobPositionResponses, true, "Data getirildi.");

	}

	@Override
	public Result add(CreateJobPositionRequest createJobPositionRequest) {
		JobPosition jobPosition = this.modelMapperService.forRequest()
				.map(createJobPositionRequest, JobPosition.class);
				jobPosition.setId(jobPosition.getId());
				jobPosition.setJobAdvertisements(jobPosition.getJobAdvertisements());

		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu eklendi.");
	}

	@Override
	public Result delete(DeleteJobPositionRequest deleteJobPositionRequest) {
		JobPosition jobPosition = this.modelMapperService.forRequest()
				.map(deleteJobPositionRequest, JobPosition.class);

		this.jobPositionDao.delete(jobPosition);
		return new SuccessResult("İş pozisyonu silindi.");
	}

	@Override
	public Result update(UpdateJobPositionRequest updateJobPositionRequest) {
		JobPosition inDbJobPosition = jobPositionDao.findById(updateJobPositionRequest.getId()).get();
		JobPosition jobPosition = new JobPosition();
		jobPosition.setId(updateJobPositionRequest.getId());
		jobPosition.setJobs(updateJobPositionRequest.getJobs());

		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu başarı ile güncellendi.");
	}

}
