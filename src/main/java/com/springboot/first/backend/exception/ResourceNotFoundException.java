package com.springboot.first.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceNmae;
	private String feildName;
	private Object feildValue;
	public ResourceNotFoundException(String resourceNmae, String feildName, Object feildValue) {
		super(String.format("%s not found with %s : %s", resourceNmae,feildName,feildValue));
		this.resourceNmae = resourceNmae;
		this.feildName = feildName;
		this.feildValue = feildValue;
	}
	public String getResourceNmae() {
		return resourceNmae;
	}
	public String getFeildName() {
		return feildName;
	}
	public Object getFeildValue() {
		return feildValue;
	}
	
	
	
}
