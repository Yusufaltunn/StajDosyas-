package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.SchoolDao;
import kodlamaio.hrms.dtos.requests.school.CreateSchoolRequest;
import kodlamaio.hrms.dtos.requests.school.DeleteSchoolRequest;
import kodlamaio.hrms.dtos.requests.school.UpdateSchoolRequest;
import kodlamaio.hrms.dtos.responses.GetAllSchoolResponses;
import kodlamaio.hrms.entities.concretes.School;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SchoolManager implements SchoolService {

  private SchoolDao schoolDao;
  private ModelMapperService modelMapperService;

  @Override
  public DataResult<List<GetAllSchoolResponses>> getAll() {
    List<School> schools = schoolDao.findAll();
    List<GetAllSchoolResponses> getAllSchoolResponses = new ArrayList<>();
    for (School school : schools) {
      GetAllSchoolResponses getAllSchoolResponse = new GetAllSchoolResponses();
      getAllSchoolResponse.setId(school.getId());
      getAllSchoolResponse.setName(school.getName());
      getAllSchoolResponse.setDepartment(school.getDepartment());

      getAllSchoolResponses.add(getAllSchoolResponse);
    }

    return new DataResult<List<GetAllSchoolResponses>>(getAllSchoolResponses, true, "Data getirildi");

  }

  @Override
  public Result add(CreateSchoolRequest createSchoolRequest) {
    School school = this.modelMapperService.forRequest()
        .map(createSchoolRequest, School.class);

    this.schoolDao.save(school);

    return new SuccessResult("Okul bilgileri eklendi.");
  }

  @Override
  public Result update(UpdateSchoolRequest updateSchoolRequest) {
    School school = this.modelMapperService.forRequest()
        .map(updateSchoolRequest, School.class);

    this.schoolDao.save(school);

    return new SuccessResult("Okul bilgieri güncellendi.");
  }

  @Override
  public Result delete(DeleteSchoolRequest deleteSchoolRequest) {
    School school = this.modelMapperService.forRequest()
        .map(deleteSchoolRequest, School.class);

        this.schoolDao.delete(school);

        return new SuccessResult("Okul bilgisi başarı ile silindi.");
  }

}
