package kodlamaio.hrms.dtos.requests.socialMedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSocialMediaRequest {
    
    private int id;
    private String githubUrl;
    private String twitterUrl;
    private String linkedinUrl;
    private String youtubeUrl;
    private String personalityWebsite;
}
