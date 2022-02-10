package com.weasels.portal.api.email.shared;

import java.io.Serializable;
import java.util.Date;

public class EmailDTO implements Serializable {

	private static final long serialVersionUID = -4629112889826507417L;

	private String emailId;
	private String senderEmail;
	private String receiverEmail;
	private String header;
	private String content;
	private Date sendingDate;
	private Date editingDate;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSendingDate() {
		return sendingDate;
	}

	public void setSendingDate(Date sendingDate) {
		this.sendingDate = sendingDate;
	}

	public Date getEditingDate() {
		return editingDate;
	}

	public void setEditingDate(Date editingDate) {
		this.editingDate = editingDate;
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
