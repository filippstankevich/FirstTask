package com.epam.task.first.creator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {
    public ArrayValidator() {}

    public boolean validate(String line){
        boolean result = false;
        Pattern pattern = Pattern.compile("[0-9 ]+");
        Pattern patternOnlySpaces = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(line);
        Matcher matcherOnlySpaces = patternOnlySpaces.matcher(line);
        if(!line.equals("")) {
            if(!matcherOnlySpaces.matches()) {
                result = matcher.matches();
            }
        }
        return result;
    }
}
