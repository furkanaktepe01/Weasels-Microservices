package com.weasels.portal.api.users.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Singular;


@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long _id;
	private String userId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String sex;
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

	@ManyToOne(cascade= { CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="titleId")
	private Title title;
	
	@ManyToOne(cascade= { CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="teamId")
	private Team team;
	
	@ManyToOne(cascade= { CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="missionId")
	private Mission mission;

	@Singular
	// TODO: Review the Cascade Type
	@ManyToMany(cascade=CascadeType.PERSIST) 
    @JoinTable( 
        name = "users_roles", 
        joinColumns = @JoinColumn(
          name = "user_id", referencedColumnName = "userId"), 
        inverseJoinColumns = @JoinColumn(
          name = "role_id", referencedColumnName = "roleId"))
	private Collection<Authority> roles;
	
	
	
	

}