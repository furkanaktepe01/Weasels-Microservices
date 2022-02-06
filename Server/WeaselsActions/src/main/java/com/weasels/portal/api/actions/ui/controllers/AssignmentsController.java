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

import com.weasels.portal.api.actions.data.AssignmentEntity;
import com.weasels.portal.api.actions.shared.AssignmentDTO;
import com.weasels.portal.api.actions.ui.model.AssignmentRequestModel;
import com.weasels.portal.api.actions.ui.model.AssignmentResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveAssignmentRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveAssignmentResponseModel;

@RestController
@RequestMapping("/assignments")
public class AssignmentsController {

	@Autowired
	ActionsController<AssignmentEntity, AssignmentDTO, AssignmentRequestModel, AssignmentResponseModel, SaveAssignmentRequestModel, SaveAssignmentResponseModel> assignmentController;

	@PostMapping("/new")
	public ResponseEntity<SaveAssignmentResponseModel> createAssignmentHandler(
			@Valid @RequestBody SaveAssignmentRequestModel assignmentDetails) {

		return assignmentController.createAction(assignmentDetails);
	}

	@GetMapping
	public ResponseEntity<List<AssignmentResponseModel>> getAssignmentsHandler(
			@RequestBody AssignmentRequestModel assignmentDetails) {

		return assignmentController.getActions(assignmentDetails);
	}

	@GetMapping("/{assignmentId}")
	public ResponseEntity<AssignmentResponseModel> getAssignmentHandler(@PathVariable("assignmentId") String assignmentId) {

		return assignmentController.getAction(assignmentId);
	}

	@PutMapping
	public ResponseEntity<SaveAssignmentResponseModel> updateAssignmentHandler(
			@Valid @RequestBody SaveAssignmentRequestModel assignmentDetails) {

		return assignmentController.updateAction(assignmentDetails);
	}

	@DeleteMapping("/{assignmentId}")
	public ResponseEntity<?> deleteAssignmentHandler(@PathVariable("assignmentId") String assignmentId) {

		return assignmentController.deleteAction(assignmentId);
	}

}
