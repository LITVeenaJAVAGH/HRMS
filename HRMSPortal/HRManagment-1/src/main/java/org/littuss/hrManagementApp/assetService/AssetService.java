package org.littuss.hrManagementApp.assetService;

import org.littuss.hrManagementApp.assetModel.AssetRegisterEntity;
import org.littuss.hrManagementApp.assetRepository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetService {
	
	@Autowired
	public AssetRepository asr;
	 public AssetRegisterEntity save(AssetRegisterEntity ser) {
		return  asr.save(ser);
		
	}

}
