package kodlamaio.hrms.dtos.requests.school;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSchoolRequest {

    private String name;

    private String department;

    private String educationLevel;

    private Date startingDate;

    private Date completionDate;

    private boolean isGraduate;

}
