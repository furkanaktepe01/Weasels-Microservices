package com.weasels.portal.api.actions.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface AssignmentsRepository extends JpaRepository<AssignmentEntity, Long> {

	boolean existsByAssignmentId(String assignmentId);

	AssignmentEntity getByAssignmentId(String assignmentId);

	@Transactional
	int deleteByAssignmentId(String assignmentId);

}
