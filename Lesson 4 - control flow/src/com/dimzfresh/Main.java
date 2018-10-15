package com.dimzfresh;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value = 100;

        //1. if

        if (value > 10) {
            System.out.print("> 10!\n");
        } else {
            System.out.print("< 10!\n");
        }

        //2. switch

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age!");
        int age = scanner.nextInt();

        switch (age) {
            case 0:
                System.out.print("small kid");
                break;
            case 7:
                System.out.print("pupil");
                break;
            case 16:
                System.out.print("teenager");
                break;
            default:
                System.out.print("you are too old! =)");
        }



    }
}
