package com.brigelabz.uservalidator;

@FunctionalInterface
interface UserValidationFunction {
	
	boolean matches(String name, String namePattern);

	static boolean validate(String attribute, String attributeRegexPattern, String attributeName, UserValidationFunction functionObj) {
		
		try {
			if (attribute.length() == 0) {
				
				throw new UserValidatorException(UserValidatorException.ExceptionType.ENTERED_EMPTY,
						"Please enter a valid " + attributeName);
			}
			return functionObj.matches(attribute, attributeRegexPattern);

		} catch (NullPointerException e) {
			
			throw new UserValidatorException(UserValidatorException.ExceptionType.ENTERED_NULL,
					"Please enter a valid " + attributeName);
		}
	}
}

public class UserValidator {

	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
	private static final String EMAIL_ID_PATTERN = "^[a-z]+([.]?[a-z0-9_+-]+)?@[a-z1-9]+[.][a-z]{2,}([.][a-z]{2,})?$";
	private static final String PHONE_NUMBER_PATTERN = "\\d{1,3} \\d{10}$";
	private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[^0-9a-zA-Z][0-9a-zA-Z]*$";
	private static UserValidationFunction validationFunctionObject = (value, pattern) -> value.matches(pattern);

	public boolean validateName(String name) {
		
		return UserValidationFunction.validate(name, NAME_PATTERN, "name", validationFunctionObject);

	}

	public boolean validateEMail(String email) {
		
		return UserValidationFunction.validate(email, EMAIL_ID_PATTERN,	"email", validationFunctionObject);
	}

	public boolean validateMobileNumber(String mobileNumber) {
		
		return UserValidationFunction.validate(mobileNumber, PHONE_NUMBER_PATTERN, "mobile number", validationFunctionObject);
	}

	public boolean validatePassword(String password) {
		
		return UserValidationFunction.validate(password, PASSWORD_PATTERN, "password", validationFunctionObject);
	}
}
