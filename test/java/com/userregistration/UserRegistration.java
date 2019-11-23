package com.userregistration;

import com.userregistartion.FirstNameValidator;
import com.userregistartion.LastNameValidator;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {

    FirstNameValidator firstNameValidator=new FirstNameValidator();

    LastNameValidator lastNameValidator=new LastNameValidator();

    @Test
    public void CheckFirstName_IfValid_ShouldReturnTrue() {

        boolean result=firstNameValidator.checkFirstName("Prajkta");

        Assert.assertTrue(result);


    }

    @Test
    public void CheckFirstName_IfNotValid_ShouldReturnFalse() {

        boolean result=firstNameValidator.checkFirstName("Pr");

        Assert.assertFalse(result);


    }

    @Test
    public void CheckLastName_IfValid_ShouldReturnTrue() {

        boolean result=lastNameValidator.validateName("Raut");

        Assert.assertTrue(result);


    }

    @Test
    public void CheckLastName_IfNotValid_ShouldReturnFalse() {

        boolean result=lastNameValidator.validateName("Ra");

        Assert.assertFalse(result);


    }






}
