package com.employment.employee.services;

import org.springframework.stereotype.Component;

@Component
public interface AdminService {
	public boolean validateAdmin(String email, String password);
	
}
