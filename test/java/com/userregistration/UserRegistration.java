package com.userregistration;

import com.userregistartion.FirstNameValidator;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {

    FirstNameValidator firstNameValidator=new FirstNameValidator();


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

}
