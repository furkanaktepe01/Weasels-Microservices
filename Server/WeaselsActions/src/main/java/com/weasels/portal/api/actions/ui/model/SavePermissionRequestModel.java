package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SavePermissionRequestModel {

	private String permissionId;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date responseDate;

	@NonNull
	private String superiorId;

	@NonNull
	private String inferiorId;

	@NonNull
	private String permissionType;

	@NonNull
	private int permissionAmountInDays;

	@NonNull
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
