package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SavePromotionRequestModel {

	private String promotionId;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date responseDate;

	@NonNull
	private String superiorId;

	@NonNull
	private String inferiorId;

	@NonNull
	private String promotionReason;

	@NonNull
	private String exTitle;

	@NonNull
	private String newTitle;

	@NonNull
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
