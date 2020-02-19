package com.employment.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employment.employee.binding.EmployeeRequest;
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
	public boolean addEmployees(EmployeeRequest employeeRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployees(EmployeeRequest employeeRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
