package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.city.CreateCityRequest;
import kodlamaio.hrms.dtos.requests.city.DeleteCityRequest;
import kodlamaio.hrms.dtos.requests.city.UpdateCityRequest;
import kodlamaio.hrms.dtos.responses.GetAllCityResponses;
import kodlamaio.hrms.entities.concretes.City;

public interface CityService {

	DataResult<List<GetAllCityResponses>> getall();

	Result add(CreateCityRequest createCityRequest);

	Result delete(DeleteCityRequest deleteCityRequest);

	Result update(UpdateCityRequest updateCityRequest);

	DataResult<List<City>> findByCityName(String cityName);
}
