package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "carlos";

    public String answer(String question) {
        Matcher nameMatcher = Pattern.compile(".*what is your name").matcher(question);
        if (nameMatcher.matches()){
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        Matcher eiffelMatcher = Pattern.compile(".*which city is the Eiffel tower in").matcher(question);
        if (eiffelMatcher.matches()) {
            return "Paris";
        }

        Matcher fibonnaciMatcher = Pattern.compile(".*what is the (\\d+)th number in the Fibonacci sequence").matcher(question);
        if (fibonnaciMatcher.matches()) {
            Integer numeropedido = Integer.parseInt(fibonnaciMatcher.group(1));
            Integer respInt = fib(numeropedido);
            return respInt.toString();
        }

        Matcher bananaMatcher = Pattern.compile(".*what colour is a banana").matcher(question);
        if (bananaMatcher.matches()) {
            return "yellow";
        }

        Matcher multMatcher = Pattern.compile(".*what is (\\d+) multiplied by (\\d+)").matcher(question);
        if (multMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) * Integer.parseInt(sumMatcher.group(2)));
        }
        
        return teamName;
    }

    private int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

}