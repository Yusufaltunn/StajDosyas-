package kodlamaio.hrms.dtos.requests.summary;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSummaryRequest {
    
    @NotNull
    @NotBlank
    @Size(min = 20, max = 250)
    private String summary;
}
