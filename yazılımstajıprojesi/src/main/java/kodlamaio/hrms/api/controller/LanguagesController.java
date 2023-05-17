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
import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.language.CreateLanguageRequest;
import kodlamaio.hrms.dtos.requests.language.DeleteLanguageRequest;
import kodlamaio.hrms.dtos.requests.language.UpdateLanguageRequest;
import kodlamaio.hrms.dtos.responses.GetAllLanguageResponses;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/languages")
public class LanguagesController {
    
    private LanguageService languageService;

    @GetMapping("/getall")
    public DataResult<List<GetAllLanguageResponses>> getAll() {
        return this.languageService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Result add(@RequestBody @Valid() CreateLanguageRequest createLanguageRequest) {
        return this.languageService.add(createLanguageRequest);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateLanguageRequest updateLanguageRequest) {
        return this.languageService.update(updateLanguageRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(DeleteLanguageRequest deleteLanguageRequest) {
        return this.languageService.delete(deleteLanguageRequest);
    }
    
}
