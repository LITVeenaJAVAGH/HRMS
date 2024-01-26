package org.littuss.hrManagementApp.itRecruitmentController;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentClientSideDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentService.ItRecruitmentClientSideDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/it/recruitment/client")

public class ItRecruitmentClientSideDetailsController {
	
	@Autowired
    private ItRecruitmentClientSideDetailsService itRecruitmentClientSideDetailsService;

  
    @PostMapping("/save/client/details")
    public ItRecruitmentClientSideDetailsEntity saveClientDetails(@RequestBody ItRecruitmentClientSideDetailsEntity clientDetails) {
        return itRecruitmentClientSideDetailsService.save(clientDetails);
    }


}
