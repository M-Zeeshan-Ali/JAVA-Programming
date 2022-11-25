package com.company;
import java.util.Scanner;
/*
public class AdditonofDigits {
    public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            System.out.print("input integer: ");
            int num = n.nextInt();
            int sum=0;
            do {
                sum=sum+(num%10); //sum+=(num%10);
                num=num/10; //num /=10;
            }
            while ((num)>0);

            System.out.println(sum);
        }

}
*/

//Reverse order program.
/*
class HelloWorld {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);  //scanner object is make ,to get user input
        System.out.print("Input a string: ");   //print the statement
        String Sen = scan.nextLine();   //get the user input
        StringBuffer sbf = new StringBuffer(Sen);   // object is created of StringBuffer
        sbf.reverse();  //object call & .reverse() function is used.
        System.out.println("Reverse string = " + sbf);  //print the sbf object.
    }
    }
     */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the statement");
        String rev = in.nextLine();

        System.out.println(new StringBuilder(rev).reverse().toString());    //Reverse the order
    }
}