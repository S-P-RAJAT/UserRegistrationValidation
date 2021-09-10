package com.brigelabz.uservalidator;

public class UserValidatorException extends Exception{
	
	enum ExceptionType {
        ENTERED_NULL,
        ENTERED_EMPTY,
        INVALID_FIRST_NAME_FORMAT,
        INVALID_LAST_NAME_FORMAT,
        INVALID_EMAIL_FORMAT,
        INVALID_MOBILE_NUMBER_FORMAT,
        INVALID_PASSWORD_FORMAT,
    }
    ExceptionType type;
	public UserValidatorException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
	