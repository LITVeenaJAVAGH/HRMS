package org.littuss.hrManagementApp.itRecruitmentService;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentStatusEntity;
import org.littuss.hrManagementApp.itRecruitmentRepository.ItRecruitmentStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItRecruitmentStatusService {
	
	@Autowired
	private ItRecruitmentStatusRepository irRSR;
	
	public ItRecruitmentStatusEntity save(ItRecruitmentStatusEntity itRS) {
	    return irRSR.save(itRS);


}

}
