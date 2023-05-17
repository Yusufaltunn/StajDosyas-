package kodlamaio.hrms.dtos.requests.employer;

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
public class CreateEmployerRequest {

    @NotBlank
    @NotNull
    @Size(min = 2, max = 30)
    private String companyName;

    @NotNull
    @NotBlank
    private String webSite;

    @NotBlank
    @NotNull
    private String phone;

    @NotBlank
    @NotNull
    @Size(min = 10, max = 10)
    private String taxNumber;

    @NotBlank
    @NotNull
    @Email
    private String email;

    @NotBlank
    @NotNull
    @Size(min = 6, max = 12)
    private String password;
}
