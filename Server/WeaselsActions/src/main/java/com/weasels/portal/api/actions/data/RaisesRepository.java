package com.weasels.portal.api.actions.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface RaisesRepository extends JpaRepository<RaiseEntity, Long> {

	boolean existsByRaiseId(String raiseId);

	RaiseEntity getByRaiseId(String raiseId);

	@Transactional
	int deleteByRaiseId(String raiseId);

}
