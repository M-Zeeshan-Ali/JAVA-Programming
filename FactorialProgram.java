package com.company;    //package name
import java.util.Scanner;   //java library for using scanner class
//Class name FactorialProgram
public class FactorialProgram {
  //body of program is started here
        public static void main(String args[]){

            System.out.print("Enter a integer value: ");  //print the statement
            Scanner sc = new Scanner(System.in);    //scanner object is created for getting user input
            int fac =sc.nextInt();      //getting int value from user

            int i , fact=1;   //int is a keyword ,i is a variable ,factorial variable is initialize = 1
            // for loop condition
            for(i=1; i<=fac; i++){
                fact=fact*i;    //fact variable is initialize = fact * loop i.
            }
            //print the statement like (+ fac for user integer input), +fact loop condition disply
            System.out.print("Factorial of " + fac +" is: ");

            System.out.print(+fact);
        }
}

/*
import java.util.Scanner;
public class JavaExample {

    public static void main(String[] args) {

    	//We will find the factorial of this number
        int number;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}


 */