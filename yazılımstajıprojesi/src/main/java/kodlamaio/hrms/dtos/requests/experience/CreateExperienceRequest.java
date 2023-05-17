package kodlamaio.hrms.dtos.requests.experience;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateExperienceRequest {

    private int id;

    @NotBlank
    @NotNull
    @Size(min = 2, max = 20)
    private String companyName;

    private Date startingDate;

    private Date leavingDate;

    private boolean isLeave;

    @NotNull
    @NotBlank
    @Size(max = 200)
    private String explanation;

}
