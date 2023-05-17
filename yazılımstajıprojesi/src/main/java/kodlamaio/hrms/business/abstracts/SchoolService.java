package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.school.CreateSchoolRequest;
import kodlamaio.hrms.dtos.requests.school.DeleteSchoolRequest;
import kodlamaio.hrms.dtos.requests.school.UpdateSchoolRequest;
import kodlamaio.hrms.dtos.responses.GetAllSchoolResponses;

public interface SchoolService {
    
    DataResult<List<GetAllSchoolResponses>> getAll();
    Result add(CreateSchoolRequest createSchoolRequest);
    Result update(UpdateSchoolRequest updateSchoolRequest);
    Result delete(DeleteSchoolRequest deleteSchoolRequest);
    
}
