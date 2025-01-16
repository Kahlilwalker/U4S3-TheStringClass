package com.codedifferently.labs.partB.ex01;

public class Indexing {
    public static String index() {
        String response = "" ;
        String myStr = "Hello planet earth, you are a great planet.";
        /* Your code goes here*/

       int indx1 = myStr.indexOf("e");
int indx2 = myStr.indexOf("e", indx1 + 1);

        response += indx2;

        return response;
    }

    public static void main(String[] args) {
        String indexOutput = index();
        System.out.println(indexOutput);
    }
}


