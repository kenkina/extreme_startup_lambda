package com.serverless;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "Equipo-2";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        Matcher nameMatcher = Pattern.compile(".*what is your name").matcher(question);
        if (nameMatcher.matches()) {
            return teamName;
        }

        Matcher numberMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+), (\\d+), (\\d+)").matcher(question);
        if (numberMatcher.matches()) {

            int arr[] = {
                    Integer.parseInt(numberMatcher.group(1)),
                    Integer.parseInt(numberMatcher.group(2)),
                    Integer.parseInt(numberMatcher.group(3)),
                    Integer.parseInt(numberMatcher.group(4))
            };

            int max = Arrays.stream(arr).max().getAsInt();

            return String.valueOf(max);
        }

        Matcher sumMatcher2 = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
        if (sumMatcher2.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher2.group(1)) + Integer.parseInt(sumMatcher2.group(2)));
        }
        
        return teamName;
    }

}