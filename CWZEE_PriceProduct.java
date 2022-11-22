package com.company;
import java.util.Scanner;

//public class CWZEE_PriceProduct {


    class Main {

        /**
         * Utility function to print a line
         *
         * @param line : line to print
         */
        static void print(String line) {
            System.out.println(line);
        }

        public static void main(String[] args) {
            int price;
            int discount;

            Scanner sc = new Scanner(System.in);

            print("Enter price of the product :");
            price = sc.nextInt();

            print("Enter Discount of the product :");
            discount = sc.nextInt();

            int finalPrice = (price * discount) / 100;

            print("Final price is " + finalPrice);
        }
    }
//}
