package com.weasels.portal.api.actions.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permissions")
public class PermissionEntity implements Serializable {

	private static final long serialVersionUID = -1804478782213347924L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, unique = true)
	private String permissionId;

	@Column
	private String superiorId;

	@Column
	private String inferiorId;

	@Column
	private Date responseDate;

	@Column
	private String permissionType;

	@Column
	private int permissionAmountInDays;

	@Column
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
