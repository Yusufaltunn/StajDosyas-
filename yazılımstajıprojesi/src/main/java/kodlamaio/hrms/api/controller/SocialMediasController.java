package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlamaio.hrms.business.abstracts.SocialMediaService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.dtos.requests.socialMedia.CreateSocialMediaRequest;
import kodlamaio.hrms.dtos.requests.socialMedia.DeleteSocialMediaRequest;
import kodlamaio.hrms.dtos.requests.socialMedia.UpdateSocialMediaRequest;
import kodlamaio.hrms.dtos.responses.GetAllSocialMediaResponses;
import lombok.AllArgsConstructor;

@RequestMapping("/api/socialmedias")
@RestController
@AllArgsConstructor
public class SocialMediasController {

    private SocialMediaService socialMediaService;

    @GetMapping("/getall")
    DataResult<List<GetAllSocialMediaResponses>> getAll() {
        return this.socialMediaService.getAll();

    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    Result add(@RequestBody @Valid CreateSocialMediaRequest createSocialMediaRequest) {
        return this.socialMediaService.add(createSocialMediaRequest);

    }

    @DeleteMapping("/delete")
    Result delete(DeleteSocialMediaRequest deleteSocialMediaRequest) {
        return this.socialMediaService.delete(deleteSocialMediaRequest);

    }

    @PutMapping("/update")
    Result update(@RequestBody UpdateSocialMediaRequest updateSocialMediaRequest) {
        return this.socialMediaService.update(updateSocialMediaRequest);

    }
}
