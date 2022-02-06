package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

import javax.validation.constraints.Email;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SaveApplicationRequestModel {

	private String applicationId;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date applicationDate;

	@NonNull
	private String firstName;

	@NonNull
	private String lastName;

	@NonNull
	private String sex;

	@NonNull
	private String title;

	@NonNull
	private String departmentId;

	@NonNull
	private String nationality;

	@NonNull
	private String country;

	@NonNull
	private String address;

	@NonNull
	private String dateOfBirth;

	@NonNull
	private String phoneNumber;

	@NonNull
	@Email
	private String email;

	@NonNull
	private String education;

	@NonNull
	private String remote;

	@NonNull
	private int salary;

	private String finalDecision;
	private int teamLeadsApprovalScore;
	private int teamLeadsAbstinenceScore;
	private int teamLeadsRejectionScore;
	private String humanResourcesOfficerId;
	private String humanResourcesOfficerDecision;
	private String humanResourcesOfficerNotes;
	private String departmentSupervisorId;
	private String departmentSupervisorDecision;
	private String departmentSupervisorNotes;
	private Date decisionDate;

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

	public Date getDecisionDate() {
		return decisionDate;
	}

	public void setDecisionDate(Date decisionDate) {
		this.decisionDate = decisionDate;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getRemote() {
		return remote;
	}

	public void setRemote(String remote) {
		this.remote = remote;
	}

	public String getFinalDecision() {
		return finalDecision;
	}

	public void setFinalDecision(String finalDecision) {
		this.finalDecision = finalDecision;
	}

}
