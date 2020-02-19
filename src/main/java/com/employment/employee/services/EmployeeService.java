package com.employment.employee.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.employment.employee.binding.EmployeeRequest;
import com.employment.employee.model.Employee;

@Component
public interface EmployeeService {
	public List<Employee> retrieveAllEmployees();
	public boolean addEmployees(EmployeeRequest employeeRequest);
	public boolean updateEmployees(EmployeeRequest employeeRequest);
	public boolean removeEmployee(int empId);
}
