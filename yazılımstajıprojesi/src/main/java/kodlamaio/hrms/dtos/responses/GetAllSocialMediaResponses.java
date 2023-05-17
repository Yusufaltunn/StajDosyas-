package kodlamaio.hrms.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSocialMediaResponses {
    
    private int id;
    private String githubUrl;
    private String twitterUrl;
    private String linkedinUrl;
    private String youtubeUrl;
    private String personalityWebsite;
}
