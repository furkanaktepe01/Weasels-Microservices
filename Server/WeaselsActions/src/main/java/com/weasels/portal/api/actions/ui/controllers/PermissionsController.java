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

import com.weasels.portal.api.actions.data.PermissionEntity;
import com.weasels.portal.api.actions.shared.PermissionDTO;
import com.weasels.portal.api.actions.ui.model.PermissionRequestModel;
import com.weasels.portal.api.actions.ui.model.PermissionResponseModel;
import com.weasels.portal.api.actions.ui.model.SavePermissionRequestModel;
import com.weasels.portal.api.actions.ui.model.SavePermissionResponseModel;

@RestController
@RequestMapping("/permissions")
public class PermissionsController {

	@Autowired
	ActionsController<PermissionEntity, PermissionDTO, PermissionRequestModel, PermissionResponseModel, SavePermissionRequestModel, SavePermissionResponseModel> permissionController;

	@PostMapping("/new")
	public ResponseEntity<SavePermissionResponseModel> createPermissionHandler(
			@Valid @RequestBody SavePermissionRequestModel permissionDetails) {

		return permissionController.createAction(permissionDetails);
	}

	@GetMapping
	public ResponseEntity<List<PermissionResponseModel>> getPermissionsHandler(
			@RequestBody PermissionRequestModel permissionDetails) {

		return permissionController.getActions(permissionDetails);
	}

	@GetMapping("/{permissionId}")
	public ResponseEntity<PermissionResponseModel> getPermissionHandler(@PathVariable("permissionId") String permissionId) {

		return permissionController.getAction(permissionId);
	}

	@PutMapping
	public ResponseEntity<SavePermissionResponseModel> updatePermissionHandler(
			@Valid @RequestBody SavePermissionRequestModel permissionDetails) {

		return permissionController.updateAction(permissionDetails);
	}

	@DeleteMapping("/{permissionId}")
	public ResponseEntity<?> deletePermissionHandler(@PathVariable("permissionId") String permissionId) {

		return permissionController.deleteAction(permissionId);
	}

}
