package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.summary.CreateSummaryRequest;
import kodlamaio.hrms.dtos.requests.summary.DeleteSummaryRequest;
import kodlamaio.hrms.dtos.requests.summary.UpdateSummaryRequest;
import kodlamaio.hrms.dtos.responses.GetAllSummaryResponses;

public interface SummaryService {
    
    DataResult<List<GetAllSummaryResponses>> getAll();
    Result add(CreateSummaryRequest createSummaryRequest);
    Result delete(DeleteSummaryRequest deleteSummaryRequest);
    Result update(UpdateSummaryRequest updateSummaryRequest);
}
