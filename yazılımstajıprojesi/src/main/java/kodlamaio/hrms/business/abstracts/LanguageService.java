package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.language.CreateLanguageRequest;
import kodlamaio.hrms.dtos.requests.language.DeleteLanguageRequest;
import kodlamaio.hrms.dtos.requests.language.UpdateLanguageRequest;
import kodlamaio.hrms.dtos.responses.GetAllLanguageResponses;

public interface LanguageService {
    
    DataResult<List<GetAllLanguageResponses>> getAll();

    Result add(CreateLanguageRequest createLanguageRequest);

    Result update(UpdateLanguageRequest updateLanguageRequest);

    Result delete(DeleteLanguageRequest deleteLanguageRequest);
   
}
