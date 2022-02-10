package com.weasels.portal.api.users.ui.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserRequestModel {
	
	private String firstName;
	private String lastName;
	private String sex;
	private String nationality;
	private String country;
	private String address;
	private String dateOfBirth;
	private String phoneNumber;
	private String email;
	private String education;
	private int remote;

}
