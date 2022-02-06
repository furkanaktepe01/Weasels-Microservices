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

import com.weasels.portal.api.actions.data.LeavingEntity;
import com.weasels.portal.api.actions.shared.LeavingDTO;
import com.weasels.portal.api.actions.ui.model.LeavingRequestModel;
import com.weasels.portal.api.actions.ui.model.LeavingResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveLeavingRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveLeavingResponseModel;

@RestController
@RequestMapping("/leavings")
public class LeavingsController {

	@Autowired
	ActionsController<LeavingEntity, LeavingDTO, LeavingRequestModel, LeavingResponseModel, SaveLeavingRequestModel, SaveLeavingResponseModel> leavingController;

	@PostMapping("/new")
	public ResponseEntity<SaveLeavingResponseModel> createLeavingHandler(
			@Valid @RequestBody SaveLeavingRequestModel leavingDetails) {

		return leavingController.createAction(leavingDetails);
	}

	@GetMapping
	public ResponseEntity<List<LeavingResponseModel>> getLeavingsHandler(@RequestBody LeavingRequestModel leavingDetails) {

		return leavingController.getActions(leavingDetails);
	}

	@GetMapping("/{leavingId}")
	public ResponseEntity<LeavingResponseModel> getLeavingHandler(@PathVariable("leavingId") String leavingId) {

		return leavingController.getAction(leavingId);
	}

	@PutMapping
	public ResponseEntity<SaveLeavingResponseModel> updateLeavingHandler(
			@Valid @RequestBody SaveLeavingRequestModel leavingDetails) {

		return leavingController.updateAction(leavingDetails);
	}

	@DeleteMapping("/{leavingId}")
	public ResponseEntity<?> deleteLeavingHandler(@PathVariable("leavingId") String leavingId) {

		return leavingController.deleteAction(leavingId);
	}

}
