package com.employment.employee.binding;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GlobalResponse {
	@Getter
	@Setter
	private boolean status;
	
}
