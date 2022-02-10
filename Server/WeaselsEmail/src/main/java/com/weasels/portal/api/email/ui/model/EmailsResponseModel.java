package com.weasels.portal.api.email.ui.model;

import java.util.Date;

public class EmailsResponseModel {

	private String emailId;
	private String senderEmail;
	private String receiverEmail;
	private String header;
	private Date sendingDate;
	private String deletedBySender;
	private String deletedByReceiver;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getReceiverEmail() {
		return receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Date getSendingDate() {
		return sendingDate;
	}

	public void setSendingDate(Date sendingDate) {
		this.sendingDate = sendingDate;
	}

	public String getDeletedBySender() {
		return deletedBySender;
	}

	public void setDeletedBySender(String deletedBySender) {
		this.deletedBySender = deletedBySender;
	}

	public String getDeletedByReceiver() {
		return deletedByReceiver;
	}

	public void setDeletedByReceiver(String deletedByReceiver) {
		this.deletedByReceiver = deletedByReceiver;
	}

}
