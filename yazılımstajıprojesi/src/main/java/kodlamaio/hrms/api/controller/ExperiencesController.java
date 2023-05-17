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
import kodlamaio.hrms.business.abstracts.ExperienceService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.experience.CreateExperienceRequest;
import kodlamaio.hrms.dtos.requests.experience.DeleteExperienceRequest;
import kodlamaio.hrms.dtos.requests.experience.UpdateExperienceRequest;
import kodlamaio.hrms.dtos.responses.GetAllExperienceResponses;
import lombok.AllArgsConstructor;

@RequestMapping("/api/experiences")
@RestController
@AllArgsConstructor
public class ExperiencesController {

    private ExperienceService experienceService;

    @GetMapping("/getall")
    public DataResult<List<GetAllExperienceResponses>> getAll() {
        return this.experienceService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Result add(@RequestBody @Valid() CreateExperienceRequest createExperienceRequest) {
       return this.experienceService.add(createExperienceRequest);

    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateExperienceRequest updateExperienceRequest) {
        return this.experienceService.update(updateExperienceRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(DeleteExperienceRequest deleteExperienceRequest) {
        return this.experienceService.delete(deleteExperienceRequest);
    }
}
