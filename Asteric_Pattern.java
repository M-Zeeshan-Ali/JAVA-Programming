package com.company;

import java.util.Scanner;

public class Asteric_Pattern {
    public static void main(String[] args) {

        System.out.println("My Name is Umer Azeem Zaman");
        System.out.println("My Subject Code DPIT111 (122)");
        System.out.println("My Student Number 6570254");
        System.out.println("My email address uaz879@gmail.com");
        System.out.println("My Assignment Number 3");

        int choice;
        System.out.print("\nEnter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

            int Tdash = 0;
            int count = choice * 2;

            for(int i = 0; i<choice; i++)
            {
                Tdash = i+i;
                int dashST = 0;

                //counting no of dash - to print at start or last
                if(i != 0)
                {
                    dashST = Tdash/2;
                }

                for(int k = 0; k < dashST; k++)
                {
                    System.out.print("-");

                }

                for(int k = 0; k<count-Tdash; k++)
                {
                    System.out.print("+");

                }

                for(int k = 0; k < dashST; k++)
                {
                    System.out.print("-");

                }

                System.out.print("\n");

            }

            for(int i = choice-1; i >= 0; i--)
            {
                Tdash = i+i;
                int dashST = 0;

                //counting no of dash - to print at start or last
                if(i != 0)
                {
                    dashST = Tdash/2;
                }

                for(int k = 0; k < dashST; k++)
                {
                    System.out.print("-");

                }

                for(int k = 0; k<count-Tdash; k++)
                {
                    System.out.print("+");

                }

                for(int k = 0; k < dashST; k++)
                {
                    System.out.print("-");

                }

                System.out.print("\n");

            }
        }
}

