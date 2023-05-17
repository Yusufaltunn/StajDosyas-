package kodlamaio.hrms.api.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.employer.CreateEmployerRequest;
import kodlamaio.hrms.dtos.requests.employer.DeleteEmployerRequest;
import kodlamaio.hrms.dtos.requests.employer.UpdateEmployerRequest;
import kodlamaio.hrms.dtos.responses.GetAllEmployerResponses;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployerService employerService;

	@GetMapping("/getall")
	public DataResult<List<GetAllEmployerResponses>> getAll() {
		return this.employerService.getAll();
	}

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Result add(@RequestBody @Valid() CreateEmployerRequest createEmployerRequest) {
		return this.employerService.add(createEmployerRequest);
	}

	@PutMapping("/update")
	public Result update( @RequestBody UpdateEmployerRequest updateEmployerRequest) {
		return this.employerService.update(updateEmployerRequest);
	}

	@DeleteMapping("/delete")
	public Result delete(DeleteEmployerRequest deleteEmployerRequest) {
		return this.employerService.delete(deleteEmployerRequest);
	}

}
