package com.weasels.portal.api.actions.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assignments")
public class AssignmentEntity implements Serializable {

	private static final long serialVersionUID = 3761505236270637942L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, unique = true)
	private String assignmentId;

	@Column
	private String superiorId;

	@Column
	private String inferiorId;

	@Column
	private String title;

	@Column
	private Date assignmentDate;

	@Column
	private String exTeamId;

	@Column
	private String exMissionId;

	@Column
	private String newTeamId;

	@Column
	private String newMissionId;

	@Column
	private String assignmentReason;

	@Column
	private String assignmentType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
