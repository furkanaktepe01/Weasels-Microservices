package com.weasels.portal.api.actions;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weasels.portal.api.actions.data.ApplicationEntity;
import com.weasels.portal.api.actions.data.ApplicationsRepository;
import com.weasels.portal.api.actions.data.AssignmentEntity;
import com.weasels.portal.api.actions.data.AssignmentsRepository;
import com.weasels.portal.api.actions.data.LeavingEntity;
import com.weasels.portal.api.actions.data.LeavingsRepository;
import com.weasels.portal.api.actions.data.PermissionEntity;
import com.weasels.portal.api.actions.data.PermissionsRepository;
import com.weasels.portal.api.actions.data.PromotionEntity;
import com.weasels.portal.api.actions.data.PromotionsRepository;
import com.weasels.portal.api.actions.data.RaiseEntity;
import com.weasels.portal.api.actions.data.RaisesRepository;
import com.weasels.portal.api.actions.data.ReviewEntity;
import com.weasels.portal.api.actions.data.ReviewsRepository;
import com.weasels.portal.api.actions.service.ActionsService;
import com.weasels.portal.api.actions.shared.ApplicationDTO;
import com.weasels.portal.api.actions.shared.AssignmentDTO;
import com.weasels.portal.api.actions.shared.LeavingDTO;
import com.weasels.portal.api.actions.shared.PermissionDTO;
import com.weasels.portal.api.actions.shared.PromotionDTO;
import com.weasels.portal.api.actions.shared.RaiseDTO;
import com.weasels.portal.api.actions.shared.ReviewDTO;

@Configuration
public class ActionsServicesConfig {

	private final ModelMapper modelMapper;
	private final ApplicationsRepository applicationsRepository;
	private final AssignmentsRepository assignmentsRepository;
	private final LeavingsRepository leavingsRepository;
	private final PermissionsRepository permissionsRepository;
	private final PromotionsRepository promotionsRepository;
	private final RaisesRepository raisesRepository;
	private final ReviewsRepository reviewsRepository;

	@Autowired
	public ActionsServicesConfig(ModelMapper modelMapper, ApplicationsRepository applicationsRepository,
			AssignmentsRepository assignmentsRepository, LeavingsRepository leavingsRepository,
			PermissionsRepository permissionsRepository, PromotionsRepository promotionsRepository,
			RaisesRepository raisesRepository, ReviewsRepository reviewsRepository) {
		this.modelMapper = modelMapper;
		this.applicationsRepository = applicationsRepository;
		this.assignmentsRepository = assignmentsRepository;
		this.leavingsRepository = leavingsRepository;
		this.permissionsRepository = permissionsRepository;
		this.promotionsRepository = promotionsRepository;
		this.raisesRepository = raisesRepository;
		this.reviewsRepository = reviewsRepository;
	}

	@Bean
	public ActionsService<ApplicationEntity, ApplicationDTO> applicationsService() {

		ActionsService<ApplicationEntity, ApplicationDTO> applicationsService = new ActionsService<>(
				ApplicationEntity.class, ApplicationDTO.class);

		applicationsService.setActionsRepository(applicationsRepository);

		applicationsService.setModelMapper(modelMapper);

		return applicationsService;
	}

	@Bean
	public ActionsService<AssignmentEntity, AssignmentDTO> assignmentsService() {

		ActionsService<AssignmentEntity, AssignmentDTO> assignmentsService = new ActionsService<>(
				AssignmentEntity.class, AssignmentDTO.class);

		assignmentsService.setActionsRepository(assignmentsRepository);

		assignmentsService.setModelMapper(modelMapper);

		return assignmentsService;
	}

	@Bean
	public ActionsService<LeavingEntity, LeavingDTO> leavingsService() {

		ActionsService<LeavingEntity, LeavingDTO> leavingsService = new ActionsService<>(LeavingEntity.class,
				LeavingDTO.class);

		leavingsService.setActionsRepository(leavingsRepository);

		leavingsService.setModelMapper(modelMapper);

		return leavingsService;
	}

	@Bean
	public ActionsService<PermissionEntity, PermissionDTO> permissionsService() {

		ActionsService<PermissionEntity, PermissionDTO> permissionsService = new ActionsService<>(
				PermissionEntity.class, PermissionDTO.class);

		permissionsService.setActionsRepository(permissionsRepository);

		permissionsService.setModelMapper(modelMapper);

		return permissionsService;
	}

	@Bean
	public ActionsService<PromotionEntity, PromotionDTO> promotionsService() {

		ActionsService<PromotionEntity, PromotionDTO> promotionsService = new ActionsService<>(PromotionEntity.class,
				PromotionDTO.class);

		promotionsService.setActionsRepository(promotionsRepository);

		promotionsService.setModelMapper(modelMapper);

		return promotionsService;
	}

	@Bean
	public ActionsService<RaiseEntity, RaiseDTO> raisesService() {

		ActionsService<RaiseEntity, RaiseDTO> raisesService = new ActionsService<>(RaiseEntity.class, RaiseDTO.class);

		raisesService.setActionsRepository(raisesRepository);

		raisesService.setModelMapper(modelMapper);

		return raisesService;
	}

	@Bean
	public ActionsService<ReviewEntity, ReviewDTO> reviewsService() {

		ActionsService<ReviewEntity, ReviewDTO> reviewsService = new ActionsService<>(ReviewEntity.class,
				ReviewDTO.class);

		reviewsService.setActionsRepository(reviewsRepository);

		reviewsService.setModelMapper(modelMapper);

		return reviewsService;
	}

}
