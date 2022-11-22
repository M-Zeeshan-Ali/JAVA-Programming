package com.company;

import java.util.Scanner;

public class CWZEE_ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("Decision/Conditional Statement in Java programming");

        // String name = "Yasir Aziz";
        // if(name=="Yasir Aziz"){
        //   System.out.println("You \n Are\n\t my\n\t Guru/Mentor.\n\t");
        //}else{

        //   System.out.println("you are not my guru/mentor");
        //        }
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the age of 3 person");

        int a =sc.nextInt();
        //System.out.println(a);

        int b =sc.nextInt();
       // System.out.println(b);

        int c =sc.nextInt();
      //  System.out.println(c);
        if(a>=20){
            System.out.println("you are younger "); }
        else{
            System.out.println("you are not younger"); }

        if(b>=30){
            System.out.println("you are mid younger "); }
        else{
            System.out.println("you are not mid younger"); }

        if(c>=40){
            System.out.println("you are older "); }
        else{
            System.out.println("you are not older"); }

    }
}
