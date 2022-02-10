package com.weasels.portal.api.email.ui.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weasels.portal.api.email.service.EmailService;
import com.weasels.portal.api.email.shared.EmailDTO;
import com.weasels.portal.api.email.ui.model.CreateEmailRequestModel;
import com.weasels.portal.api.email.ui.model.CreateEmailResponseModel;
import com.weasels.portal.api.email.ui.model.EmailResponseModel;
import com.weasels.portal.api.email.ui.model.EmailsResponseModel;

@RestController
@RequestMapping("/emails")
public class EmailsController {

	private final ModelMapper modelMapper;
	private final EmailService emailService;

	@Autowired
	public EmailsController(ModelMapper modelMapper, EmailService emailService) {
		this.modelMapper = modelMapper;
		this.emailService = emailService;
	}

	@PostMapping("/new")
	public ResponseEntity<CreateEmailResponseModel> createEmail(
			@Valid @RequestBody CreateEmailRequestModel emailDetails) {

		EmailDTO emailDTO = modelMapper.map(emailDetails, EmailDTO.class);

		EmailDTO createdEmail = emailService.createEmail(emailDTO);

		CreateEmailResponseModel createEmailResponse = modelMapper.map(createdEmail, CreateEmailResponseModel.class);

		return ResponseEntity.status(HttpStatus.CREATED).body(createEmailResponse);
	}

	@GetMapping("/{emailAddress}")
	public ResponseEntity<List<EmailsResponseModel>> getEmails(@PathVariable("emailAddress") String emailAddress) {

		List<EmailDTO> retrievedEmailsList = emailService.retrieveEmails(emailAddress);

		List<EmailsResponseModel> retrievedEmailsListResponse = retrievedEmailsList.stream()
				.map(dto -> modelMapper.map(dto, EmailsResponseModel.class)).collect(Collectors.toList());

		return ResponseEntity.status(HttpStatus.OK).body(retrievedEmailsListResponse);

	}

	@GetMapping("/id/{emailId}")
	public ResponseEntity<EmailResponseModel> getEmail(@PathVariable("emailId") String emailId) {

		EmailDTO retrievedEmail = emailService.retrieveEmail(emailId);

		EmailResponseModel retrievedEmailResponse = modelMapper.map(retrievedEmail, EmailResponseModel.class);

		return ResponseEntity.status(HttpStatus.OK).body(retrievedEmailResponse);
	}

	@PutMapping("/id/{emailId}")
	public ResponseEntity<EmailResponseModel> updateEmail(@PathVariable("emailId") String emailId,
			@RequestParam(name = "header", required = false) String header,
			@RequestBody(required = false) String content,
			@RequestParam(name = "delete", required = false) String delete,
			@RequestParam(name = "recover", required = false) String recover) {

		// validate requester - the user in the security context: should be either sender or receiver of the email with the given emailId

		String emailAddress = "furkan@weasels.com";

		EmailDTO updatedEmail = emailService.updateEmail(emailAddress, emailId, header, content, delete, recover);

		EmailResponseModel updatedEmailResponse = modelMapper.map(updatedEmail, EmailResponseModel.class);

		return ResponseEntity.status(HttpStatus.OK).body(updatedEmailResponse);
	}

	@DeleteMapping("/id/{emailId}")
	public ResponseEntity<?> deleteEmail(@PathVariable("emailId") String emailId) {

		ResponseEntity<?> response = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

		int deleted = emailService.deleteEmail(emailId);

		if (deleted == 1) {

			response = new ResponseEntity<>(null, HttpStatus.OK);
		}

		return response;
	}

}
