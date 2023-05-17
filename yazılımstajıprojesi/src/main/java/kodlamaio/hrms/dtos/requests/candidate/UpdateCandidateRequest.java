package kodlamaio.hrms.dtos.requests.candidate;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCandidateRequest {

    private int id;
    
    private String firstName;

    private String lastName;

    private String identityNumber;

    private Date birthDay;

    private String email;
    
    private String password;
}
