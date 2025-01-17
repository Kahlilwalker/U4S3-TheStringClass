package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction(){
        String response = "";
        String response2 = "";
        String greeting = "Learning Java is a good time!";

        /* Your code goes here*/
        String subString = greeting.substring(0,5);
        String subString2 = greeting.substring(8,11);
        String subString3 = greeting.substring(8,29);

response += subString2  +
        subString3;
        System.out.println(subString);
        System.out.println(subString2);
        return response;



    }
    public static void main(String[] args) {
        String extractionOutput = extraction();
        System.out.println(extractionOutput);
    }
}
