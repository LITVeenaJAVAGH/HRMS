package org.littuss.hrManagementApp.itRecruitmentController;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentStatusEntity;
import org.littuss.hrManagementApp.itRecruitmentService.ItRecruitmentStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/it/recruitment/status")
public class ItRecruitmentStatusController {
	
	@Autowired
    private ItRecruitmentStatusService itRecruitmentStatusService;

   
    @PostMapping("/save/status")
    public ItRecruitmentStatusEntity saveStatus(@RequestBody ItRecruitmentStatusEntity statusDetails) {
        return itRecruitmentStatusService.save(statusDetails);
    }

}
