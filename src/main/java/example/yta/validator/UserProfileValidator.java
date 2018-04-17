package example.yta.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import example.yta.model.UserProfile;


@Component
public class UserProfileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserProfile.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserProfile userprofile = (UserProfile) target;

/*		ValidationUtils.rejectIfEmpty(errors, "name", "error.userprofile.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "nric", "error.userprofile.nric.empty");*/
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nric", "error.nric.empty");
		
		System.out.println("@@@"+userprofile.toString());
	}

}