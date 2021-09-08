package com.brigelabz.uservalidator;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("Emma");
		Assert.assertTrue(isValid);

	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("Em");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenFirstName_WhenFirstLetterNotCapital_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("emma");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("Wilson");
		Assert.assertTrue(isValid);

	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("Wi");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenFirstLetterNotCapital_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("wilson");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateEMail("abc@gmail.com");
		Assert.assertTrue(isValid);

	}

	@Test
	public void givenEmail_WhenInValid_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateEMail("abcgmail.com");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateMobileNumber("91 9191123498");
		Assert.assertTrue(isValid);

	}

	@Test
	public void givenPhoneNumber_WhenInValid_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateMobileNumber("123456789");
		Assert.assertFalse(isValid);

	}
}
