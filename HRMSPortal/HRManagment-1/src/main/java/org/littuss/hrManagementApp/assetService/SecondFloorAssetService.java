package org.littuss.hrManagementApp.assetService;

import org.littuss.hrManagementApp.assetModel.SecondFloorAssetEntity;
import org.littuss.hrManagementApp.assetRepository.SecondFloorAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondFloorAssetService {
	@Autowired 
	 private SecondFloorAssetRepository asf; 
	public SecondFloorAssetEntity save(SecondFloorAssetEntity ser) {
		return  asf.save(ser);
	 

}

}
