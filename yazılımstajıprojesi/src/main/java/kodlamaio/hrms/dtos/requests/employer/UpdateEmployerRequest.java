package kodlamaio.hrms.dtos.requests.employer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployerRequest {

    private int id;

    private String companyName;

    private String webSite;

    private String phone;

    private String taxNumber;

    private String email;

    private String password;
}
