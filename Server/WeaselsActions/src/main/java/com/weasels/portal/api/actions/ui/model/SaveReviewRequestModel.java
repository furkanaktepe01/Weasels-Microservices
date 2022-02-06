package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SaveReviewRequestModel {

	private String reviewId;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date reviewDate;

	@NonNull
	private String senderSuperiorId;

	@NonNull
	private String receiverSuperiorId;

	@NonNull
	private String inferiorId;

	@NonNull
	private String header;

	@NonNull
	private String content;

	@NonNull
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
