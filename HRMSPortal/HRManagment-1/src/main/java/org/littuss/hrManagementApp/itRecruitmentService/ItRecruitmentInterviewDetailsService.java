package org.littuss.hrManagementApp.itRecruitmentService;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentInterviewDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentRepository.ItRecruitmentInterviewDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItRecruitmentInterviewDetailsService {
	
	@Autowired
	private ItRecruitmentInterviewDetailsRepository itRIDR;
	
	public ItRecruitmentInterviewDetailsEntity save(ItRecruitmentInterviewDetailsEntity itRID) {
	    return itRIDR.save(itRID);


}

}