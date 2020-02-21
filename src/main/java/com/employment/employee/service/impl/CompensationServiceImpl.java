package com.employment.employee.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employment.employee.binding.CompensationResponse;
import com.employment.employee.model.Compensation;
import com.employment.employee.model.CompensationType;
import com.employment.employee.model.Employee;
import com.employment.employee.repository.CompensationRepository;
import com.employment.employee.repository.CompensationTypeRepository;
import com.employment.employee.repository.EmployeeRepository;
import com.employment.employee.services.CompensationService;

@Service
public class CompensationServiceImpl implements CompensationService {
	@Autowired
	private CompensationRepository compensationRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CompensationTypeRepository compensationTypeRepository;
	
	@Override
	public List<CompensationResponse> retrieveAllCompensation() {
		List<CompensationResponse> finalList = new ArrayList<>();
		List<Compensation> compensationContainer = compensationRepository.findAll();
		
		for (Compensation compensation : compensationContainer) {
			// expect ko munang may value
			Employee employee = getEmployeeById(compensation.getEmp_id());
			CompensationType compensationType = getCompensationTypeById(compensation.getComp_type_id());
			
			CompensationResponse compResponse =
					CompensationResponse.builder()
						.compId(compensation.getId())
						.empId(compensation.getEmp_id())
						.compTypeId(compensation.getComp_type_id())
						.empName(employee.getFirstname() + " " + employee.getMiddlename() + " " + employee.getLastname())
						.compType(compensationType.getComptype())
						.amount(compensation.getAmount())
						.description(compensation.getDescription())
						.date(compensation.getDate())
					.build();
			
			finalList.add(compResponse);
		}
		
		return finalList;
	}

	@Override
	public boolean addCompensation(Compensation compensation) {
		compensationRepository.save(compensation);
		return false;
	}

	@Override
	public boolean updateCompensation(Compensation compensation) {
		compensationRepository.save(compensation);
		return false;
	}

	@Override
	public boolean removeCompensation(int compId) {
		compensationRepository.deleteById(compId);
		return false;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Optional<Employee> empData = employeeRepository.findById(empId);
		return Optional.ofNullable(empData).get()
				.orElseThrow(() -> new NoSuchElementException("Employee does not exist.")); // need to handle in controller
	}

	@Override
	public CompensationType getCompensationTypeById(int compId) {
		Optional<CompensationType> compTypeData = compensationTypeRepository.findById(compId);
		return Optional.ofNullable(compTypeData).get()
				.orElseThrow(() -> new NoSuchElementException("Compensation type does not exist.")); // need to handle in controller
	}

}
