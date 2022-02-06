package com.weasels.portal.api.actions.shared;

import java.io.Serializable;
import java.util.Date;

public class AssignmentDTO implements Serializable {

	private static final long serialVersionUID = 8098135338648247377L;

	private String assignmentId;
	private String superiorId;
	private String inferiorId;
	private String title;
	private Date assignmentDate;
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

	public Date getAssignmentDate() {
		return assignmentDate;
	}

	public void setAssignmentDate(Date assignmentDate) {
		this.assignmentDate = assignmentDate;
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
