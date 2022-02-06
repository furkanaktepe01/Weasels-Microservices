package com.weasels.portal.api.actions.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import com.weasels.portal.api.actions.shared.HelperMethods;

public class ActionsService<ActionEntity, ActionDTO> {

	private final Class<ActionEntity> ActionEntityRef;
	private final Class<ActionDTO> ActionDtoRef;
	private JpaRepository<ActionEntity, ?> actionsRepository;
	private ModelMapper modelMapper;

	public ActionsService(Class<ActionEntity> actionEntityRef, Class<ActionDTO> actionDtoRef) {
		ActionEntityRef = actionEntityRef;
		ActionDtoRef = actionDtoRef;
	}

	public Class<ActionEntity> getActionEntityRef() {
		return ActionEntityRef;
	}

	public Class<ActionDTO> getActionDtoRef() {
		return ActionDtoRef;
	}

	public void setActionsRepository(JpaRepository<ActionEntity, ?> actionsRepository) {
		this.actionsRepository = actionsRepository;
	}

	public void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	public ActionDTO createAction(ActionDTO actionDetails) {

		HelperMethods.<ActionDTO>setActionIdOfActionDetails(ActionDtoRef.getSimpleName(), actionDetails);

		HelperMethods.<ActionDTO>setActionDateOfActionDetails(ActionDtoRef.getSimpleName(), actionDetails);

		ActionEntity actionEntity = modelMapper.map(actionDetails, getActionEntityRef());

		ActionEntity createdActionEntity = actionsRepository.save(actionEntity);

		ActionDTO createdAction = modelMapper.map(createdActionEntity, getActionDtoRef());

		return createdAction;
	}

	public List<ActionDTO> retrieveActions(ActionDTO actionDetails) {

		ActionEntity actionEntity = modelMapper.map(actionDetails, getActionEntityRef());

		List<ActionEntity> retrievedActionEntitiesList = actionsRepository.findAll(
				Example.of(actionEntity, HelperMethods.<ActionEntity>ignoreNullPathsExampleMatcher(actionEntity)));

		List<ActionDTO> retrievedActionsList = retrievedActionEntitiesList.stream()
				.map(entity -> modelMapper.map(entity, getActionDtoRef())).collect(Collectors.toList());

		return retrievedActionsList;
	}

	public ActionDTO retrieveAction(String actionId) {

		ActionEntity retrievedActionEntity = HelperMethods.<ActionEntity>getByActionId(ActionDtoRef.getSimpleName(),
				getActionEntityRef(), actionsRepository, actionId);

		ActionDTO retrievedAction = modelMapper.map(retrievedActionEntity, getActionDtoRef());

		return retrievedAction;
	}

	public ActionDTO updateAction(ActionDTO actionDetails) {

		String actionId = HelperMethods.<ActionDTO>getActionIdFromActionDetails(ActionDtoRef.getSimpleName(),
				actionDetails);

		if (!HelperMethods.<ActionEntity>existsByActionId(ActionDtoRef.getSimpleName(), actionsRepository, actionId)) {

			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
		}

		Long actionDetailsId = HelperMethods.<ActionEntity>getIdOfActionDetails(ActionDtoRef.getSimpleName(),
				getActionEntityRef(), actionsRepository, actionId);

		ActionEntity actionEntity = modelMapper.map(actionDetails, getActionEntityRef());

		HelperMethods.<ActionEntity>setIdOfActionEntity(actionEntity, actionDetailsId);

		ActionEntity updatedActionEntity = actionsRepository.save(actionEntity);

		ActionDTO updatedAction = modelMapper.map(updatedActionEntity, getActionDtoRef());

		return updatedAction;
	}

	public int deleteAction(String actionId) {

		int deleted = HelperMethods.<ActionEntity>deleteByActionId(ActionDtoRef.getSimpleName(), actionsRepository,
				actionId);

		return deleted;
	}

}
