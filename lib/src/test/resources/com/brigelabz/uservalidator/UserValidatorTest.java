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
	public void givenFirstName_Empty_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = false;
		try {
			isValid = userValidator.validateName("");
	} catch (UserValidatorException e) {

			Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_EMPTY, e.type);
	}
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenFirstName_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			
			isValid = userValidator.validateName(null);
			
		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_NULL, e.type);		}
	}
	@Test
	public void givenFirstName_WhenContainsSpecialCharacters_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("Hareesh@");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenFirstName_WhenContainsNumbers_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("Hareesh123");
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
	public void givenLastName_WhenContainsSpecialCharacters_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("Wilson@");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenLastName_WhenContainsNumbers_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateName("Wilson123");
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
	public void givenEmail_WhenEmpty_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = false;
		try {
			isValid = userValidator.validateEMail("");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_EMPTY, e.type);
		}
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenEmail_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			
			isValid = userValidator.validateEMail(null);
			
		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_NULL, e.type);		}
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
	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldReturnFalse() {

		UserValidator userValidator = new UserValidator();
		boolean isValid = false;
		try {
			isValid = userValidator.validateMobileNumber("");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_EMPTY, e.type);
		}
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenPhoneNumber_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			
			isValid = userValidator.validateMobileNumber(null);
			
		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_NULL, e.type);		}
	}
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("Abc12@we3");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenLessThanEightCharacters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("A3bc1@");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenPassword_WhenNoUpperCaseLetters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("azaz3bc1@");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenPassword_WhenNoNumbers_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("Abcdef@ghij");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenPassword_WhenNoSpecialCharacters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("Abc123456av");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("Abc12345@@@");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid = false;
		try {
			isValid = userValidator.validatePassword("");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_EMPTY, e.type);
		}
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenPassword_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			
			isValid = userValidator.validatePassword(null);
			
		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_NULL, e.type);		}
	}
}
