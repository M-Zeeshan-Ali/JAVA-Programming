package com.company;

import java.util.Scanner;

public class PrintResultInWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("My Name is Umer Azeem Zaman");
        System.out.println("My Subject Code DPIT111 (122)");
        System.out.println("My Student Number 6570254");
        System.out.println("My email address uaz879@gmail.com");
        System.out.println("My Assignment Number 3");

        System.out.print("\nPlease Enter 1st Integer: ");
        int a =sc.nextInt();

        System.out.print("Please Enter 2nd Integer: ");
        int b =sc.nextInt();

        int c=a+b;
        switch (c){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
