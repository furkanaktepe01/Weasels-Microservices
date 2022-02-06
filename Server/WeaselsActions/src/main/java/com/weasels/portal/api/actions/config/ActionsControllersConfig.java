package com.weasels.portal.api.actions.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weasels.portal.api.actions.data.ApplicationEntity;
import com.weasels.portal.api.actions.data.AssignmentEntity;
import com.weasels.portal.api.actions.data.LeavingEntity;
import com.weasels.portal.api.actions.data.PermissionEntity;
import com.weasels.portal.api.actions.data.PromotionEntity;
import com.weasels.portal.api.actions.data.RaiseEntity;
import com.weasels.portal.api.actions.data.ReviewEntity;
import com.weasels.portal.api.actions.service.ActionsService;
import com.weasels.portal.api.actions.shared.ApplicationDTO;
import com.weasels.portal.api.actions.shared.AssignmentDTO;
import com.weasels.portal.api.actions.shared.LeavingDTO;
import com.weasels.portal.api.actions.shared.PermissionDTO;
import com.weasels.portal.api.actions.shared.PromotionDTO;
import com.weasels.portal.api.actions.shared.RaiseDTO;
import com.weasels.portal.api.actions.shared.ReviewDTO;
import com.weasels.portal.api.actions.ui.controllers.ActionsController;
import com.weasels.portal.api.actions.ui.model.ApplicationRequestModel;
import com.weasels.portal.api.actions.ui.model.ApplicationResponseModel;
import com.weasels.portal.api.actions.ui.model.AssignmentRequestModel;
import com.weasels.portal.api.actions.ui.model.AssignmentResponseModel;
import com.weasels.portal.api.actions.ui.model.LeavingRequestModel;
import com.weasels.portal.api.actions.ui.model.LeavingResponseModel;
import com.weasels.portal.api.actions.ui.model.PermissionRequestModel;
import com.weasels.portal.api.actions.ui.model.PermissionResponseModel;
import com.weasels.portal.api.actions.ui.model.PromotionRequestModel;
import com.weasels.portal.api.actions.ui.model.PromotionResponseModel;
import com.weasels.portal.api.actions.ui.model.RaiseRequestModel;
import com.weasels.portal.api.actions.ui.model.RaiseResponseModel;
import com.weasels.portal.api.actions.ui.model.ReviewRequestModel;
import com.weasels.portal.api.actions.ui.model.ReviewResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveApplicationRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveApplicationResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveAssignmentRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveAssignmentResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveLeavingRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveLeavingResponseModel;
import com.weasels.portal.api.actions.ui.model.SavePermissionRequestModel;
import com.weasels.portal.api.actions.ui.model.SavePermissionResponseModel;
import com.weasels.portal.api.actions.ui.model.SavePromotionRequestModel;
import com.weasels.portal.api.actions.ui.model.SavePromotionResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveRaiseRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveRaiseResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveReviewRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveReviewResponseModel;

@Configuration
public class ActionsControllersConfig {

	private final ModelMapper modelMapper;
	private final ActionsService<ApplicationEntity, ApplicationDTO> applicationsService;
	private final ActionsService<AssignmentEntity, AssignmentDTO> assignmentsService;
	private final ActionsService<LeavingEntity, LeavingDTO> leavingsService;
	private final ActionsService<PermissionEntity, PermissionDTO> permissionsService;
	private final ActionsService<PromotionEntity, PromotionDTO> promotionsService;
	private final ActionsService<RaiseEntity, RaiseDTO> raisesService;
	private final ActionsService<ReviewEntity, ReviewDTO> reviewsService;

	@Autowired
	public ActionsControllersConfig(ModelMapper modelMapper,
			ActionsService<ApplicationEntity, ApplicationDTO> applicationsService,
			ActionsService<AssignmentEntity, AssignmentDTO> assignmentsService,
			ActionsService<LeavingEntity, LeavingDTO> leavingsService,
			ActionsService<PermissionEntity, PermissionDTO> permissionsService,
			ActionsService<PromotionEntity, PromotionDTO> promotionsService,
			ActionsService<RaiseEntity, RaiseDTO> raisesService,
			ActionsService<ReviewEntity, ReviewDTO> reviewsService) {
		this.modelMapper = modelMapper;
		this.applicationsService = applicationsService;
		this.assignmentsService = assignmentsService;
		this.leavingsService = leavingsService;
		this.permissionsService = permissionsService;
		this.promotionsService = promotionsService;
		this.raisesService = raisesService;
		this.reviewsService = reviewsService;
	}

	@Bean
	public ActionsController<?, ?, ?, ?, ?, ?> applicationController() {

		ActionsController<ApplicationEntity, ApplicationDTO, ApplicationRequestModel, ApplicationResponseModel, SaveApplicationRequestModel, SaveApplicationResponseModel> applicationController = new ActionsController<>(
				ApplicationDTO.class, ApplicationRequestModel.class, ApplicationResponseModel.class,
				SaveApplicationRequestModel.class, SaveApplicationResponseModel.class);

		applicationController.setActionsService(applicationsService);

		applicationController.setModelMapper(modelMapper);

		return applicationController;
	}

	@Bean
	public ActionsController<?, ?, ?, ?, ?, ?> assignmentController() {

		ActionsController<AssignmentEntity, AssignmentDTO, AssignmentRequestModel, AssignmentResponseModel, SaveAssignmentRequestModel, SaveAssignmentResponseModel> assignmentController = new ActionsController<>(
				AssignmentDTO.class, AssignmentRequestModel.class, AssignmentResponseModel.class,
				SaveAssignmentRequestModel.class, SaveAssignmentResponseModel.class);

		assignmentController.setActionsService(assignmentsService);

		assignmentController.setModelMapper(modelMapper);

		return assignmentController;
	}

	@Bean
	public ActionsController<?, ?, ?, ?, ?, ?> leavingController() {

		ActionsController<LeavingEntity, LeavingDTO, LeavingRequestModel, LeavingResponseModel, SaveLeavingRequestModel, SaveLeavingResponseModel> leavingController = new ActionsController<>(
				LeavingDTO.class, LeavingRequestModel.class, LeavingResponseModel.class, SaveLeavingRequestModel.class,
				SaveLeavingResponseModel.class);

		leavingController.setActionsService(leavingsService);

		leavingController.setModelMapper(modelMapper);

		return leavingController;
	}

	@Bean
	public ActionsController<?, ?, ?, ?, ?, ?> permissionController() {

		ActionsController<PermissionEntity, PermissionDTO, PermissionRequestModel, PermissionResponseModel, SavePermissionRequestModel, SavePermissionResponseModel> permissionController = new ActionsController<>(
				PermissionDTO.class, PermissionRequestModel.class, PermissionResponseModel.class,
				SavePermissionRequestModel.class, SavePermissionResponseModel.class);

		permissionController.setActionsService(permissionsService);

		permissionController.setModelMapper(modelMapper);

		return permissionController;
	}

	@Bean
	public ActionsController<?, ?, ?, ?, ?, ?> promotionController() {

		ActionsController<PromotionEntity, PromotionDTO, PromotionRequestModel, PromotionResponseModel, SavePromotionRequestModel, SavePromotionResponseModel> promotionController = new ActionsController<>(
				PromotionDTO.class, PromotionRequestModel.class, PromotionResponseModel.class,
				SavePromotionRequestModel.class, SavePromotionResponseModel.class);

		promotionController.setActionsService(promotionsService);

		promotionController.setModelMapper(modelMapper);

		return promotionController;
	}

	@Bean
	public ActionsController<?, ?, ?, ?, ?, ?> raiseController() {

		ActionsController<RaiseEntity, RaiseDTO, RaiseRequestModel, RaiseResponseModel, SaveRaiseRequestModel, SaveRaiseResponseModel> raiseController = new ActionsController<>(
				RaiseDTO.class, RaiseRequestModel.class, RaiseResponseModel.class, SaveRaiseRequestModel.class,
				SaveRaiseResponseModel.class);

		raiseController.setActionsService(raisesService);

		raiseController.setModelMapper(modelMapper);

		return raiseController;
	}

	@Bean
	public ActionsController<?, ?, ?, ?, ?, ?> reviewController() {

		ActionsController<ReviewEntity, ReviewDTO, ReviewRequestModel, ReviewResponseModel, SaveReviewRequestModel, SaveReviewResponseModel> reviewController = new ActionsController<>(
				ReviewDTO.class, ReviewRequestModel.class, ReviewResponseModel.class, SaveReviewRequestModel.class,
				SaveReviewResponseModel.class);

		reviewController.setActionsService(reviewsService);

		reviewController.setModelMapper(modelMapper);

		return reviewController;
	}

}
