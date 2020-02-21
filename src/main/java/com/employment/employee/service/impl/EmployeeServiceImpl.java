package com.employment.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employment.employee.model.Employee;
import com.employment.employee.repository.EmployeeRepository;
import com.employment.employee.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> retrieveAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public boolean addEmployees(Employee employee) {
		// boolean status = false;
		employeeRepository.save(employee);
		return false;
	}

	@Override
	public boolean updateEmployees(Employee employee) {
		employeeRepository.save(employee);
		return false;
	}

	@Override
	public boolean removeEmployee(int empId) {
		employeeRepository.deleteById(empId);
		return true;
	}

}
