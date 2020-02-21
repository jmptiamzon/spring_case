package com.employment.employee.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.employment.employee.binding.CompensationResponse;
import com.employment.employee.model.Compensation;
import com.employment.employee.model.CompensationType;
import com.employment.employee.model.Employee;

@Component
public interface CompensationService {
	public List<CompensationResponse> retrieveAllCompensation();
	public boolean addCompensation(Compensation employee);
	public boolean updateCompensation(Compensation employee);
	public boolean removeCompensation(int compId);
	public Employee getEmployeeById(int empId);
	public CompensationType getCompensationTypeById(int compId);
}