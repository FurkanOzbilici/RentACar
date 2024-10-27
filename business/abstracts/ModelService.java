package com.example.rentACar.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rentACar.business.requests.CreateModelRequest;
import com.example.rentACar.business.responses.GetAllModelsResponse;

@Service

public interface ModelService {
	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);
}
