package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

import org.springframework.lang.NonNull;

public class SaveLeavingResponseModel {

	@NonNull
	private String leavingId;

	@NonNull
	private Date leavingDate;

	@NonNull
	private String superiorId;

	@NonNull
	private String inferiorId;

	@NonNull
	private String leavingReason;

	@NonNull
	private String leavingType;

	@NonNull
	private String status;

	public String getLeavingId() {
		return leavingId;
	}

	public void setLeavingId(String leavingId) {
		this.leavingId = leavingId;
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

	public Date getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}

	public String getLeavingReason() {
		return leavingReason;
	}

	public void setLeavingReason(String leavingReason) {
		this.leavingReason = leavingReason;
	}

	public String getLeavingType() {
		return leavingType;
	}

	public void setLeavingType(String leavingType) {
		this.leavingType = leavingType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
