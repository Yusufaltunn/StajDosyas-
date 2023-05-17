package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.LanguageDao;
import kodlamaio.hrms.dtos.requests.language.CreateLanguageRequest;
import kodlamaio.hrms.dtos.requests.language.DeleteLanguageRequest;
import kodlamaio.hrms.dtos.requests.language.UpdateLanguageRequest;
import kodlamaio.hrms.dtos.responses.GetAllLanguageResponses;
import kodlamaio.hrms.entities.concretes.Language;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {

    private LanguageDao languageDao;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<List<GetAllLanguageResponses>> getAll() {
        List<Language> languages = this.languageDao.findAll();

        List<GetAllLanguageResponses> getAllLanguageResponses = new ArrayList<>();
        for (Language language : languages) {
            GetAllLanguageResponses getAllLanguageResponse = new GetAllLanguageResponses();
            getAllLanguageResponse.setLanguage(language.getLanguage());
            getAllLanguageResponse.setLevel(language.getLevel());

            getAllLanguageResponses.add(getAllLanguageResponse);
        }

        return new DataResult<List<GetAllLanguageResponses>>(getAllLanguageResponses, true, "Dil bilgileri getirildi.");
    }

    @Override
    public Result add(CreateLanguageRequest createLanguageRequest) {
        Language language = this.modelMapperService.forRequest()
                .map(createLanguageRequest, Language.class);

        this.languageDao.save(language);

        return new SuccessResult("Yeni dil eklendi.");
    }

    @Override
    public Result update(UpdateLanguageRequest updateLanguageRequest) {
        Language inDbLanguage = languageDao.findById(updateLanguageRequest.getId()).get();
        Language language = new Language();
        language.setId(updateLanguageRequest.getId());
        language.setLanguage(updateLanguageRequest.getLanguage());
        language.setLevel(updateLanguageRequest.getLevel());

        this.languageDao.save(language);

        return new SuccessResult("Dil bilgileri güncellendi.");
    }

    @Override
    public Result delete(DeleteLanguageRequest deleteLanguageRequest) {

        Language language = this.modelMapperService.forRequest()
                .map(deleteLanguageRequest, Language.class);
        this.languageDao.delete(language);

        return new SuccessResult("Dil bilgileri silindi.");
    }

}
