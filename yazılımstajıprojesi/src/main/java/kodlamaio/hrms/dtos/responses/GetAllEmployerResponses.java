package kodlamaio.hrms.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEmployerResponses {
    
    private int id;
    private String companyName;
    private String webSite;
}
