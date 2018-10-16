package com.dimzfresh;

public class Main {

    public static void main(String[] args) {

        //1. array

        System.out.print("Example № 1 \n");

        int[] numbers = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            System.out.print("number = " + n + "\n");
        }

        System.out.print("Example № 2 \n");

        int[] numbers2 = {1, 3, 5, 8, 12};

        for (int i = 0; i < numbers2.length; i++) {
            int n = numbers2[i];
            System.out.print("number = " + n + "\n");
        }



    }
}
