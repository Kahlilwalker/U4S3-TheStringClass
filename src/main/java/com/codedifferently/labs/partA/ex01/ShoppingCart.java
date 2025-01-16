package com.codedifferently.labs.partA.ex01;

public class ShoppingCart {
    public static String name() {
        String response = "";
        String custName = "Hakim Smith";
        String firstName = custName.substring(0,5) ;
        int spaceIdx = custName.indexOf(" ");;

        // Get the index of the space character (" ") in custName.

        // Use the substring method to parse out the first name and print it.
        System.out.println(firstName);
        return firstName;
    }
    public static void main(String[] args) {
        String nameOut = name();
        System.out.println(nameOut);


    }
}
