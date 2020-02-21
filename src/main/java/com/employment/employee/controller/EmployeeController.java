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
import com.employment.employee.model.Employee;
import com.employment.employee.services.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = "/getEmployees")
	public ResponseEntity<?> getEmployees() {
		return ResponseEntity.ok(employeeService.retrieveAllEmployees());
	}
	
	@PostMapping(value = "/addEmployees")
	public ResponseEntity<?> addEmployees(@Valid @RequestBody EmployeeRequest employeeRequest) {
		Employee newEmployee = Employee.builder()
				.firstname(employeeRequest.getFirstname())
				.middlename(employeeRequest.getMiddlename())
				.lastname(employeeRequest.getLastname())
				.birthdate(new java.sql.Date(employeeRequest.getBirthdate().getTime()))
				.position(employeeRequest.getPosition())
			.build();
		
		employeeService.addEmployees(newEmployee);
		
		return ResponseEntity.ok(getEmployees());
	}
	
	@PostMapping(value = "/updateEmployees")
	public ResponseEntity<?> updateEmployees(@Valid @RequestBody EmployeeRequest employeeRequest) {
		Employee updateEmployee = Employee.builder()
				.id(employeeRequest.getId())
				.firstname(employeeRequest.getFirstname())
				.middlename(employeeRequest.getMiddlename())
				.lastname(employeeRequest.getLastname())
				.birthdate(new java.sql.Date(employeeRequest.getBirthdate().getTime()))
				.position(employeeRequest.getPosition())
			.build();
				
		employeeService.updateEmployees(updateEmployee);
		return ResponseEntity.ok(getEmployees());
	}
	
	@GetMapping(value = "/removeEmployees/{empId}")
	public ResponseEntity<?> removeEmployee(@PathVariable("empId") int empId) {
		employeeService.removeEmployee(empId);
		return ResponseEntity.ok(getEmployees());
	}
}
