package com.weasels.portal.api.actions.ui.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weasels.portal.api.actions.data.ApplicationEntity;
import com.weasels.portal.api.actions.shared.ApplicationDTO;
import com.weasels.portal.api.actions.ui.model.ApplicationRequestModel;
import com.weasels.portal.api.actions.ui.model.ApplicationResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveApplicationRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveApplicationResponseModel;

@RestController
@RequestMapping("/applications")
public class ApplicationsController {

	@Autowired
	ActionsController<ApplicationEntity, ApplicationDTO, ApplicationRequestModel, ApplicationResponseModel, SaveApplicationRequestModel, SaveApplicationResponseModel> applicationController;

	@PostMapping("/new")
	public ResponseEntity<SaveApplicationResponseModel> createApplicationHandler(
			@Valid @RequestBody SaveApplicationRequestModel applicationDetails) {

		return applicationController.createAction(applicationDetails);
	}

	@GetMapping
	public ResponseEntity<List<ApplicationResponseModel>> getApplicationsHandler(
			@RequestBody ApplicationRequestModel applicationDetails) {

		return applicationController.getActions(applicationDetails);
	}

	@GetMapping("/{applicationId}")
	public ResponseEntity<ApplicationResponseModel> getApplicationHandler(
			@PathVariable("applicationId") String applicationId) {

		return applicationController.getAction(applicationId);
	}

	@PutMapping
	public ResponseEntity<SaveApplicationResponseModel> updateApplicationHandler(
			@Valid @RequestBody SaveApplicationRequestModel applicationDetails) {

		return applicationController.updateAction(applicationDetails);
	}

	@DeleteMapping("/{applicationId}")
	public ResponseEntity<?> deleteApplicationHandler(@PathVariable("applicationId") String applicationId) {

		return applicationController.deleteAction(applicationId);
	}

}
