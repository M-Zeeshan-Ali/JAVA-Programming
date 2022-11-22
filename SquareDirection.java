package com.company;                //java package name
import java.util.Scanner;           //import scanner library when getting the user value
//java class name is squareDirection
public class SquareDirection {
    //main body of code is starting here
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);     //scanner class is used for getting the user value
        char ch;
        do {
            // get the character by user
            System.out.print("Enter the Starting point in case of Character:");
            char st = sc.next().charAt(0);
            // get the character by user
            System.out.print("Enter the End point in case of Character:");
            char ed = sc.next().charAt(0);
            //nested if Condition is apply
            if (st == 'a' && ed == 'b') {
        System.out.println("\nyour direction is :Left to Right.\n your Destination is b ");
    } else if (st == 'a' && ed == 'c') {
        System.out.println("\nyour direction is :Left to Right and Down/or/top to bottom and Right");
        System.out.println("your Destination is c");
    } else if (st == 'a' && ed == 'd') {
        System.out.println("\nyour direction is :Left to Right and Down or top to bottom and Right to Left");
        System.out.println("your Short direction is LEFT Top to Bottom.\n your Destination is D ");
    } else if (st == 'b' && ed == 'c') {

        System.out.println("\nyour Short direction is Right Top to Bottom ");
        System.out.println("your Destination is c");
    } else if (st == 'b' && ed == 'd') {

        System.out.println("\ndirection is Right Top to Bottom and left ");
        System.out.println("your Destination is d");

    } else if (st == 'b' && ed == 'a') {
        System.out.println("\ndirection is Right Top to left ");
        System.out.println("your Destination is a");
    } else if (st == 'c' && ed == 'd') {
        System.out.println("\ndirection is bottom Right Top to left ");
        System.out.println("your Destination is d");
    } else if (st == 'c' && ed == 'b') {
        System.out.println("\ndirection is bottom Right to Top  ");
        System.out.println("your Destination is b");
    } else if (st == 'c' && ed == 'a') {
        System.out.println("\ndirection is bottom Right to Top and Right to Left  ");
        System.out.println(" direction is bottom let to Right and Right to Top  ");
        System.out.println("your Destination is a");
    } else if (st == 'c' && ed == 'a') {
        System.out.println("\ndirection is bottom Right to Top and Right to Left  ");
        System.out.println("your Destination is a");
    } else if (st == 'd' && ed == 'a') {
        System.out.println("\nShort Direction is :Bottom left to Top Left  ");
        System.out.println("Direction is :Bottom left Right ,Bottom Right to To and Top Right to Left");
        System.out.println("your Destination is a");
    } else if (st == 'd' && ed == 'c') {
        System.out.println("\nDirection is :Bottom left to Right");
        System.out.println("your Destination is c");
    } else if (st == 'd' && ed == 'b') {
        System.out.println("\n Direction is :Bottom left to Right and Bottom Right to Top");
        System.out.println("your Destination is b");
    }

   // char ch;
    System.out.println("\n Do you want to continue(yes/no) (y/n) ");
   ch = sc.next().charAt(0);
}   while(ch=='y'||ch=='Y'); //while condition is apply

    }
}

