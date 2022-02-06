package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SaveAssignmentRequestModel {

	private String assignmentId;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date assignmentDate;

	@NonNull
	private String superiorId;

	@NonNull
	private String inferiorId;

	@NonNull
	private String title;

	@NonNull
	private String exTeamId;

	@NonNull
	private String exMissionId;

	@NonNull
	private String newTeamId;

	@NonNull
	private String newMissionId;

	@NonNull
	private String assignmentReason;

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

	public String getExTeamId() {
		return exTeamId;
	}

	public void setExTeamId(String exTeamId) {
		this.exTeamId = exTeamId;
	}

	public String getExMissionId() {
		return exMissionId;
	}

	public void setExMissionId(String exMissionId) {
		this.exMissionId = exMissionId;
	}

	public String getNewTeamId() {
		return newTeamId;
	}

	public void setNewTeamId(String newTeamId) {
		this.newTeamId = newTeamId;
	}

	public String getNewMissionId() {
		return newMissionId;
	}

	public void setNewMissionId(String newMissionId) {
		this.newMissionId = newMissionId;
	}

	public String getAssignmentReason() {
		return assignmentReason;
	}

	public void setAssignmentReason(String assignmentReason) {
		this.assignmentReason = assignmentReason;
	}

	public String getAssignmentType() {
		return assignmentType;
	}

	public void setAssignmentType(String assignmentType) {
		this.assignmentType = assignmentType;
	}

}
