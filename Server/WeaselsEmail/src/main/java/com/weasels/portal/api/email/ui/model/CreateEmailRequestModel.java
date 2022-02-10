package com.weasels.portal.api.email.ui.model;

import javax.validation.constraints.Email;

public class CreateEmailRequestModel {

	@Email
	private String senderEmail;

	@Email
	private String receiverEmail;

	private String header = "no-header";

	private String content = "";

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

}
