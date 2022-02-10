package com.weasels.portal.api.email.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.weasels.portal.api.email.data.EmailEntity;
import com.weasels.portal.api.email.data.EmailsRepository;
import com.weasels.portal.api.email.shared.EmailDTO;

@Service
public class EmailServiceImpl implements EmailService {

	private final ModelMapper modelMapper;
	private final EmailsRepository emailsRepository;

	@Autowired
	public EmailServiceImpl(ModelMapper modelMapper, EmailsRepository emailsRepository) {
		this.modelMapper = modelMapper;
		this.emailsRepository = emailsRepository;
	}

	@Override
	public EmailDTO createEmail(EmailDTO emailDetails) {

		emailDetails.setEmailId(UUID.randomUUID().toString());

		emailDetails.setSendingDate(new Date());

		EmailEntity emailEntity = modelMapper.map(emailDetails, EmailEntity.class);

		EmailEntity createdEmailEntity = emailsRepository.save(emailEntity);

		EmailDTO createdEmail = modelMapper.map(createdEmailEntity, EmailDTO.class);

		return createdEmail;
	}

	@Override
	public List<EmailDTO> retrieveEmails(String emailAdress) {

		List<EmailEntity> retrievedEmailEntitiesList = emailsRepository.findAllBySenderEmailOrReceiverEmail(emailAdress, emailAdress);

		List<EmailDTO> retrievedEmailsList = retrievedEmailEntitiesList.stream()
				.map(entity -> modelMapper.map(entity, EmailDTO.class)).collect(Collectors.toList());

		return retrievedEmailsList;
	}

	@Override
	public EmailDTO retrieveEmail(String emailId) {

		EmailEntity retrievedEmailEntity = emailsRepository.findByEmailId(emailId);

		EmailDTO retrievedEmail = modelMapper.map(retrievedEmailEntity, EmailDTO.class);

		return retrievedEmail;
	}

	@Override
	public EmailDTO updateEmail(String emailAddress, String emailId, String header, String content, String delete, String recover) {

		if (!emailsRepository.existsByEmailId(emailId)) {

			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
		}

		EmailEntity emailEntity = emailsRepository.findByEmailId(emailId);

		boolean isSender = emailEntity.getSenderEmail().equals(emailAddress);

		Date currentDate = new Date();

		if (header != null) {

			if (isSender) {

				emailEntity.setHeader(header);
				emailEntity.setEditingDate(currentDate);
			} else {

				throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
						"Receiver of the email cannot edit the email header.");
			}
		}

		if (content != null) {

			if (isSender) {

				emailEntity.setContent(content);
				emailEntity.setEditingDate(currentDate);
			} else {

				throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
						"Receiver of the email cannot edit the email content.");
			}
		}

		if (delete != null && delete.equals("sender") && isSender) {

			emailEntity.setDeletedBySender("Y");

		} else if (delete != null && delete.equals("receiver") && !isSender) {

			emailEntity.setDeletedByReceiver("Y");
		}

		if (recover != null && recover.equals("sender") && isSender) {

			emailEntity.setDeletedBySender(null);

		} else if (recover != null && recover.equals("receiver") && !isSender) {

			emailEntity.setDeletedByReceiver(null);
		}

		EmailEntity updatedEmailEntity = emailsRepository.save(emailEntity);

		EmailDTO updatedEmail = modelMapper.map(updatedEmailEntity, EmailDTO.class);

		return updatedEmail;
	}

	@Override
	public int deleteEmail(String emailId) {

		int deleted = emailsRepository.deleteByEmailId(emailId);

		return deleted;
	}

}
