package kodlamaio.hrms.api.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.jobAdvertiesement.CreateJobAdvertisementRequest;
import kodlamaio.hrms.dtos.requests.jobAdvertiesement.DeleteJobAdvertisementRequest;
import kodlamaio.hrms.dtos.requests.jobAdvertiesement.UpdateJobAdvertisementRequest;
import kodlamaio.hrms.dtos.responses.GetAllJobAdvertisementResponses;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/jobadvertisements")
public class JobAdvertisementsController {

	private JobAdvertisementService jobAdvertisementService;

	@GetMapping("/getall")
	public DataResult<List<GetAllJobAdvertisementResponses>> getall() {
		return this.jobAdvertisementService.getall();
	}

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Result add(@RequestBody @Valid() CreateJobAdvertisementRequest createJobAdvertisementRequest) {

		return this.jobAdvertisementService.add(createJobAdvertisementRequest);
	}

	@DeleteMapping("/delete")
	public Result delete(DeleteJobAdvertisementRequest deleteJobAdvertisementRequest) {
		return this.jobAdvertisementService.delete(deleteJobAdvertisementRequest);
	}

	@PutMapping("/update")
	public Result update(@RequestBody UpdateJobAdvertisementRequest updateJobAdvertisementRequest) {
		return this.jobAdvertisementService.update(updateJobAdvertisementRequest);
	}

	@GetMapping("/findByIsActiveTrue")
	public DataResult<List<JobAdvertisement>> findByIsActiveTrue() {
		return this.jobAdvertisementService.findByIsActiveTrue();
	}

	@GetMapping("/findByJobDescription")
	public DataResult<List<JobAdvertisement>> findByJobDescription(@RequestParam String jobDescription) {
		return this.jobAdvertisementService.findByJobDescription(jobDescription);
	}
}
