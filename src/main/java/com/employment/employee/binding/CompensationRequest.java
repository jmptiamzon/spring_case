package com.employment.employee.binding;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompensationRequest {	
	@Getter
	@Setter
	private int id;
	
	@NotNull
	@Getter
	@Setter
	private int emp_id;
	
	@NotNull
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
