package com.company;

import java.util.Scanner;       //scanner library2

public class CWZEE_takingInput {
    public static void main(String[] args){

        System.out.println("Welcome to Zeeshan Ali");
        System.out.println("Taking input from user:");

        Scanner sc=new Scanner(System.in); /*scanner keyword is used to get input from user*/
        System.out.println("Enter the number1");

        float a=sc.nextFloat();         /*sc.nextFloat and sc.nextInt() method is used for float and integer value*/
        //int a =sc.nextInt();

        System.out.println("enter the number2");
        float b=sc.nextFloat();
        //int b =sc.nextInt();

        float sum=a+b;
        //int sum=a+b;
        System.out.println("The Sum of num1 and num2 is:"+sum);
    }
}
