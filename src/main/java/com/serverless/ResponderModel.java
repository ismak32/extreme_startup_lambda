package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "izm";

    public String answer(String question) {
        Matcher nameMatcher = Pattern.compile(".*what is your name").matcher(question);
        if (nameMatcher.matches()){
            return teamName;
        }

        Matcher cuadradoCuboMatcher = Pattern.compile(".*which of the following numbers is both a square and a cube:.*").matcher(question);
        if (cuadradoCuboMatcher.matches()){
            String[] digitosPregunta = question.split(".*:");
            Matcher digitos = Pattern.compile("(\\d+)").matcher(digitosPregunta[1]);

            while (digitos.find()){
                Integer iter = Integer.parseInt(digitos.group());
                boolean resp = isCuadradoYCubo(iter);
                if (resp){
                    return iter.toString();
                }
            }
            return "";
        }

        Matcher mayorMatcher = Pattern.compile(".*which of the following numbers is the largest:.*").matcher(question);
        if (mayorMatcher.matches()){
            String[] digitosPregunta = question.split(".*:");
            Matcher digitos = Pattern.compile("(\\d+)").matcher(digitosPregunta[1]);
            Integer mayor = 0;
            while (digitos.find()){
                int iter = Integer.parseInt(digitos.group());
                if (mayor < Integer.parseInt(digitos.group())){
                    mayor = iter;
                }
            }
            return mayor.toString();
        }

        Matcher sumMatcher = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
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
            return String.valueOf(Integer.parseInt(multMatcher.group(1)) * Integer.parseInt(multMatcher.group(2)));
        }
        
        return teamName;
    }

    private int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public boolean isCuadradoYCubo(Integer numero){
        boolean resp = false;
        Double cuadrado = Math.sqrt(numero);
        Double cubo = Math.cbrt(numero);

        Double moduloCuadrado = cuadrado % cuadrado;
        Double moduloCubo = cubo % cubo;
        if ( moduloCuadrado == 0 && moduloCubo == 0 ){
            resp = true;
        }
        return  resp;
    }

}