package org.littuss.hrManagementApp.assetController;

import org.littuss.hrManagementApp.assetModel.AssetRegisterEntity;
import org.littuss.hrManagementApp.assetService.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/assets")
public class AssetController {

	@Autowired
	   private AssetService acr;  
	   @PostMapping("/register")
	public AssetRegisterEntity saveAssetRegister(@RequestBody AssetRegisterEntity AssetsRegister) {
	 	return acr.save(AssetsRegister);
	}

}
