package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

public class PermissionResponseModel {

	private String permissionId;
	private String superiorId;
	private String inferiorId;
	private Date responseDate;
	private String permissionType;
	private int permissionAmountInDays;
	private String status;

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
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

	public String getPermissionType() {
		return permissionType;
	}

	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
	}

	public int getPermissionAmountInDays() {
		return permissionAmountInDays;
	}

	public void setPermissionAmountInDays(int permissionAmountInDays) {
		this.permissionAmountInDays = permissionAmountInDays;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
