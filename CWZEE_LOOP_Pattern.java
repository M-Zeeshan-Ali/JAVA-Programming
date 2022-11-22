package com.company;

public class CWZEE_LOOP_Pattern {
    public static void main(String[] args) {
        System.out.println("\nLOOP Practice in JAVA Language");

         int n=6;
         for(int i=n; i>0; i--) {

             for (int j = 0; j < i; j++) {
                 System.out.print("*");
             }

             System.out.print("\n");
         }
         }
}
