package com.weasels.portal.api.actions.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface LeavingsRepository extends JpaRepository<LeavingEntity, Long> {

	boolean existsByLeavingId(String leavingId);

	LeavingEntity getByLeavingId(String leavingId);

	@Transactional
	int deleteByLeavingId(String leavingId);

}
