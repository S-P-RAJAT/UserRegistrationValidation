package com.brigelabz.uservalidator;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {

        UserValidator userValidator = new UserValidator();
        boolean isValid=userValidator.validateName("Emma");
        Assert.assertTrue(isValid);

    }

}
