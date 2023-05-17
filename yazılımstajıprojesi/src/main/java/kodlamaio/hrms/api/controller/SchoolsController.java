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
import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.school.CreateSchoolRequest;
import kodlamaio.hrms.dtos.requests.school.DeleteSchoolRequest;
import kodlamaio.hrms.dtos.requests.school.UpdateSchoolRequest;
import kodlamaio.hrms.dtos.responses.GetAllSchoolResponses;
import lombok.AllArgsConstructor;

@RequestMapping("/api/schools")
@RestController
@AllArgsConstructor
public class SchoolsController {

    private SchoolService schoolService;

    @GetMapping("/getall")
    public DataResult<List<GetAllSchoolResponses>> getAll() {
        return this.schoolService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Result add(@RequestBody @Valid CreateSchoolRequest createSchoolRequest) {
        return this.schoolService.add(createSchoolRequest);
    }
    
    @PutMapping("/update")
    public Result update(@RequestBody UpdateSchoolRequest updateSchoolRequest) {
        return this.schoolService.update(updateSchoolRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(DeleteSchoolRequest deleteSchoolRequest) {
        return this.schoolService.delete(deleteSchoolRequest);
    }

    
}
