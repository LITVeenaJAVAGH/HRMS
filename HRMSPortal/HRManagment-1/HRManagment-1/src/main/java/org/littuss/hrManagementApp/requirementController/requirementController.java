package org.littuss.hrManagementApp.requirementController;

import org.littuss.hrManagementApp.requirementModel.requirementEntity;
import org.littuss.hrManagementApp.requirementService.requirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requirement")
public class requirementController {
	
	@Autowired
	private requirementService rService;
	
	@PostMapping("/save/technology")
	public requirementEntity addRequirement(@RequestBody requirementEntity rre) {
        return rService.save(rre);
    }

}



