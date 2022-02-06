package com.weasels.portal.api.actions.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ReviewsRepository extends JpaRepository<ReviewEntity, Long> {

	boolean existsByReviewId(String reviewId);

	ReviewEntity getByReviewId(String reviewId);

	@Transactional
	int deleteByReviewId(String reviewId);

}
