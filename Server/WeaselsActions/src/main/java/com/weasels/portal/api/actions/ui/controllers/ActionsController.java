package com.weasels.portal.api.actions.ui.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.weasels.portal.api.actions.service.ActionsService;
import com.weasels.portal.api.actions.shared.HelperMethods;

public class ActionsController<ActionEntity, ActionDTO, ActionRequestModel, ActionResponseModel, SaveActionRequestModel, SaveActionResponseModel> {

	private final Class<ActionDTO> ActionDtoRef;
	private final Class<ActionRequestModel> ActionRequestModelRef;
	private final Class<ActionResponseModel> ActionResponseModelRef;
	private final Class<SaveActionRequestModel> SaveActionRequestModelRef;
	private final Class<SaveActionResponseModel> SaveActionResponseModelRef;
	private ActionsService<ActionEntity, ActionDTO> actionsService;
	private ModelMapper modelMapper;

	public ActionsController(Class<ActionDTO> actionDtoRef, Class<ActionRequestModel> actionRequestModelRef,
			Class<ActionResponseModel> actionResponseModelRef, Class<SaveActionRequestModel> saveActionRequestModelRef,
			Class<SaveActionResponseModel> saveActionResponseModelRef) {
		ActionDtoRef = actionDtoRef;
		ActionRequestModelRef = actionRequestModelRef;
		ActionResponseModelRef = actionResponseModelRef;
		SaveActionRequestModelRef = saveActionRequestModelRef;
		SaveActionResponseModelRef = saveActionResponseModelRef;
	}

	public Class<ActionDTO> getActionDtoRef() {
		return ActionDtoRef;
	}

	public Class<ActionRequestModel> getActionRequestModelRef() {
		return ActionRequestModelRef;
	}

	public Class<ActionResponseModel> getActionResponseModelRef() {
		return ActionResponseModelRef;
	}

	public Class<SaveActionRequestModel> getSaveActionRequestModelRef() {
		return SaveActionRequestModelRef;
	}

	public Class<SaveActionResponseModel> getSaveActionResponseModelRef() {
		return SaveActionResponseModelRef;
	}

	public void setActionsService(ActionsService<ActionEntity, ActionDTO> actionsService) {
		this.actionsService = actionsService;
	}

	public void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	public ResponseEntity<SaveActionResponseModel> createAction(SaveActionRequestModel actionDetails) {

		String actionId = HelperMethods
				.<SaveActionRequestModel>getActionIdFromActionDetails(ActionDtoRef.getSimpleName(), actionDetails);

		HelperMethods.validateActionIdForOperation(actionId, ActionDtoRef.getSimpleName(), "create");

		ActionDTO actionDTO = modelMapper.map(actionDetails, getActionDtoRef());

		ActionDTO createdAction = actionsService.createAction(actionDTO);

		SaveActionResponseModel createdActionResponse = modelMapper.map(createdAction, getSaveActionResponseModelRef());

		return ResponseEntity.status(HttpStatus.CREATED).body(createdActionResponse);
	}

	public ResponseEntity<List<ActionResponseModel>> getActions(ActionRequestModel actionDetails) {

		ActionDTO actionDTO = modelMapper.map(actionDetails, getActionDtoRef());

		List<ActionDTO> retrievedActionsList = (List<ActionDTO>) actionsService.retrieveActions(actionDTO);

		List<ActionResponseModel> retrievedActionsListResponse = retrievedActionsList.stream()
				.map(dto -> modelMapper.map(dto, getActionResponseModelRef())).collect(Collectors.toList());

		return ResponseEntity.status(HttpStatus.OK).body(retrievedActionsListResponse);
	}

	public ResponseEntity<ActionResponseModel> getAction(String actionId) {

		ActionDTO retrievedAction = actionsService.retrieveAction(actionId);

		ActionResponseModel retrievedActionResponse = modelMapper.map(retrievedAction, getActionResponseModelRef());

		return ResponseEntity.status(HttpStatus.OK).body(retrievedActionResponse);
	}

	public ResponseEntity<SaveActionResponseModel> updateAction(SaveActionRequestModel actionDetails) {

		String actionId = HelperMethods
				.<SaveActionRequestModel>getActionIdFromActionDetails(ActionDtoRef.getSimpleName(), actionDetails);

		HelperMethods.validateActionIdForOperation(actionId, ActionDtoRef.getSimpleName(), "update");

		ActionDTO actionDTO = modelMapper.map(actionDetails, getActionDtoRef());

		ActionDTO updatedAction = actionsService.updateAction(actionDTO);

		SaveActionResponseModel updatedActionResponse = modelMapper.map(updatedAction, getSaveActionResponseModelRef());

		return ResponseEntity.status(HttpStatus.OK).body(updatedActionResponse);
	}

	public ResponseEntity<?> deleteAction(String actionId) {

		ResponseEntity<?> response = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

		int deleted = actionsService.deleteAction(actionId);

		if (deleted == 1) {

			response = new ResponseEntity<>(null, HttpStatus.OK);
		}

		return response;
	}

}
