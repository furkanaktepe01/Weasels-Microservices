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

import com.weasels.portal.api.actions.data.PromotionEntity;
import com.weasels.portal.api.actions.shared.PromotionDTO;
import com.weasels.portal.api.actions.ui.model.PromotionRequestModel;
import com.weasels.portal.api.actions.ui.model.PromotionResponseModel;
import com.weasels.portal.api.actions.ui.model.SavePromotionRequestModel;
import com.weasels.portal.api.actions.ui.model.SavePromotionResponseModel;

@RestController
@RequestMapping("/promotions")
public class PromotionsController {

	@Autowired
	ActionsController<PromotionEntity, PromotionDTO, PromotionRequestModel, PromotionResponseModel, SavePromotionRequestModel, SavePromotionResponseModel> promotionController;

	@PostMapping("/new")
	public ResponseEntity<SavePromotionResponseModel> createPromotionHandler(
			@Valid @RequestBody SavePromotionRequestModel promotionDetails) {

		return promotionController.createAction(promotionDetails);
	}

	@GetMapping
	public ResponseEntity<List<PromotionResponseModel>> getPromotionsHandler(
			@RequestBody PromotionRequestModel promotionDetails) {

		return promotionController.getActions(promotionDetails);
	}

	@GetMapping("/{promotionId}")
	public ResponseEntity<PromotionResponseModel> getPromotionHandler(@PathVariable("promotionId") String promotionId) {

		return promotionController.getAction(promotionId);
	}

	@PutMapping
	public ResponseEntity<SavePromotionResponseModel> updatePromotionHandler(
			@Valid @RequestBody SavePromotionRequestModel promotionDetails) {

		return promotionController.updateAction(promotionDetails);
	}

	@DeleteMapping("/{promotionId}")
	public ResponseEntity<?> deletePromotionHandler(@PathVariable("promotionId") String promotionId) {

		return promotionController.deleteAction(promotionId);
	}

}
