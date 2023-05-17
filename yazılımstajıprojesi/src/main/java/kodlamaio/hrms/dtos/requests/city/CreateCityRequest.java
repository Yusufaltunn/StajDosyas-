package kodlamaio.hrms.dtos.requests.city;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCityRequest {

    
    @NotBlank
    @NotNull
    @Size(min = 2, max = 25)
    private String cityName;
}
