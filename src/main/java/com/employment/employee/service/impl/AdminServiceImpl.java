package com.employment.employee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.employment.employee.model.Admin;
import com.employment.employee.repository.AdminRepository;
import com.employment.employee.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public boolean validateAdmin(String email, String password) {
		Admin returnedRow = adminRepository.findByEmail(email);
		return returnedRow != null ?
				new BCryptPasswordEncoder().matches(password, returnedRow.getPassword()) : false;
	}

}
