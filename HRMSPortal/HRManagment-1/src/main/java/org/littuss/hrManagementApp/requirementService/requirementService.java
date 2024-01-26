package org.littuss.hrManagementApp.requirementService;

import org.springframework.stereotype.Service;
import org.littuss.hrManagementApp.requirementModel.requirementEntity;
import org.littuss.hrManagementApp.requirementRepository.requirementRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class requirementService {
	
	@Autowired
	private requirementRepository rRS;
	public requirementEntity save(requirementEntity rre) {
		return rRS.save(rre);
	}
	
	

}

