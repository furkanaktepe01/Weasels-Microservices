package com.weasels.portal.api.users.shared;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto implements Serializable{

	private static final long serialVersionUID = -4629112889826507417L;
	
	private long _id;
	private String userId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String sex;
	private String title;
	private String department;
	private String nationality;
	private String country;
	private String address;
	private String dateOfBirth;
	private String entranceDate;
	private String phoneNumber;
	private String email;
	private String password;
	private String education;
	private int salary;
	private int remote;
	private byte remainingPermissionDays;
	
}
