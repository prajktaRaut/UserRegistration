package com.userregistartion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameValidator {

    private static Pattern firstNamePattern;


    public boolean checkFirstName(String firstName) {

        firstNamePattern=Pattern.compile("^[A-Z][a-z]{3,}");

        Matcher matcher=firstNamePattern.matcher(firstName);

        if (matcher.matches())
            return true;
        else
            return false;

    }
}
