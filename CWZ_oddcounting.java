//Question 4
package com.company;
import java.util.Scanner;
public class CWZ_oddcounting {

    public static void main(String[] args) {
        System.out.println("My Name is Umer Azeem Zaman");
        System.out.println("My Subject Code DPIT111 (122)");
        System.out.println("My Student Number 6570254");
        System.out.println("My email address uaz879@gmail.com");
        System.out.println("My Assignment Number 4");

            int number, i;
            Scanner sc = new Scanner(System.in);
            System.out.print("\n please enter a positive odd number: ");
            number = sc.nextInt();
            i = 1;
            System.out.print("your Sequence is: ");
//the while loop executes until the cond\ition become false

        while (i <= number) {
//prints the odd number
                System.out.print(" "+i);
           //     System.out.print(i + " ");
//increments the variable i by 2
              i = i+2  ;
            }
        }

}

/*
import java.util.Scanner;
class FindOddNumber {
    static int odd(int num1, int num2)
    {
        if(num1>num2)
            return 0;
        System.out.printf(num1+" ");
        return odd(num1+2,num2);
    }
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int num1=1,num2;
        System.out.print("please input a positive odd number:");
        num2=cs.nextInt();
        System.out.print("your sequence is :");
        odd(num1,num2);
        cs.close();
    }
}
*/
