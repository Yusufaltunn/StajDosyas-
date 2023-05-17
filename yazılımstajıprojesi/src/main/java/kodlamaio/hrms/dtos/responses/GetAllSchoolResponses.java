package kodlamaio.hrms.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSchoolResponses {
    
    private int id;
    private String name;
    private String department;
}
