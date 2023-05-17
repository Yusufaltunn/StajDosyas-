package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ExperienceService;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.ExperienceDao;
import kodlamaio.hrms.dtos.requests.experience.CreateExperienceRequest;
import kodlamaio.hrms.dtos.requests.experience.DeleteExperienceRequest;
import kodlamaio.hrms.dtos.requests.experience.UpdateExperienceRequest;
import kodlamaio.hrms.dtos.responses.GetAllExperienceResponses;
import kodlamaio.hrms.entities.concretes.Experience;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ExperienceManager implements ExperienceService {

        private ExperienceDao experienceDao;
        private ModelMapperService modelMapperService;

        @Override
        public DataResult<List<GetAllExperienceResponses>> getAll() {
                List<Experience> experiences = experienceDao.findAll();
                List<GetAllExperienceResponses> getAllExperienceResponses = experiences.stream()
                                .map(experience -> modelMapperService.forResponse()
                                                .map(experience, GetAllExperienceResponses.class))
                                .collect(Collectors.toList());

                return new DataResult<List<GetAllExperienceResponses>>(getAllExperienceResponses, true,
                                "Deneyimler listelendi.");
        }

        @Override
        public Result add(CreateExperienceRequest createExperienceRequest) {
                Experience experience = this.modelMapperService.forRequest()
                                .map(createExperienceRequest, Experience.class);
                               
                                

                this.experienceDao.save(experience);
                return new SuccessResult("Yeni deneyim eklendi.");
        }

        @Override
        public Result update(UpdateExperienceRequest updateExperienceRequest) {

                Experience inDbExperience = experienceDao.findById(updateExperienceRequest.getId()).get();

                Experience experience = new Experience();
                experience.setId(updateExperienceRequest.getId());
                experience.setCompanyName(updateExperienceRequest.getCompanyName());
                experience.setExplanation(updateExperienceRequest.getExplanation());
                experience.setLeave(true);
                experience.setLeavingDate(updateExperienceRequest.getLeavingDate());
                experience.setStartingDate(updateExperienceRequest.getStartingDate());

                this.experienceDao.save(experience);

                return new SuccessResult("İş deneyimleri güncellendi.");
        }

        @Override
        public Result delete(DeleteExperienceRequest deleteExperienceRequest) {
                Experience experience = modelMapperService.forRequest()
                                .map(deleteExperienceRequest, Experience.class);

                this.experienceDao.delete(experience);

                return new SuccessResult("Deneyim silindi.");
        }

}
