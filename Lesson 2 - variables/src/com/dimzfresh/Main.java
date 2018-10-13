package com.dimzfresh;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {

    public static void main(String[] args) {

        int number = 10;
        number = 5;

        double d = 5.0;

        float f = 4.5f;

        char c = 'c';

        String str1 = new String("Welcome to Java world!");
        String str2 = "Java developer, Dimzfresh!";

        String result = str1 + " \n" + str2;

        String message = "I have " + number + " apples =) \n";

        System.out.print(message);

        boolean toBe = false;

        boolean b = toBe || !toBe;

        if (b) {
            System.out.print(b);
        }


    }
}
