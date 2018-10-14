package com.dimzfresh;

public class Main {

    public static void main(String[] args) {

        //1. while
        int value = 10;

        while(value>0) {

            System.out.print("Current value = " + value + "\n");

            value -= 1;
        }

        System.out.print("Loop 'while' is finished!\n\n");

        //2. for

        for (int i = 0; i <= 10; i = i + 5) {
            System.out.print("i = " + i + "\n");
        }

        System.out.print("Loop 'for' is finished!");


    }
}
