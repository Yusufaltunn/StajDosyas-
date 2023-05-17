package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.socialMedia.CreateSocialMediaRequest;
import kodlamaio.hrms.dtos.requests.socialMedia.DeleteSocialMediaRequest;
import kodlamaio.hrms.dtos.requests.socialMedia.UpdateSocialMediaRequest;
import kodlamaio.hrms.dtos.responses.GetAllSocialMediaResponses;

public interface SocialMediaService {
    
    DataResult<List<GetAllSocialMediaResponses>> getAll();
    Result add(CreateSocialMediaRequest createSocialMediaRequest);
    Result delete(DeleteSocialMediaRequest deleteSocialMediaRequest);
    Result update(UpdateSocialMediaRequest updateSocialMediaRequest);
}
