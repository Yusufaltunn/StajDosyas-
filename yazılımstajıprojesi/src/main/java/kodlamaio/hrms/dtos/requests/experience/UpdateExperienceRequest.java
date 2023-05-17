package kodlamaio.hrms.dtos.requests.experience;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateExperienceRequest {

    private int id;

    private String companyName;

    private Date startingDate;

    private Date leavingDate;

    private boolean isLeave;

    private String explanation;
}
