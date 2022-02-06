package com.weasels.portal.api.actions.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PromotionsRepository extends JpaRepository<PromotionEntity, Long> {

	boolean existsByPromotionId(String promotionId);

	PromotionEntity getByPromotionId(String promotionId);

	@Transactional
	int deleteByPromotionId(String promotionId);

}
