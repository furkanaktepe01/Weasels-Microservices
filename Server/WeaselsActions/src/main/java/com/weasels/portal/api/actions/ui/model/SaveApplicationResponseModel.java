package com.weasels.portal.api.actions.ui.model;

import java.util.Date;

import org.springframework.lang.NonNull;

public class SaveApplicationResponseModel {

	@NonNull
	private String applicationId;

	@NonNull
	private Date applicationDate;

	@NonNull
	private String firstName;

	@NonNull
	private String lastName;

	@NonNull
	private String title;

	@NonNull
	private String departmentId;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
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

}
