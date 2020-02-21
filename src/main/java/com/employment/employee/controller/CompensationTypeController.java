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

import com.employment.employee.binding.CompensationTypeRequest;
import com.employment.employee.model.CompensationType;
import com.employment.employee.services.CompensationTypeService;

@CrossOrigin
@RestController
public class CompensationTypeController {
	@Autowired
	private CompensationTypeService compTypeService;
	
	@GetMapping(value = "/getCompensationType")
	public ResponseEntity<?> getCompensationType() {
		return ResponseEntity.ok(compTypeService.retrieveAllEmployees());
	}
	
	@PostMapping(value = "/addCompensationType")
	public ResponseEntity<?> addCompensationType(@Valid @RequestBody CompensationTypeRequest compTypeRequest) {
		CompensationType compType = CompensationType.builder()
				.comptype(compTypeRequest.getCompensationType())
			.build();
		
		compTypeService.addCompType(compType);
		return ResponseEntity.ok(getCompensationType());
	}
	
	@PostMapping(value = "/updateCompensationType")
	public ResponseEntity<?> updateCompensationType(@Valid @RequestBody CompensationTypeRequest compTypeRequest) {
		CompensationType compType = CompensationType.builder()
				.id(compTypeRequest.getId())
				.comptype(compTypeRequest.getCompensationType())
			.build();
		
		compTypeService.updateCompType(compType);
		return ResponseEntity.ok(getCompensationType());
	}
	
	@GetMapping(value = "/removeCompensationType/{compTypeId}")
	public ResponseEntity<?> removeCompensationType(@PathVariable("compTypeId") int compTypeId) {
		compTypeService.removeCompType(compTypeId);
		return null;
	}
}
 