package com.weasels.portal.api.actions.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "applications")
public class ApplicationEntity implements Serializable {

	private static final long serialVersionUID = -5961679759947259145L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, unique = true)
	private String applicationId;

	@Column
	private String finalDecision;

	@Column
	private int teamLeadsApprovalScore;

	@Column
	private int teamLeadsAbstinenceScore;

	@Column
	private int teamLeadsRejectionScore;

	@Column
	private String humanResourcesOfficerId;

	@Column
	private String humanResourcesOfficerDecision;

	@Column
	private String humanResourcesOfficerNotes;

	@Column
	private String departmentSupervisorId;

	@Column
	private String departmentSupervisorDecision;

	@Column
	private String departmentSupervisorNotes;

	@Column(nullable = false)
	private Date applicationDate;

	@Column
	private Date decisionDate;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String sex;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String departmentId;

	@Column(nullable = false)
	private String nationality;

	@Column(nullable = false)
	private String country;

	@Column(nullable = false)
	private String address;

	@Column(nullable = false)
	private String dateOfBirth;

	@Column(nullable = false)
	private String phoneNumber;

	@Column(nullable = false)
	@Email
	private String email;

	@Column(nullable = false)
	private String education;

	@Column(nullable = false)
	private String remote;

	@Column(nullable = false)
	private int salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public int getTeamLeadsApprovalScore() {
		return teamLeadsApprovalScore;
	}

	public void setTeamLeadsApprovalScore(int teamLeadsApprovalScore) {
		this.teamLeadsApprovalScore = teamLeadsApprovalScore;
	}

	public int getTeamLeadsAbstinenceScore() {
		return teamLeadsAbstinenceScore;
	}

	public void setTeamLeadsAbstinenceScore(int teamLeadsAbstinenceScore) {
		this.teamLeadsAbstinenceScore = teamLeadsAbstinenceScore;
	}

	public int getTeamLeadsRejectionScore() {
		return teamLeadsRejectionScore;
	}

	public void setTeamLeadsRejectionScore(int teamLeadsRejectionScore) {
		this.teamLeadsRejectionScore = teamLeadsRejectionScore;
	}

	public String getHumanResourcesOfficerId() {
		return humanResourcesOfficerId;
	}

	public void setHumanResourcesOfficerId(String humanResourcesOfficerId) {
		this.humanResourcesOfficerId = humanResourcesOfficerId;
	}

	public String getHumanResourcesOfficerDecision() {
		return humanResourcesOfficerDecision;
	}

	public void setHumanResourcesOfficerDecision(String humanResourcesOfficerDecision) {
		this.humanResourcesOfficerDecision = humanResourcesOfficerDecision;
	}

	public String getHumanResourcesOfficerNotes() {
		return humanResourcesOfficerNotes;
	}

	public void setHumanResourcesOfficerNotes(String humanResourcesOfficerNotes) {
		this.humanResourcesOfficerNotes = humanResourcesOfficerNotes;
	}

	public String getDepartmentSupervisorId() {
		return departmentSupervisorId;
	}

	public void setDepartmentSupervisorId(String departmentSupervisorId) {
		this.departmentSupervisorId = departmentSupervisorId;
	}

	public String getDepartmentSupervisorDecision() {
		return departmentSupervisorDecision;
	}

	public void setDepartmentSupervisorDecision(String departmentSupervisorDecision) {
		this.departmentSupervisorDecision = departmentSupervisorDecision;
	}

	public String getDepartmentSupervisorNotes() {
		return departmentSupervisorNotes;
	}

	public void setDepartmentSupervisorNotes(String departmentSupervisorNotes) {
		this.departmentSupervisorNotes = departmentSupervisorNotes;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Date getDecisionDate() {
		return decisionDate;
	}

	public void setDecisionDate(Date decisionDate) {
		this.decisionDate = decisionDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFinalDecision() {
		return finalDecision;
	}

	public void setFinalDecision(String finalDecision) {
		this.finalDecision = finalDecision;
	}

	public String getRemote() {
		return remote;
	}

	public void setRemote(String remote) {
		this.remote = remote;
	}

}
