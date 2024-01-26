package org.littuss.hrManagementApp.vendorController;

import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.littuss.hrManagementApp.vendorService.vendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vendorDetails")
public class vendorController {

	@Autowired
	private vendorService venDet;
	
	@PostMapping("/save/vendorName")
	 public VendorDetails saveVendorDetails(@RequestBody VendorDetails VendorDetails) {
		return venDet.save(VendorDetails);
    }
 
}

