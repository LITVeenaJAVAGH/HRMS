package org.littuss.hrManagementApp.itRecruitmentController;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentScreeningDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentService.ItRecruitmentScreeningDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/it/recruitment/screening")

public class ItRecruitmentScreeningDetailsController {
	
	@Autowired
    private ItRecruitmentScreeningDetailsService itRecruitmentScreeningDetailsService;

	
	@PostMapping("/save/screening/details")
    public ItRecruitmentScreeningDetailsEntity saveScreeningDetails(@RequestBody ItRecruitmentScreeningDetailsEntity screeningDetails) {
        return itRecruitmentScreeningDetailsService.save(screeningDetails);
    }


}
