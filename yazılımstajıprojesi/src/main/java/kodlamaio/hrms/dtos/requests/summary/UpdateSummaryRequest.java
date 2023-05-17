package kodlamaio.hrms.dtos.requests.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSummaryRequest {
    
    private int id;
    private String summary;
}
