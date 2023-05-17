package kodlamaio.hrms.dtos.requests.socialMedia;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSocialMediaRequest {

    @URL
    private String githubUrl;

    @URL
    private String twitterUrl;

    @URL
    private String linkedinUrl;

    @URL
    private String youtubeUrl;

    @URL
    private String personalityWebsite;
}
