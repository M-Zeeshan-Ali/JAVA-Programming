package com.company;
import java.util.Objects;
import java.util.Scanner;

   class array {
        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            // Asking the user for array size
            char temp ;
            int count=0;
            System.out.println("enter the first letter");
             temp = scan.next().charAt(0);

            System.out.println("Enter the array size : ");
            int size = scan.nextInt();
            // Creating the array
          //  String arr[] = new String[size];
            String arr[] = new String[size];
            System.out.println("Enter the Fruits Name: ");
            char temp1 = scan.next().charAt(0);
            // Takes the string as input from the user
            for(int i = 0;i < size;i++)
                if (arr[i].charAt(0) == temp) {
                    System.out.println("Found!");
                    count += 1;
                }
            if(count==0)
            {
                System.out.println("NOT Found!");
            }


            System.out.println("The array elements are : ");
            // For-each loop to print the string elements
            for(int i = 0;i<size;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }



