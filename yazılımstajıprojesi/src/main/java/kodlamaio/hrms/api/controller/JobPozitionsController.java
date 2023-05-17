package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.jobPosition.CreateJobPositionRequest;
import kodlamaio.hrms.dtos.requests.jobPosition.DeleteJobPositionRequest;
import kodlamaio.hrms.dtos.requests.jobPosition.UpdateJobPositionRequest;
import kodlamaio.hrms.dtos.responses.GetAllJobPositionResponses;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/jobpozitions")
public class JobPozitionsController {

	private JobPositionService jobPositionService;

	@GetMapping("/getall")
	public DataResult<List<GetAllJobPositionResponses>> getAll() {
		return this.jobPositionService.getAll();

	}

	@PostMapping("/add")
	Result add(@RequestBody @Valid CreateJobPositionRequest createJobPositionRequest) {
		return this.jobPositionService.add(createJobPositionRequest);
	}

	@DeleteMapping("/delete")
	Result delete(DeleteJobPositionRequest deleteJobPositionRequest) {
		return this.jobPositionService.delete(deleteJobPositionRequest);

	}

	@PutMapping("/update")
	Result update(@RequestBody UpdateJobPositionRequest updateJobPositionRequest) {
		return this.jobPositionService.update(updateJobPositionRequest);

	}
}
