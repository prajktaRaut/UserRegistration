package com.userregistration;

import com.userregistartion.PasswordValidator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordValidationTest {

    private String password;
    private boolean expectedValue;
    private static PasswordValidator passwordValidator;

    public PasswordValidationTest(String password, boolean expectedValue) {
        this.password = password;
        this.expectedValue = expectedValue;
    }

    @BeforeClass
    public static void initialization()
    {

        passwordValidator=new PasswordValidator();

    }


    @Parameterized.Parameters
    public static Collection<Object[]> checkPasswords()
    {
        Object[][] checkPasswords=new Object[][]{

                {"abcd",false},
                {"abcAB12abcAB123",false},
                {"asadminasda", false},
                {"Abcdefgh",false},
                {"Abcd@123",true},
                {"@123asdfA",true}

        };

        return Arrays.asList(checkPasswords);

    }

    @Test
    public void checkPasswordValidOrNot() {

        boolean result=passwordValidator.validatePassword(this.password);
        Assert.assertEquals(this.expectedValue,result);

    }
}
