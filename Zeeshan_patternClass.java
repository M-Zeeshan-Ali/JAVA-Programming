package com.company;

public class Zeeshan_patternClass {
    public static void main(String args[]){
        int n=4;    //4 Rows
        int m=5;    //5 column
        //4*5 pattern of star Solid Rectangle
/*
        //outer loop
        for(int i=1;i<=n;i++){
            //Inner Loop
            for(int j=1;j<=m;j++){
                //print the star statement
                System.out.print("*");
            }
            System.out.println();
        }
*/      //Hollow Pattern
        for(int i=1;i<=n;i++){
            //Inner Loop
            for(int j=1;j<=m;j++){
                //print the star statement
                if(i==1 ||  j==1    ||  i==n    ||  j==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                }
            System.out.println();
            }
        }
    }

