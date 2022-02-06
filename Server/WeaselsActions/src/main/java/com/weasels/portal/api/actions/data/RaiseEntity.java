package com.weasels.portal.api.actions.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "raises")
public class RaiseEntity implements Serializable {

	private static final long serialVersionUID = 746100400329941149L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, unique = true)
	private String raiseId;

	@Column
	private String superiorId;

	@Column
	private String inferiorId;

	@Column
	private Date responseDate;

	@Column
	private String raiseReason;

	@Column
	private String exSalary;

	@Column
	private String newSalary;

	@Column
	private int raiseAmount;

	@Column
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
