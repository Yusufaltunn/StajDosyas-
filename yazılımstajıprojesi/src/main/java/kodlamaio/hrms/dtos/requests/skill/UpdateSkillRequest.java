package kodlamaio.hrms.dtos.requests.skill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSkillRequest {
    
    private int id;
    private String name;
}
