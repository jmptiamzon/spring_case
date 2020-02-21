package com.employment.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employment.employee.model.Compensation;

public interface CompensationRepository extends CrudRepository<Compensation, Integer> {
	List<Compensation> findAll();
}
