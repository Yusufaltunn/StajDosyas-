package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.skill.CreateSkillRequest;
import kodlamaio.hrms.dtos.requests.skill.DeleteSkillRequest;
import kodlamaio.hrms.dtos.requests.skill.UpdateSkillRequest;
import kodlamaio.hrms.dtos.responses.GetAllSkillResponses;

public interface SkillService {
    
    DataResult<List<GetAllSkillResponses>> getAll();
    Result add(CreateSkillRequest createSkillsRequest);
    Result update(UpdateSkillRequest updateSkillRequest);
    Result delete(DeleteSkillRequest deleteSkillRequest);
}
