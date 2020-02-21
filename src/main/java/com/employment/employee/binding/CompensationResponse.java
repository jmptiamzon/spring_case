package com.employment.employee.binding;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompensationResponse {
	@Getter
	@Setter
	private int compId;
	
	@Getter
	@Setter
	private int empId;
	
	@Getter
	@Setter
	private int compTypeId;
	
	@Getter
	@Setter
	private String empName;
	
	@Getter
	@Setter
	private String compType;
	
	@Getter
	@Setter
	private Double amount;
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private Date date;
}
