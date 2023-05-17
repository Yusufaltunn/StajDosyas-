package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.employer.CreateEmployerRequest;
import kodlamaio.hrms.dtos.requests.employer.DeleteEmployerRequest;
import kodlamaio.hrms.dtos.requests.employer.UpdateEmployerRequest;
import kodlamaio.hrms.dtos.responses.GetAllEmployerResponses;

public interface EmployerService {

	DataResult<List<GetAllEmployerResponses>> getAll();

	Result add(CreateEmployerRequest createEmployerRequest);

	Result update(UpdateEmployerRequest updateEmployerRequest);

	Result delete(DeleteEmployerRequest deleteEmployerRequest);

	

}
