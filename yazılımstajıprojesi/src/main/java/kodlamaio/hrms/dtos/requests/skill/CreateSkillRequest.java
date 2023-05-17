package kodlamaio.hrms.dtos.requests.skill;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSkillRequest {
    
    @Size(max = 25)
    @NotBlank
    @NotNull
    private String name;
}
