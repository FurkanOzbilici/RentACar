package com.example.rentACar.business.rules;

import org.springframework.stereotype.Service;

import com.example.rentACar.core.utilities.exceptions.BusinnessException;
import com.example.rentACar.dataAccess.abstracts.BrandRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service

public class BrandBusinessRules {
	
	private BrandRepository brandRepository;
	
	public void checkIfBrandNameExists(String name) {
		if(this.brandRepository.existsByName(name))	{
			throw new BusinnessException("Brand name already exists");
		}
	} 
}
