package org.littuss.hrManagementApp.itRecruitmentRepository;

import org.littuss.hrManagementApp.itRecruitmentModel.ItRecruitmentCandidateDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItRecruitmentCandidateDetailsRepository extends JpaRepository<ItRecruitmentCandidateDetailsEntity, Long> {

	
}



