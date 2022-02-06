package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

public class AssignmentRequestModel {

	private String assignmentId;
	private Date assignmentDate;
	private String superiorId;
	private String inferiorId;
	private String title;
	private String exTeamId;
	private String exMissionId;
	private String newTeamId;
	private String newMissionId;
	private String assignmentReason;
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
