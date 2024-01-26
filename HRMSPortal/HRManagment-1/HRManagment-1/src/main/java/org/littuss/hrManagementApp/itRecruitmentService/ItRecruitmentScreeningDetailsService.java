package org.littuss.hrManagementApp.itRecruitmentService;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentScreeningDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentRepository.ItRecruitmentScreeningDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItRecruitmentScreeningDetailsService {
	
	@Autowired
	private ItRecruitmentScreeningDetailsRepository itRSDR;
	
	public ItRecruitmentScreeningDetailsEntity save(ItRecruitmentScreeningDetailsEntity itRSD) {
	    return itRSDR.save(itRSD);


}
	

}
