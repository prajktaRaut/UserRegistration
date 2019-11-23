package com.userregistartion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static Pattern PasswordPattern;

    public boolean validatePassword(String password) {

        PasswordPattern=Pattern.compile("[a-zA-Z0-9]{8,}");

        Matcher matcher=PasswordPattern.matcher(password);

        if (matcher.matches())
            return true;
        else
            return false;

    }


}
