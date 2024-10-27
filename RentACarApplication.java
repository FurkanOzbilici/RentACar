package com.example.rentACar;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.rentACar.business.abstracts.ModelService;
import com.example.rentACar.business.requests.CreateModelRequest;
import com.example.rentACar.business.responses.GetAllModelsResponse;
import com.example.rentACar.core.utilities.exceptions.BusinnessException;
import com.example.rentACar.core.utilities.exceptions.ProblemDetails;

@SpringBootApplication
@RestControllerAdvice
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}
	
	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public ProblemDetails handleBusinessException(BusinnessException businnessException) {
		ProblemDetails problemDetails = new ProblemDetails();
		problemDetails.setMessage(businnessException.getMessage());
		
		return problemDetails;
	}
	
	@Bean 
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public ModelService getModelService() {
		return new ModelService() {
			
			@Override
			public List<GetAllModelsResponse> getAll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void add(CreateModelRequest createModelRequest) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
