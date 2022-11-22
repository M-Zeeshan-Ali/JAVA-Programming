package com.company;

import java.util.Scanner;

public class Color{
    enum Rainbow {  RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET

    }
    public static void main(String[] args) {

        System.out.println("My Name is Umer Azeem Zaman");
        System.out.println("My Subject Code DPIT111 (122)");
        System.out.println("My Student Number 6570254");
        System.out.println("My email address uaz879@gmail.com");
        System.out.println("My Assignment Number 3");

        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter an integer in [1,7]");
        int a;
               a =sc.nextInt();

        switch(a) {
            case 1:
                System.out.println("The color is RED");
                break;
            case 2:
                System.out.println("The color is ORANGE");
                break;
            case 3:
                System.out.println("The color is YELLOW");
                break;
            case 4:
                System.out.println("The color is GREEN");
                break;
            case 5:
                System.out.println("The color is BLUE");
                break;
            case 6:
                System.out.println("The color is INDIGO");
                break;
            case 7:
                System.out.println("The color is VIOLET");
                break;

            default:
                System.out.println("Please! Enter an integer in [1,7]");
        }
    }

}
