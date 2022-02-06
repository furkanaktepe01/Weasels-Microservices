package com.weasels.portal.api.actions.shared;

import java.io.Serializable;
import java.util.Date;

public class LeavingDTO implements Serializable {

	private static final long serialVersionUID = 3142558794575691625L;

	private String leavingId;
	private String superiorId;
	private String inferiorId;
	private Date leavingDate;
	private String leavingReason;
	private String leavingType;
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
