package com.employment.employee.binding;

import java.sql.Date;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {
	
	@Getter
	@Setter
	private int id;
	
	@Getter
	@Setter
	@NotBlank
	private String firstname;
	
	@Getter
	@Setter
	private String middlename;
	
	@Getter
	@Setter
	@NotBlank
	private String lastname;
	
	@Getter
	@Setter
	@NotBlank
	private Date birthdate;
	
	@Getter
	@Setter
	@NotBlank
	private String position;
	
}
