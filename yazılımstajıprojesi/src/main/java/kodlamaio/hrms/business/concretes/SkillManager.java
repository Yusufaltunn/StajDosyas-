package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;



import kodlamaio.hrms.business.abstracts.SkillService;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.SkillDao;
import kodlamaio.hrms.dtos.requests.skill.CreateSkillRequest;
import kodlamaio.hrms.dtos.requests.skill.DeleteSkillRequest;
import kodlamaio.hrms.dtos.requests.skill.UpdateSkillRequest;
import kodlamaio.hrms.dtos.responses.GetAllSkillResponses;
import kodlamaio.hrms.entities.concretes.Skill;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SkillManager implements SkillService {

    private SkillDao skillDao;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<List<GetAllSkillResponses>> getAll() {

        List<Skill> skills = skillDao.findAll();
        List<GetAllSkillResponses> getAllSkillResponses = skills.stream()
        .map(skill -> modelMapperService.forResponse()
        .map(skill, GetAllSkillResponses.class))
        .collect(Collectors.toList());

        return new DataResult<List<GetAllSkillResponses>>(getAllSkillResponses, true, "Data getirildi.");

    }

    @Override
    public Result add(CreateSkillRequest createSkillRequest) {
        Skill skill = modelMapperService.forRequest()
                .map(createSkillRequest, Skill.class);

        this.skillDao.save(skill);

        return new SuccessResult("Yeni beceri eklendi.");
    }

    @Override
    public Result update(UpdateSkillRequest updateSkillRequest) {
        Skill inDbSkill = skillDao.findById(updateSkillRequest.getId()).get();
        Skill skill = new Skill();
        skill.setId(updateSkillRequest.getId());
        skill.setName(updateSkillRequest.getName());

        return new SuccessResult("Beceri güncellendi.");
        
    }

    @Override
    public Result delete(DeleteSkillRequest deleteSkillRequest) {
        Skill skill = modelMapperService.forRequest()
        .map(deleteSkillRequest, Skill.class);

        this.skillDao.delete(skill);

        return new SuccessResult("Beceri silindi.");
    }

}
