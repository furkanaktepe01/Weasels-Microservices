package com.weasels.portal.api.actions.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PermissionsRepository extends JpaRepository<PermissionEntity, Long> {

	boolean existsByPermissionId(String permissionId);

	PermissionEntity getByPermissionId(String permissionId);

	@Transactional
	int deleteByPermissionId(String permissionId);

}
