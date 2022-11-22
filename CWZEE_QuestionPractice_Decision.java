package com.company;

import java.util.Scanner;

public class CWZEE_QuestionPractice_Decision {
    public static void main(String[] args) {
        System.out.println("Conditional Statement Practice\n");
/*
        //P1
        int a=10;
        if(a==11){
            System.out.println("i am Eleven");
        }else{
            System.out.println("i am not Eleven");
        }
*/
        /*
        int age;        //int is a keword and veriable is declared variable name is declare age
        System.out.print("enter your Age =");   //print the statement in java
        Scanner sc=new Scanner(System.in);      //get the user input from user Scanner sc= new Scanner(System.in) is used
        age=sc.nextInt();                       //method is calling,get the integer vlue by user to written with print the statement

                                        //logical condition is applied
        if(age>=50){
            System.out.println("you are Experienced");
        }else if(age>=40){
            System.out.println("you ar Mid_Levle Experienced"); }
        else if(age>=30){
            System.out.println("you ar Semi_ Experienced"); }
        else if(age>=20){
            System.out.println("you ar initial level Experienced"); }
        else{
            System.out.println("you are not Experienced");
        }

         */
      /*
        byte s1,s2,s3;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the three subject marks of you Current Semester =");

        s1 =sc.nextByte();      //input from user of subject1
        s2 =sc.nextByte();      //input from user of subject2
        s3 =sc.nextByte();      //input from user of subject3

        float avg=(s1+s2+s3)/3.0f;  //average marks calculation
        System.out.println("your Overall Percentage is ="+avg);

        if(avg>= 40 && s1>=33 && s2>=33 && s3 >=33){
            System.out.println("congrats ,you have been promoted in next Class");

        }
        else{
            System.out.println("Sorry,Try again");
        }
*/
            Scanner sc= new Scanner(System.in);
            int day=sc.nextInt();

            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
 //       default: System.out.println("Try again");

    }

}
