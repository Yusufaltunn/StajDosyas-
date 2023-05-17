package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.city.CreateCityRequest;
import kodlamaio.hrms.dtos.requests.city.DeleteCityRequest;
import kodlamaio.hrms.dtos.requests.city.UpdateCityRequest;
import kodlamaio.hrms.dtos.responses.GetAllCityResponses;
import kodlamaio.hrms.entities.concretes.City;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cities")
@AllArgsConstructor
public class CityController {

	private CityService cityService;

	@GetMapping("/getall")
	public DataResult<List<GetAllCityResponses>> getall() {
		return this.cityService.getall();
	}

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Result add(@RequestBody @Valid CreateCityRequest createCityRequest) {
		return this.cityService.add(createCityRequest);
	}

	@DeleteMapping("/delete")
	public Result delete(DeleteCityRequest deleteCityRequest) {
		return this.cityService.delete(deleteCityRequest);
	}

	@PutMapping("/update")
	public Result update(@RequestBody UpdateCityRequest updateCityRequest) {
		return this.cityService.update(updateCityRequest);
	}

	@GetMapping("/findByCityName")
	DataResult<List<City>> findByCityName(@RequestParam String cityName) {
		return this.cityService.findByCityName(cityName);
	}
}
