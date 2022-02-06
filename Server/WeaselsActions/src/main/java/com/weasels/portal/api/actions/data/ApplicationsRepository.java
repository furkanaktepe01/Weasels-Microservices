package com.weasels.portal.api.actions.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ApplicationsRepository extends JpaRepository<ApplicationEntity, Long> {

	boolean existsByApplicationId(String applicationId);

	ApplicationEntity getByApplicationId(String applicationId);

	@Transactional
	int deleteByApplicationId(String applicationId);

}
