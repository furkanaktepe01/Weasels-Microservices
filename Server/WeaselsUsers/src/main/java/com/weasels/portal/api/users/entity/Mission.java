package com.weasels.portal.api.users.entity;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
@Table(name="teams")
public class Mission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long _id;
		
	private String missionId;
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate finishDate;
	private String status;
	private String statusReason;
	private long budget;
	
	@OneToOne(cascade= { CascadeType.DETACH, CascadeType.MERGE,
						CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="userId")
	private User manager;
	
	@OneToMany(mappedBy="mission", 
			cascade= { CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH})
	private Set<Team> teams;
		
	@OneToMany(mappedBy="mission", 
			cascade= { CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH})
	private Set<User> employees;
		
}
