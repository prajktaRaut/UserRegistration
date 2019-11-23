package com.userregistration;

import com.userregistartion.FirstNameValidator;
import com.userregistartion.LastNameValidator;
import com.userregistartion.MobileNumberValidator;
import com.userregistartion.PasswordValidator;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {

    FirstNameValidator firstNameValidator=new FirstNameValidator();

    LastNameValidator lastNameValidator=new LastNameValidator();

    MobileNumberValidator mobileNumberValidator= new MobileNumberValidator();

    PasswordValidator passwordValidator=new PasswordValidator();

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

    @Test
    public void checkMobileNumber_IfValid_ShouldReturnTrue() {

        boolean result=mobileNumberValidator.validateMobileNumber("91 9850178109");
        Assert.assertTrue(result);
    }

    @Test
    public void checkMobileNumber_IfNotValid_ShouldReturnFalse() {

        boolean result=mobileNumberValidator.validateMobileNumber("9850178109");
        Assert.assertFalse(result);
    }

    /*@Test
    public void checkPassword_IfValid_ShouldReturnTrue() {

        boolean result=passwordValidator.validatePassword("Admin123");
        Assert.assertTrue(result);
    }

   @Test
    public void checkpassword_IfNotValid_ShouldReturnFalse() {

        boolean result=passwordValidator.validatePassword("raut");
        Assert.assertFalse(result);
    }*/

}
