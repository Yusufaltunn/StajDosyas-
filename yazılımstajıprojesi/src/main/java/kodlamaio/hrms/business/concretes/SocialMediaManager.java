package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SocialMediaService;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.SocialMediaDao;
import kodlamaio.hrms.dtos.requests.socialMedia.CreateSocialMediaRequest;
import kodlamaio.hrms.dtos.requests.socialMedia.DeleteSocialMediaRequest;
import kodlamaio.hrms.dtos.requests.socialMedia.UpdateSocialMediaRequest;
import kodlamaio.hrms.dtos.responses.GetAllSocialMediaResponses;
import kodlamaio.hrms.entities.concretes.SocialMedia;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SocialMediaManager implements SocialMediaService {

    private SocialMediaDao socialMediaDao;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<List<GetAllSocialMediaResponses>> getAll() {

        List<SocialMedia> socialMedias = socialMediaDao.findAll();
        List<GetAllSocialMediaResponses> getAllSocialMediaResponses = socialMedias.stream()
                .map(socialMedia -> modelMapperService.forResponse()
                        .map(socialMedia, GetAllSocialMediaResponses.class))
                .collect(Collectors.toList());

        return new DataResult<List<GetAllSocialMediaResponses>>(getAllSocialMediaResponses, true, "Data getirildi.");

    }

    @Override
    public Result add(CreateSocialMediaRequest createSocialMediaRequest) {
        SocialMedia socialMedia = modelMapperService.forRequest()
                .map(createSocialMediaRequest, SocialMedia.class);

        this.socialMediaDao.save(socialMedia);
        return new SuccessResult("Sosyal medya hesabı eklendi.");
    }

    @Override
    public Result delete(DeleteSocialMediaRequest deleteSocialMediaRequest) {
        SocialMedia socialMedia = modelMapperService.forRequest()
                .map(deleteSocialMediaRequest, SocialMedia.class);

        this.socialMediaDao.delete(socialMedia);

        return new SuccessResult("Sosyal medya hesabı silindi.");
    }

    @Override
    public Result update(UpdateSocialMediaRequest updateSocialMediaRequest) {
        SocialMedia socialMedia = modelMapperService.forRequest()
        .map(updateSocialMediaRequest, SocialMedia.class);
        
        this.socialMediaDao.save(socialMedia);

        return new SuccessResult("Sosyal medya hesabı güncellendi.");
    }

}
