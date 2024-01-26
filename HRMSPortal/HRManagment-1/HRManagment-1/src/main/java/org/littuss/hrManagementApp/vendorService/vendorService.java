package org.littuss.hrManagementApp.vendorService;


import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.littuss.hrManagementApp.vendorRepo.vendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class vendorService {

	@Autowired
	private vendorRepo venRepo;
	
	 public VendorDetails findByvendorName(String vendorName) {
	        return venRepo.findByvendorName(vendorName);
	 }
	 public VendorDetails save(VendorDetails vedInfo) {
	        return venRepo.save(vedInfo);
	 }      
	
	

}

