package com.employment.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employment.employee.model.CompensationType;
import com.employment.employee.repository.CompensationTypeRepository;
import com.employment.employee.services.CompensationTypeService;

@Service
public class CompensationTypeImpl implements CompensationTypeService {

	@Autowired
	private CompensationTypeRepository compTypeRepository;
	
	@Override
	public List<CompensationType> retrieveAllEmployees() {
		return compTypeRepository.findAll();
	}

	@Override
	public boolean addCompType(CompensationType compType) {
		compTypeRepository.save(compType);
		return false;
	}

	@Override
	public boolean updateCompType(CompensationType compType) {
		compTypeRepository.save(compType);
		return false;
	}

	@Override
	public boolean removeCompType(int compTypeId) {
		compTypeRepository.deleteById(compTypeId);
		return false;
	}

}
