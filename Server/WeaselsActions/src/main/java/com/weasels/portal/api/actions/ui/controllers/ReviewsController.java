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

import com.weasels.portal.api.actions.data.ReviewEntity;
import com.weasels.portal.api.actions.shared.ReviewDTO;
import com.weasels.portal.api.actions.ui.model.ReviewRequestModel;
import com.weasels.portal.api.actions.ui.model.ReviewResponseModel;
import com.weasels.portal.api.actions.ui.model.SaveReviewRequestModel;
import com.weasels.portal.api.actions.ui.model.SaveReviewResponseModel;

@RestController
@RequestMapping("/reviews")
public class ReviewsController {

	@Autowired
	ActionsController<ReviewEntity, ReviewDTO, ReviewRequestModel, ReviewResponseModel, SaveReviewRequestModel, SaveReviewResponseModel> reviewController;	
	
	@PostMapping("/new")
	public ResponseEntity<SaveReviewResponseModel> createReviewHandler(
			@Valid @RequestBody SaveReviewRequestModel reviewDetails) {

		return reviewController.createAction(reviewDetails);
	}

	@GetMapping
	public ResponseEntity<List<ReviewResponseModel>> getReviewsHandler(@RequestBody ReviewRequestModel reviewDetails) {

		return reviewController.getActions(reviewDetails);
	}

	@GetMapping("/{reviewId}")
	public ResponseEntity<ReviewResponseModel> getReviewHandler(@PathVariable("reviewId") String reviewId) {

		return reviewController.getAction(reviewId);
	}

	@PutMapping
	public ResponseEntity<SaveReviewResponseModel> updateReviewHandler(
			@Valid @RequestBody SaveReviewRequestModel reviewDetails) {

		return reviewController.updateAction(reviewDetails);
	}

	@DeleteMapping("/{reviewId}")
	public ResponseEntity<?> deleteReviewHandler(@PathVariable("reviewId") String reviewId) {

		return reviewController.deleteAction(reviewId);
	}
	
}
