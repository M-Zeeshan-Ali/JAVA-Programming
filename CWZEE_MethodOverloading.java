package com.company;

public class CWZEE_MethodOverloading {
//MethodOverloading is a function in which the Method_name are same but parameters are different.
        static void foo(){
            System.out.println("\n Good Morning Zeeshan Ali!");
        }

        static void foo(int a){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Welcome to the Method Overloading Class");
        }

        static void foo(int a, int b){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
        }

        static void foo(int a, int b, int c){
            System.out.println("\nGood morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
            System.out.println("Good Evening " + c + " bro!");

        }

        static void change(int a){
            a = 98;
        }

        static void change2(int [] arr){
            arr[0] = 98;
        }
        static void tellJoke(){
            System.out.println("I invented a new word!\n" +
                    "Plagiarism!");
        }

        public static void main(String[] args) {
            System.out.println("Method_Overloading in Java");
            // tellJoke();

            // Case 1: Changing the Integer
            //int x = 45;
            //change(x);
            //System.out.println("The value of x after running change is: " + x);

            // Case 1: Changing the Array
            // int [] marks = {52, 73, 77, 89, 98, 94};
            // change2(marks);
            // System.out.println("The value of x after running change is: " + marks[0]);


            // Method Overloading
            foo();      //method 1 is overloading

            foo(100000);  //method 2 is overloading
            //Arguments declared

            foo(3000, 4000 , 5000);    //method 3 is overloading

            // Arguments are actual!


        }
    }

