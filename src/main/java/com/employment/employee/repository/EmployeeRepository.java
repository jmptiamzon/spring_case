package com.employment.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employment.employee.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	List<Employee> findAll();
}
