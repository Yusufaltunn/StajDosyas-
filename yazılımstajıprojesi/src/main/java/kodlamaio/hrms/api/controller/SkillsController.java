package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlamaio.hrms.business.abstracts.SkillService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.skill.CreateSkillRequest;
import kodlamaio.hrms.dtos.requests.skill.DeleteSkillRequest;
import kodlamaio.hrms.dtos.requests.skill.UpdateSkillRequest;
import kodlamaio.hrms.dtos.responses.GetAllSkillResponses;
import lombok.AllArgsConstructor;

@RequestMapping("/api/skills")
@RestController
@AllArgsConstructor
public class SkillsController {
    
    private SkillService skillService;

    @GetMapping("/getall")
    DataResult<List<GetAllSkillResponses>> getAll() {
        return this.skillService.getAll();
    }
    
    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    Result add(@RequestBody @Valid CreateSkillRequest createSkillsRequest) {
        return this.skillService.add(createSkillsRequest);
    }

    @PutMapping("/update")
    Result update(@RequestBody UpdateSkillRequest updateSkillRequest) {
        return this.skillService.update(updateSkillRequest);
    }

    @DeleteMapping("/delete")
    Result delete(DeleteSkillRequest deleteSkillRequest) {
        return this.skillService.delete(deleteSkillRequest);

    }
}
