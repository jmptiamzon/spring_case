package com.employment.employee.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.employment.employee.model.CompensationType;

@Component
public interface CompensationTypeService {
	public List<CompensationType> retrieveAllEmployees();
	public boolean addCompType(CompensationType compType);
	public boolean updateCompType(CompensationType compType);
	public boolean removeCompType(int compTypeId);
}
