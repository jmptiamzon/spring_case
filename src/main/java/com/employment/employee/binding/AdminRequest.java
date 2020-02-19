package com.employment.employee.binding;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminRequest {

	@Getter
	@Setter
	@NotBlank
	private String email;
	
	@Getter
	@Setter
	@NotBlank
	private String password;
}
