package com.weasels.portal.api.actions.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "promotions")
public class PromotionEntity implements Serializable {

	private static final long serialVersionUID = -6523275376847430159L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, unique = true)
	private String promotionId;

	@Column
	private String superiorId;

	@Column
	private String inferiorId;

	@Column
	private Date responseDate;

	@Column
	private String promotionReason;

	@Column
	private String exTitle;

	@Column
	private String newTitle;

	@Column
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
