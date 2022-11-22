//Question 1:Implement a program which helps the user to do some addition exercises.
package com.company;
import java.util.Scanner;
class AdditionExercise {
    public static void main(String[] args) {

        System.out.println("My Name is Umer Azeem Zaman");
        System.out.println("My Subject Code DPIT111 (122)");
        System.out.println("My Student Number 6570254");
        System.out.println("My email address uaz879@gmail.com");
        System.out.println("My Assignment Number 4");

        int num = 0;
        int sum = 0;

// Create an object of Scanner class to take input.
        Scanner sc = new Scanner(System.in);


        int res;
        do {
            // Read the next input.
            System.out.println("\nEnter integer value 1 =");
            int c = sc.nextInt();

            System.out.println("Enter integer value  2 =");
            int d = sc.nextInt();

            System.out.println("Enter integer value  3 =");
            int e = sc.nextInt();

            res = sum + c + d + e;
        }
        while (num ==res);

        System.out.println("Sum of numbers: " + res);
        System.out.println("correct!");

        System.out.println("would you like to continue  addition exercise(yes/No)");
    }
}