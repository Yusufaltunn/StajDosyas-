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
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.candidate.CreateCandidateRequest;
import kodlamaio.hrms.dtos.requests.candidate.DeleteCandidateRequest;
import kodlamaio.hrms.dtos.requests.candidate.UpdateCandidateRequest;
import kodlamaio.hrms.dtos.responses.GetAllCandidateResponses;
import lombok.AllArgsConstructor;


@RequestMapping("/api/candidates")
@RestController
@AllArgsConstructor
public class CandidatesController {

	private CandidateService candidateService;

	@GetMapping("/getall")
	public DataResult<List<GetAllCandidateResponses>> getAll() {
		return this.candidateService.getAll();
	}

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Result add(@RequestBody() @Valid() CreateCandidateRequest createCandidateRequest) {
		return this.candidateService.add(createCandidateRequest);
	}

	@DeleteMapping("/delete")
	public Result delete(DeleteCandidateRequest deleteCandidateRequest) {
		return this.candidateService.delete(deleteCandidateRequest);
	}

	@PutMapping("/update")
	public Result update(@RequestBody UpdateCandidateRequest updateCandidateRequest) {
		return this.candidateService.update(updateCandidateRequest);
	}

}
