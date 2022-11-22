package com.company;

public class CWZEE_MethodQuestion {

    // static void multiplication(int n){
/*
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n",n,i,n*i);
        }
        */
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        //  System.out.println("Multiplication method");
        // multiplication(5);

        pattern(4);
    }


}