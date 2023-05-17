package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.rules.EmployerBusinessRules;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.EmployerDao;
import kodlamaio.hrms.dtos.requests.employer.CreateEmployerRequest;
import kodlamaio.hrms.dtos.requests.employer.DeleteEmployerRequest;
import kodlamaio.hrms.dtos.requests.employer.UpdateEmployerRequest;
import kodlamaio.hrms.dtos.responses.GetAllEmployerResponses;
import kodlamaio.hrms.entities.concretes.Employer;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private ModelMapperService modelMapperService;
	private EmployerBusinessRules employerBusinessRules;

	@Override
	public DataResult<List<GetAllEmployerResponses>> getAll() {

		List<Employer> employers = this.employerDao.findAll();

		List<GetAllEmployerResponses> getAllEmployerResponses = employers.stream()
				.map(employer -> modelMapperService.forResponse()
						.map(employer, GetAllEmployerResponses.class))
				.collect(Collectors.toList());

		return new DataResult<List<GetAllEmployerResponses>>(getAllEmployerResponses, true,
				"Employer information brought!");
	}

	@Override
	public Result add(CreateEmployerRequest createEmployerRequest) {

		this.employerBusinessRules.checkIfCompanyNameExists(createEmployerRequest.getCompanyName());
		this.employerBusinessRules.checkIfTaxNumberExists(createEmployerRequest.getTaxNumber());
		this.employerBusinessRules.checkIfWebSiteExists(createEmployerRequest.getWebSite());

		Employer employer = this.modelMapperService.forRequest()
				.map(createEmployerRequest,
						Employer.class);

		this.employerDao.save(employer);
		return new SuccessResult("New employer added!");
	}

	@Override
	public Result update(UpdateEmployerRequest updateEmployerRequest) {
		Employer inDbEmployer = employerDao.findById(updateEmployerRequest.getId()).get();
		Employer employer = new Employer();
		employer.setId(updateEmployerRequest.getId());
		employer.setCompanyName(updateEmployerRequest.getCompanyName());
		employer.setEmail(updateEmployerRequest.getEmail());
		employer.setPassword(updateEmployerRequest.getPassword());
		employer.setPhone(updateEmployerRequest.getPhone());
		employer.setTaxNumber(updateEmployerRequest.getTaxNumber());
		employer.setWebSite(updateEmployerRequest.getWebSite());

		this.employerDao.save(employer);
		return new SuccessResult("Employer information updated!");
	}

	@Override
	public Result delete(DeleteEmployerRequest deleteEmployerRequest) {
		Employer employer = this.modelMapperService.forRequest()
				.map(deleteEmployerRequest, Employer.class);
		this.employerDao.delete(employer);

		return new SuccessResult("Employer deleted!");
	}
}
