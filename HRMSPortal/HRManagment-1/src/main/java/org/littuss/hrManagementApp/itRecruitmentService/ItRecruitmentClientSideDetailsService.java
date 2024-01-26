package org.littuss.hrManagementApp.itRecruitmentService;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentClientSideDetailsEntity;
import org.littuss.hrManagementApp.itRecruitmentRepository.ItRecruitmentClientSideDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItRecruitmentClientSideDetailsService {
	
	@Autowired
	private ItRecruitmentClientSideDetailsRepository itRCSDR;
	
	public ItRecruitmentClientSideDetailsEntity save(ItRecruitmentClientSideDetailsEntity itRCS) {
	    return itRCSDR.save(itRCS);

}
}