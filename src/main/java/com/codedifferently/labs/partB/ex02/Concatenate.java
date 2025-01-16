package com.codedifferently.labs.partB.ex02;

public class Concatenate {
    public static String concatenateStrings() {
            String response = "";
        String myString = "Abe ";

        myString = myString + "Lincoln";
        response += myString;

        /* Your code goes here*/

        return response;
    }

    public static void main(String[] args) {
        String stringOutput = concatenateStrings();
        System.out.println(stringOutput);

    }
}
