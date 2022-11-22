package com.company;
import java.util.Scanner;

class TextPattern {

        public static void main(String[] args) {
            System.out.println("Enter a String in \n TEXT Form: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
        //   sc.close();

            int length= s.length(); //int method is created within class

            char [] a=s.toCharArray();  // array method is declared within class

            System.out.println("\nPrinting the pattern: "); //print the statement in java
            /*
            Java for loop provides a concise way of writing the loop structure.
             The for statement consumes the initialization,
             condition and increment/decrement in one line thereby providing a shorter,
             easy to debug structure of looping.

             //i for rows and j for columns
             */
            for (int i = length-1; i >= 0; i--) {

                // j for columns ,//inner loop work for space
                for (int j = 0; j <= i; j++) {

                   // prints character or word by user
                    System.out.print(a[j]);
                }
                //throws the cursor in a new line after printing each line
               System.out.println();
            }

        }
    }

    //////////////////////////////////////////////////////////////////////////////////
/*
class CharPattern {

    public static void main(String[] args) {

        String ch = "java";

        int number = 7;
        int count = number - 1;
        for (int k = 1; k <= number; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2*k-1; i++)
                System.out.print(ch);
            System.out.println();
            String s = ch;
        }

    }

}
*/
/*
import java.util.Scanner;

class JavaSampleReadPrint {

    public static void main(String[] args) {

        String name = "";
        // read an input and print 10 times
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Write a Word: ");
            name = in.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            System.out.print(name+"&");
        }
    }

}
*/
