package com.employment.employee.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tblcompensation")
public class Compensation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private int id;
	
	@Getter
	@Setter
	private int emp_id;
	
	@Getter
	@Setter
	private int comp_type_id;
	
	@NotNull
	@Getter
	@Setter
	private double amount;
	
	@NotNull
	@NotBlank
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private Date date;
}
