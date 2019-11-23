package com.userregistartion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidator {

    private static Pattern EmailPattern;

    public boolean validateEmail(String email) {

        EmailPattern=Pattern.compile("^([a-zA-Z0-9]+)([+_,-,.][a-zA-Z0-9]+)?[@][a-zA-Z]+([.][a-z]{2,3})([.][a-z]{2})?$");

        Matcher matcher=EmailPattern.matcher(email);

        if (matcher.matches())
            return true;
        else
            return false;

    }



}
