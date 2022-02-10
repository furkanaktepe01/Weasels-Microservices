package com.weasels.portal.api.email.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "emails")
public class EmailEntity implements Serializable {

	private static final long serialVersionUID = -8349010390624423387L;

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String emailId;

	@Column
	@NotNull
	private String senderEmail;

	@Column
	@NotNull
	private String receiverEmail;

	@Column
	@NotNull
	private String header;

	@Column
	@NotNull
	private String content;

	@Column
	@NotNull
	private Date sendingDate;

	@Column
	private Date editingDate;

	@Column
	private String deletedBySender;

	@Column
	private String deletedByReceiver;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
