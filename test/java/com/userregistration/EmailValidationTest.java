package com.userregistration;

import com.userregistartion.EmailIdValidator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest {

    private String value;
    private boolean expectedValue;
    private static EmailIdValidator emailIdValidator;

    public EmailValidationTest(String value, boolean expectedValue) {
        this.value = value;
        this.expectedValue = expectedValue;
    }

    @BeforeClass
    public static void initialize()
    {
        emailIdValidator=new EmailIdValidator();

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][] {
                { "abc@yahoo.com" , true },
                {"abc.100@abc.com.au",true},
                {"abc+100@gmail.com",true},
                {"abc.abc@gmail.co.in",true},
                {"abc100@gmail.com",true},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@g.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@a.com.21a",false},
                {"abc@g.cim.au.au",false},};

        return Arrays.asList(data);
    }

    @Test
    public void checkEmailValidOrNot() {

        boolean result=emailIdValidator.validateEmail(this.value);
        Assert.assertEquals(this.expectedValue,result);

    }
}
