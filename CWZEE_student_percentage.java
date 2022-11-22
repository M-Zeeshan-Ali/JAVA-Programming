package com.company;

import java.util.Scanner;

public class CWZEE_student_percentage {

    public static void main(String[] args){
        System.out.println("Enter the marks of Subject out of 100");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter obtain marks of subject 1 =");
        int a= sc.nextInt();

        System.out.println("Enter obtain marks of subject 2 =");
        int b= sc.nextInt();

        System.out.println("Enter obtain marks of subject 3 =");
        int c= sc.nextInt();

        System.out.println("Enter obtain marks of subject 4 =");
        int d= sc.nextInt();

        System.out.println("Enter obtain marks of subject 5 =");
        int e= sc.nextInt();

        float sum=a+b+c+d+e;
        System.out.println("sum = "+sum);

        float total=100+100+100+100+100;

        float p=((sum/total)*100);
        System.out.println("Total Percentage of all Subject is ="+p +"%");

        System.out.println("What is your name");

        //Scanner sc=new Scanner(System.in); //scanner is already is define on line 10 so no need to wrie again
        String name=sc.next();
        System.out.println("Hello  " +name+ "  Hava a good day");
    }
}
