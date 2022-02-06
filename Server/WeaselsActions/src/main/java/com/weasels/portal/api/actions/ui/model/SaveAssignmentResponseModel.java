package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

import org.springframework.lang.NonNull;

public class SaveAssignmentResponseModel {

	@NonNull
	private String assignmentId;

	@NonNull
	private Date assignmentDate;

	@NonNull
	private String superiorId;

	@NonNull
	private String inferiorId;

	@NonNull
	private String title;

	@NonNull
	private String assignmentType;

	public String getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public Date getAssignmentDate() {
		return assignmentDate;
	}

	public void setAssignmentDate(Date assignmentDate) {
		this.assignmentDate = assignmentDate;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAssignmentType() {
		return assignmentType;
	}

	public void setAssignmentType(String assignmentType) {
		this.assignmentType = assignmentType;
	}

}
