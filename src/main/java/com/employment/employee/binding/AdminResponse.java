package com.employment.employee.binding;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminResponse {

	@Getter
	@Setter
	@NotNull
	private boolean status;
}
