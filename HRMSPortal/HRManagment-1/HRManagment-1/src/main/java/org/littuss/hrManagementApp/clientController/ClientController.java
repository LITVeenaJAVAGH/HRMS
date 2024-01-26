package org.littuss.hrManagementApp.clientController;

import org.littuss.hrManagementApp.clientModel.ClientEntity;
import org.littuss.hrManagementApp.clientService.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")

public class ClientController {
	
	 @Autowired
	 private ClientService csr;
	 
	 //register
	 //@GetMapping("/register/{email}")
	// public ClienRegisterEntity findByemailId(@PathVariable String emailId) {
	      //  return csr.findByemailId(emailId);
	   // }
	 
	 @PostMapping("/register")
	    public ClientEntity saveClientRegister(@RequestBody ClientEntity ClientRegister) {
		 	return csr.save(ClientRegister);
	    }
	 
}



