//Question 3 : Use method overloading
package com.company;
import java.util.Scanner;

class calculateMultiplication {
        void multiply(int a, double b)
        {
            int m1 = (int) (a * b);
            // System.out.println("Result:" +m1);
            System.out.println("Result: Multiplication " +(a * b));

        }
        void multiply(double a1, int b1,int c1)
        {
            int m2 = (int) (a1 * b1 *c1);
            System.out.println("Result: Multiplication of three numbers: " +m2);
        }
        public static void main(String[] args) {
            System.out.println("My Name is Umer Azeem Zaman");
            System.out.println("My Subject Code DPIT111 (122)");
            System.out.println("My Student Number 6570254");
            System.out.println("My email address uaz879@gmail.com");
            System.out.println("My Assignment Number 4");



            calculateMultiplication m = new calculateMultiplication();

            Scanner cs=new Scanner(System.in);
            System.out.println("\nEnter the first number:");
            System.out.println("Enter the second number:");
            int a= (int) cs.nextDouble();
            int b= (int) cs.nextDouble();

            m.multiply(a,b); // It will call method multiply() to calculate the multiplication of three arguments int and double.


            System.out.println();
            System.out.println("Enter the three integers:");
            int a1= (int) cs.nextDouble();
            int b1= (int) cs.nextDouble();
            int c1= (int) cs.nextDouble();

            // It will call method multiply() to calculate the multiplication of three arguments double and int.
            m.multiply(a1,b1,c1);
        }
    }

