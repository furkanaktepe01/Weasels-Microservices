package com.weasels.portal.api.email.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface EmailsRepository extends JpaRepository<EmailEntity, Long> {

	boolean existsByEmailId(String emailId);

	EmailEntity findByEmailId(String emailId);

	List<EmailEntity> findAllBySenderEmailOrReceiverEmail(String emailAddress0, String emailAddress1);

	@Transactional
	int deleteByEmailId(String emailId);
}
