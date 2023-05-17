package kodlamaio.hrms.dtos.requests.jobPosition;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateJobPositionRequest {

    private int id;

    @NotBlank
    @NotNull
    @Size(min = 2, max = 100)
    private String jobs;
}
