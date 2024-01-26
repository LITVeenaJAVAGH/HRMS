package org.littuss.hrManagementApp.itRecruitmentService;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentRepository.ItRecruitmentCandidateDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItRecruitmentCandidateDetailsService {
	
	@Autowired
	private ItRecruitmentCandidateDetailsRepository itRCDR; 
	
	public ItRecruitmentCandidateDetailsEntity save(ItRecruitmentCandidateDetailsEntity itrc) {
	    return itRCDR.save(itrc);
	}


}