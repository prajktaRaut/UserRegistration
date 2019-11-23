package com.userregistartion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidator {

    private static Pattern mobileNumberPattern;


    public boolean validateMobileNumber(String mobileNumber) {

        mobileNumberPattern=Pattern.compile("^(91)[: :]?[7-9]{1}[0-9]{9}");

        Matcher matcher=mobileNumberPattern.matcher(mobileNumber);

        if (matcher.matches())
            return true;
        else
            return false;

    }


}
