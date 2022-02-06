package com.weasels.portal.api.actions.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leavings")
public class LeavingEntity implements Serializable {

	private static final long serialVersionUID = 7689671987263366755L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, unique = true)
	private String leavingId;

	@Column
	private String superiorId;

	@Column
	private String inferiorId;

	@Column
	private Date leavingDate;

	@Column
	private String leavingReason;

	@Column
	private String leavingType;

	@Column
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
