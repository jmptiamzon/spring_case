package com.employment.employee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employment.employee.binding.EmployeeRequest;
import com.employment.employee.services.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = "/getEmployees")
	public ResponseEntity<?> getEmployees() {
		
		
		return null;
	}
	
	@PostMapping(value = "/addEmployees")
	public ResponseEntity<?> addEmployees(@Valid @RequestBody EmployeeRequest employeeRequest) {
		
		return null;
	}
	
	@PostMapping(value = "/updateEmployees")
	public ResponseEntity<?> updateEmployees(@Valid @RequestBody EmployeeRequest employeeRequest) {
		
		return null;
	}
	
	
	@GetMapping(value = "/{empId}")
	public ResponseEntity<?> removeEmployee(@PathVariable("empId") int empId) {
		
		return null;
	}
	
	

}
