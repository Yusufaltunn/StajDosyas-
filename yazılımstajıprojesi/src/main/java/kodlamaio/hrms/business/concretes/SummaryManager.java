package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SummaryService;
import kodlamaio.hrms.core.mappers.ModelMapperService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.SummaryDao;
import kodlamaio.hrms.dtos.requests.summary.CreateSummaryRequest;
import kodlamaio.hrms.dtos.requests.summary.DeleteSummaryRequest;
import kodlamaio.hrms.dtos.requests.summary.UpdateSummaryRequest;
import kodlamaio.hrms.dtos.responses.GetAllSummaryResponses;
import kodlamaio.hrms.entities.concretes.Summary;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SummaryManager implements SummaryService {

    private SummaryDao summaryDao;
    private ModelMapperService modelMapperService;

    @Override
    public DataResult<List<GetAllSummaryResponses>> getAll() {

        List<Summary> summaries = summaryDao.findAll();
        List<GetAllSummaryResponses> getAllSummaryResponses = summaries.stream()
                .map(summary -> modelMapperService.forResponse()
                        .map(summary, GetAllSummaryResponses.class))
                .collect(Collectors.toList());

        return new DataResult<List<GetAllSummaryResponses>>(getAllSummaryResponses, true, "Data getirildi.");
    }

    @Override
    public Result add(CreateSummaryRequest createSummaryRequest) {
        Summary summary = modelMapperService.forRequest()
                .map(createSummaryRequest, Summary.class);

        this.summaryDao.save(summary);

        return new SuccessResult("Yeni hedef eklendi.");
    }

    @Override
    public Result delete(DeleteSummaryRequest deleteSummaryRequest) {
        Summary summary = modelMapperService.forRequest()
        .map(deleteSummaryRequest, Summary.class);

        this.summaryDao.delete(summary);

        return new SuccessResult("Hedef silindi.");
    }

    @Override
    public Result update(UpdateSummaryRequest updateSummaryRequest) {
        Summary summary = modelMapperService.forRequest()
        .map(updateSummaryRequest, Summary.class);

        this.summaryDao.save(summary);

        return new SuccessResult("Hedef güncellendi.");
    }

}
