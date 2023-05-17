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
import kodlamaio.hrms.business.abstracts.SummaryService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.summary.CreateSummaryRequest;
import kodlamaio.hrms.dtos.requests.summary.DeleteSummaryRequest;
import kodlamaio.hrms.dtos.requests.summary.UpdateSummaryRequest;
import kodlamaio.hrms.dtos.responses.GetAllSummaryResponses;
import lombok.AllArgsConstructor;

@RequestMapping("/api/summaries")
@RestController
@AllArgsConstructor
public class SummariesController {
    
    private SummaryService summaryService;

    @GetMapping("/getall")
    DataResult<List<GetAllSummaryResponses>> getAll() {
        return this.summaryService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    Result add(@RequestBody @Valid CreateSummaryRequest createSummaryRequest) {
        return this.summaryService.add(createSummaryRequest);

    }

    @DeleteMapping("/delete")
    Result delete(DeleteSummaryRequest deleteSummaryRequest) {
       return this.summaryService.delete(deleteSummaryRequest);

    }

    @PutMapping("/update")
    Result update(@RequestBody UpdateSummaryRequest updateSummaryRequest) {
        return this.summaryService.update(updateSummaryRequest);

    }
}
