package com.company;

import java.util.Scanner;

public class Sum_AverageNumber {
    public static void main(String[] args) {

        System.out.println("My Name is Umer Azeem Zaman");
        System.out.println("My Subject Code DPIT111 (122)");
        System.out.println("My Student Number 6570254");
        System.out.println("My email address uaz879@gmail.com");
        System.out.println("My Assignment Number 3");

        System.out.println("\nPlease input a positive integer number N: ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        float sum=0;

        while (i<=n){
            sum+=i;
            i++;
        }

        float average=(sum/n);

        System.out.println("The sum from 1 to "+n+" is = "+sum);
        System.out.println("average is :"+average);

    }
}
