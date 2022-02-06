package com.weasels.portal.api.actions.shared;

import java.io.Serializable;
import java.util.Date;

public class PromotionDTO implements Serializable {

	private static final long serialVersionUID = 4094778401871671902L;

	private String promotionId;
	private String superiorId;
	private String inferiorId;
	private Date responseDate;
	private String promotionReason;
	private String exTitle;
	private String newTitle;
	private String status;

	public String getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getSuperiorId() {
		return superiorId;
	}

	public void setSuperiorId(String superiorId) {
		this.superiorId = superiorId;
	}

	public String getInferiorId() {
		return inferiorId;
	}

	public void setInferiorId(String inferiorId) {
		this.inferiorId = inferiorId;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}

	public String getPromotionReason() {
		return promotionReason;
	}

	public void setPromotionReason(String promotionReason) {
		this.promotionReason = promotionReason;
	}

	public String getExTitle() {
		return exTitle;
	}

	public void setExTitle(String exTitle) {
		this.exTitle = exTitle;
	}

	public String getNewTitle() {
		return newTitle;
	}

	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
