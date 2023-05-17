package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.CityDao;
import kodlamaio.hrms.dtos.requests.city.CreateCityRequest;
import kodlamaio.hrms.dtos.requests.city.DeleteCityRequest;
import kodlamaio.hrms.dtos.requests.city.UpdateCityRequest;
import kodlamaio.hrms.dtos.responses.GetAllCityResponses;
import kodlamaio.hrms.entities.concretes.City;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CityManager implements CityService {

	private CityDao cityDao;
	private ModelMapperService modelMapperService;

	@Override
	public DataResult<List<GetAllCityResponses>> getall() {

		List<City> cities = cityDao.findAll();

		List<GetAllCityResponses> getAllCityResponses = cities.stream()
				.map(city -> this.modelMapperService.forResponse()
						.map(city, GetAllCityResponses.class))
				.collect(Collectors.toList());

		return new DataResult<List<GetAllCityResponses>>(getAllCityResponses, true, "City list brought!");
	}

	@Override
	public Result add(CreateCityRequest createCityRequest) {
		City city = this.modelMapperService.forRequest()
		.map(createCityRequest, City.class);

		this.cityDao.save(city);
		return new SuccessResult("The city has been added to the system!");
	}

	@Override
	public Result delete(DeleteCityRequest deleteCityRequest) {
		City city = this.modelMapperService.forRequest()
				.map(deleteCityRequest, City.class);
		this.cityDao.delete(city);
		return new SuccessResult("The city has been deleted from the system!");
	}

	@Override
	public Result update(UpdateCityRequest updateCityRequest) {
		City city = this.modelMapperService.forRequest()
		.map(updateCityRequest, City.class);
		this.cityDao.save(city);

		return new SuccessResult("City information updated!");
	}

	@Override
	public DataResult<List<City>> findByCityName(String cityName) {

		return new SuccessDataResult<List<City>>(this.cityDao.findByCityName(cityName), "Cities are listed!");
	}

	

}
