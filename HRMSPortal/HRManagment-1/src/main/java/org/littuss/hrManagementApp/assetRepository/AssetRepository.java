package org.littuss.hrManagementApp.assetRepository;

import org.littuss.hrManagementApp.assetModel.AssetRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<AssetRegisterEntity, Long>{
	
    
}