package ua.service.implementation.validator;

import java.util.regex.Matcher;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.Cvartura;
import ua.form.RecipeForm;
import ua.service.CvarturaService;

public class CvarturaValidator implements Validator {

	private final CvarturaService cvarturaService;

	public CvarturaValidator(CvarturaService cvarturaService) {
		this.cvarturaService = cvarturaService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Cvartura.class.equals(clazz);
	}
	
	

	@Override
	public void validate(Object target, Errors errors) {
		Cvartura form = (Cvartura) target;
		if(form.getId()==0)if(cvarturaService.findByName(form.getName())!=null){
			errors.rejectValue("name", "", "Cvartura already exists");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Can`t be empty");
	}
}
