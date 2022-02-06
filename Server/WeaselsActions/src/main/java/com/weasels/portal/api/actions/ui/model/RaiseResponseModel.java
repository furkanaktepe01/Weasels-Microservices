package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

public class RaiseResponseModel {

	private String raiseId;
	private String superiorId;
	private String inferiorId;
	private Date responseDate;
	private String raiseReason;
	private String exSalary;
	private String newSalary;
	private int raiseAmount;
	private String status;

	public String getRaiseId() {
		return raiseId;
	}

	public void setRaiseId(String raiseId) {
		this.raiseId = raiseId;
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

	public String getRaiseReason() {
		return raiseReason;
	}

	public void setRaiseReason(String raiseReason) {
		this.raiseReason = raiseReason;
	}

	public String getExSalary() {
		return exSalary;
	}

	public void setExSalary(String exSalary) {
		this.exSalary = exSalary;
	}

	public String getNewSalary() {
		return newSalary;
	}

	public void setNewSalary(String newSalary) {
		this.newSalary = newSalary;
	}

	public int getRaiseAmount() {
		return raiseAmount;
	}

	public void setRaiseAmount(int raiseAmount) {
		this.raiseAmount = raiseAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
