package com.employment.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employment.employee.model.CompensationType;

public interface CompensationTypeRepository extends CrudRepository<CompensationType, Integer> {
	List<CompensationType> findAll();
}
