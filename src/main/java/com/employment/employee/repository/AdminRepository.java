package com.employment.employee.repository;


import org.springframework.data.repository.CrudRepository;

import com.employment.employee.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	Admin findByEmail(String email);
} 
