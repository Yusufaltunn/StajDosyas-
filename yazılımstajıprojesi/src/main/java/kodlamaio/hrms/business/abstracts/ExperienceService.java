package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.experience.CreateExperienceRequest;
import kodlamaio.hrms.dtos.requests.experience.DeleteExperienceRequest;
import kodlamaio.hrms.dtos.requests.experience.UpdateExperienceRequest;
import kodlamaio.hrms.dtos.responses.GetAllExperienceResponses;

public interface ExperienceService {
    
    DataResult<List<GetAllExperienceResponses>> getAll();
    Result add(CreateExperienceRequest createExperienceRequest);
    Result update(UpdateExperienceRequest updateExperienceRequest);
    Result delete(DeleteExperienceRequest deleteExperienceRequest);
}
