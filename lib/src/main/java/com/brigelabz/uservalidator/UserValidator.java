package com.brigelabz.uservalidator;

public class UserValidator {

	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
	private static final String EMAIL_ID_PATTERN = "^[a-z]+([.]?[a-z0-9_+-]+)?@[a-z1-9]+[.][a-z]{2,}([.][a-z]{2,})?$";
	private static final String PHONE_NUMBER_PATTERN = "\\d{1,3} \\d{10}$";
	private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[^0-9a-zA-Z][0-9a-zA-Z]*$";

	public boolean validateName(String name) throws UserValidatorException {
		try {
			return name.matches(NAME_PATTERN);

		} catch (NullPointerException e) {
			throw new UserValidatorException(UserValidatorException.ExceptionType.ENTERED_NULL,
					"Please enter a valid name");
		}
	}

	public boolean validateEMail(String email) throws UserValidatorException {
    	try {
        return email.matches(EMAIL_ID_PATTERN);
    	} catch (NullPointerException e) {
			throw new UserValidatorException(UserValidatorException.ExceptionType.ENTERED_NULL,
					"Please enter a valid email");
		}
    }

	public boolean validateMobileNumber(String mobileNumber) throws UserValidatorException {
    	try {
		return mobileNumber.matches(PHONE_NUMBER_PATTERN);
	} catch (NullPointerException e) {
		throw new UserValidatorException(UserValidatorException.ExceptionType.ENTERED_NULL,
				"Please enter a valid mobile number");
	}
	}

	public boolean validatePassword(String password) throws UserValidatorException {
    	try {
		return password.matches(PASSWORD_PATTERN);
	} catch (NullPointerException e) {
		throw new UserValidatorException(UserValidatorException.ExceptionType.ENTERED_NULL,
				"Please enter a password");
	}
	}
}
