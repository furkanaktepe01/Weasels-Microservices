package com.weasels.portal.api.actions.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
public class ReviewEntity implements Serializable {

	private static final long serialVersionUID = -3093806621646173414L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, unique = true)
	private String reviewId;

	@Column
	private String senderSuperiorId;

	@Column
	private String receiverSuperiorId;

	@Column
	private String inferiorId;

	@Column
	private Date reviewDate;

	@Column
	private String header;

	@Column
	private String content;

	@Column
	private String signed;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getSenderSuperiorId() {
		return senderSuperiorId;
	}

	public void setSenderSuperiorId(String senderSuperiorId) {
		this.senderSuperiorId = senderSuperiorId;
	}

	public String getReceiverSuperiorId() {
		return receiverSuperiorId;
	}

	public void setReceiverSuperiorId(String receiverSuperiorId) {
		this.receiverSuperiorId = receiverSuperiorId;
	}

	public String getInferiorId() {
		return inferiorId;
	}

	public void setInferiorId(String inferiorId) {
		this.inferiorId = inferiorId;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSigned() {
		return signed;
	}

	public void setSigned(String signed) {
		this.signed = signed;
	}

}
