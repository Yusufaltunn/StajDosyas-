package kodlamaio.hrms.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllJobPositionResponses {

    private int id;

    private String jobs;

}
