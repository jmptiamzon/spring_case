package com.employment.employee.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tblemployee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private int id;
	
	@NotNull
	@NotBlank
	@Getter
	@Setter
	private String firstname;
	
	@Getter
	@Setter
	private String middlename;
	
	@NotNull
	@NotBlank
	@Getter
	@Setter
	private String lastname;
	
	@NotNull
	@NotBlank
	@Getter
	@Setter
	private Date birthdate;
	
	@NotNull
	@NotBlank
	@Getter
	@Setter
	private String position;
	
	
	// Add Timestamp
}
