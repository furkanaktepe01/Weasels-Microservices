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

import com.weasels.portal.api.actions.data.RaiseEntity;
import com.weasels.portal.api.actions.shared.RaiseDTO;
import com.weasels.portal.api.actions.ui.model.RaiseRequestModel;
import com.weasels.portal.api.actions.ui.model.RaiseResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveRaiseRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveRaiseResponseModel;

@RestController
@RequestMapping("/raises")
public class RaisesController {

	@Autowired
	ActionsController<RaiseEntity, RaiseDTO, RaiseRequestModel, RaiseResponseModel, SaveRaiseRequestModel, SaveRaiseResponseModel> raiseController;

	@PostMapping("/new")
	public ResponseEntity<SaveRaiseResponseModel> createRaiseHandler(
			@Valid @RequestBody SaveRaiseRequestModel raiseDetails) {

		return raiseController.createAction(raiseDetails);
	}

	@GetMapping
	public ResponseEntity<List<RaiseResponseModel>> getRaisesHandler(@RequestBody RaiseRequestModel raiseDetails) {

		return raiseController.getActions(raiseDetails);
	}

	@GetMapping("/{raiseId}")
	public ResponseEntity<RaiseResponseModel> getRaiseHandler(@PathVariable("raiseId") String raiseId) {

		return raiseController.getAction(raiseId);
	}

	@PutMapping
	public ResponseEntity<SaveRaiseResponseModel> updateRaiseHandler(
			@Valid @RequestBody SaveRaiseRequestModel raiseDetails) {

		return raiseController.updateAction(raiseDetails);
	}

	@DeleteMapping("/{raiseId}")
	public ResponseEntity<?> deleteRaiseHandler(@PathVariable("raiseId") String raiseId) {

		return raiseController.deleteAction(raiseId);
	}

}
