package com.sourabh.custom.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyParamValidator implements ConstraintValidator<IsValidHobbyWithParam, String>{

	private String listOfValidHobbies;
	
	@Override
	public void initialize(IsValidHobbyWithParam isValidHobbyWithParam) {
		this.listOfValidHobbies = isValidHobbyWithParam.listOfValidHobbies();
		
	}

	

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		
		if(studentHobby == null){
			return false;
		}
		if(studentHobby.matches(listOfValidHobbies)){
			return true;
		}
		else{
			return false;
		}
	}

	
}
