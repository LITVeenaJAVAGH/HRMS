package org.littuss.hrManagementApp.itRecruitmentController;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentService.ItRecruitmentCandidateDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/itrecruitment")
public class ItRecruitmentCandidateDetailsController {
	
	@Autowired
	private ItRecruitmentCandidateDetailsService itRecruitmentCandidateDetailsService;
	
	@PostMapping("/save/candidate")
    public ItRecruitmentCandidateDetailsEntity saveCandidateDetails(@RequestBody ItRecruitmentCandidateDetailsEntity candidateDetails) {
        return itRecruitmentCandidateDetailsService.save(candidateDetails);
    }
	

}
