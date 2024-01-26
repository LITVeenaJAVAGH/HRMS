package org.littuss.hrManagementApp.itRecruitmentController;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentInterviewDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentService.ItRecruitmentInterviewDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/it/recruitment/interview")

public class ItRecruitmentInterviewDetailsController {
	
	@Autowired
    private ItRecruitmentInterviewDetailsService itRecruitmentInterviewDetailsService;

 
    @PostMapping("/save/interview/details")
    public ItRecruitmentInterviewDetailsEntity saveInterviewDetails(@RequestBody ItRecruitmentInterviewDetailsEntity interviewDetails) {
        return itRecruitmentInterviewDetailsService.save(interviewDetails);
    }

}
