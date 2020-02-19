package com.employment.employee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employment.employee.binding.AdminRequest;
import com.employment.employee.binding.AdminResponse;
import com.employment.employee.services.AdminService;

@CrossOrigin
@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping(value = "/login")
	public ResponseEntity<?> login(@Valid @RequestBody AdminRequest adminRequest) {
		AdminResponse loginStatus = AdminResponse.builder()
				.status(adminService.validateAdmin(adminRequest.getEmail(), adminRequest.getPassword()))
			.build();
		
		return ResponseEntity.ok(loginStatus);
	}
	
	@GetMapping(value = "/genPass")
	public ResponseEntity<?> genPass() {
		
		
		return ResponseEntity.ok(new BCryptPasswordEncoder().encode("admin"));
	}
	
	

}
