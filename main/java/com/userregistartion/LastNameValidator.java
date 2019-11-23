package com.userregistartion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameValidator {

    private static Pattern lastNamePattern;


    public boolean validateName(String lastName)
    {
        lastNamePattern=Pattern.compile("^[A-Z][a-z]{3,}");
        Matcher matcher=lastNamePattern.matcher(lastName);

        if (matcher.matches())
            return true;
        else
            return false;

    }



}
