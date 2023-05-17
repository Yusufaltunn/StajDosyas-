package kodlamaio.hrms.dtos.requests.candidate;

import java.sql.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCandidateRequest {

    private int id;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20)
    private String firstName;

    @NotNull
    @NotBlank
    @Size(min = 2, max = 20)
    private String lastName;

    @NotNull
    @NotBlank
    @Size(min = 11, max = 11)
    private String identityNumber;

    @NotNull
    private Date birthDay;

    @NotNull
    @NotBlank
    @Email
    private String email;

    @NotNull
    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

}
