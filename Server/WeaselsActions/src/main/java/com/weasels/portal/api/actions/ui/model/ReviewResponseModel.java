package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

public class ReviewResponseModel {

	private String reviewId;
	private String senderSuperiorId;
	private String receiverSuperiorId;
	private String inferiorId;
	private Date reviewDate;
	private String header;
	private String content;
	private String signed;

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
