package com.employment.employee.binding;
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
public class CompensationTypeRequest {
	@Getter
	@Setter
	private int id;
	
	@NotNull
	@NotBlank
	@Getter
	@Setter
	private String compensationType;
}
