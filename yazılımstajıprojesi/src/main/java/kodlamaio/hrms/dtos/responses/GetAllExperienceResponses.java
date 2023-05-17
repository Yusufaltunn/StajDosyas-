package kodlamaio.hrms.dtos.responses;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllExperienceResponses {
    
    private int id;
    private String companyName;
    private Date startingDate;
    private Date leavingDate;
    private boolean isLeave;
    private String explanation;
    
}
