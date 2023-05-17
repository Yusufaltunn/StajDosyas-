package kodlamaio.hrms.dtos.requests.jobPosition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateJobPositionRequest {
    
    private int id;
    private String jobs;
}
