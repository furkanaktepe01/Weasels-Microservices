package com.weasels.portal.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestModel {

	@NotNull(message="First name cannot be null!!")
	@Size(max=25, min=3, message="-FIRST NAME- cannot be longer than 25 or smaller than 3 chars.")
	private String firstName;
	
	@NotNull(message="Last name cannot be null!!")
	@Size(max=25, min=3, message="-LAST NAME- cannot be longer than 25 or smaller than 3 chars.")
	private String lastName;
	
	private String sex;
	
	@NotNull(message="Title cannot be null!!!")
	@Size(max=21, min=3, message="-TITLE- cannot be longer than 21 or smaller than 3 chars.")
	private String title;
	
	@NotNull(message="Department cannot be null!")
	private String department;
	
	private String nationality;
	
	private String country;
	
	private String address;
	
	private String dateOfBirth;
	
	private String phoneNumber;
	
	@NotNull(message="Email cannot be null!!!")
	@Email
	private String email;
	
	private String education;
	
	private int salary;
	
	private int remote;
	
}
