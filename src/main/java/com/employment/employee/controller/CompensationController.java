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

import com.employment.employee.binding.CompensationRequest;
import com.employment.employee.model.Compensation;
import com.employment.employee.services.CompensationService;

@CrossOrigin
@RestController
public class CompensationController {
	@Autowired
	private CompensationService compensationService;
	
	@GetMapping(value = "/getCompensation")
	public ResponseEntity<?> getCompensation() {
		return ResponseEntity.ok(compensationService.retrieveAllCompensation());
	}
	
	@PostMapping(value = "/addCompensation")
	public ResponseEntity<?> addCompensation(@Valid @RequestBody CompensationRequest compensationRequest) {
		Compensation compensation = Compensation.builder()
				.emp_id(compensationRequest.getEmp_id())
				.comp_type_id(compensationRequest.getComp_type_id())
				.amount(compensationRequest.getAmount())
				.description(compensationRequest.getDescription())
				.date(new java.sql.Date(compensationRequest.getDate().getTime()))
			.build();
					
		compensationService.addCompensation(compensation);
		return ResponseEntity.ok(getCompensation());
	}
	
	@PostMapping(value = "/updateCompensation")
	public ResponseEntity<?> updateCompensation(@Valid @RequestBody CompensationRequest compensationRequest) {
		Compensation compensation = Compensation.builder()
				.id(compensationRequest.getId())
				.emp_id(compensationRequest.getEmp_id())
				.comp_type_id(compensationRequest.getComp_type_id())
				.amount(compensationRequest.getAmount())
				.description(compensationRequest.getDescription())
				.date(new java.sql.Date(compensationRequest.getDate().getTime()))
			.build();
		
		compensationService.updateCompensation(compensation);
		return ResponseEntity.ok(getCompensation());
	}
	
	@GetMapping(value = "/removeCompensation/{compId}")
	public ResponseEntity<?> removeCompensation(@PathVariable("compId") int compId) {
		compensationService.removeCompensation(compId);
		return ResponseEntity.ok(getCompensation());
	}
	
	@GetMapping(value = "/getEmployeeById/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") int id) {
		return ResponseEntity.ok(compensationService.getEmployeeById(id));
	}
}
