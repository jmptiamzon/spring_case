package com.employment.employee.services;

import java.util.List;

import org.springframework.stereotype.Component;
import com.employment.employee.model.Employee;

@Component
public interface EmployeeService {
	public List<Employee> retrieveAllEmployees();
	public boolean addEmployees(Employee employee);
	public boolean updateEmployees(Employee employee);
	public boolean removeEmployee(int empId);
}
