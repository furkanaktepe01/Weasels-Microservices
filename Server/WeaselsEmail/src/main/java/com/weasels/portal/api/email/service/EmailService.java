package com.weasels.portal.api.email.service;

import java.util.List;

import com.weasels.portal.api.email.shared.EmailDTO;

public interface EmailService {

	EmailDTO createEmail(EmailDTO emailDTO);

	List<EmailDTO> retrieveEmails(String emailAddress);

	EmailDTO retrieveEmail(String emailId);

	EmailDTO updateEmail(String emailAddress, String emailId, String header, String content, String delete, String recover);

	int deleteEmail(String emailId);
}
