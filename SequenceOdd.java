package com.company;

import java.util.Scanner;

public class SequenceOdd {



    //class FindSumOfOddNumber {
    static int SOdd(int num1, int num2)
    {
        if(num1>num2)
            return 0;
        return num1+SOdd(num1+2,num2);
    }
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int num1=1,num2;
        System.out.print("please input a positive odd number");
        num2=cs.nextInt();

        System.out.print("Sum of all odd numbers in the given range is:"+SOdd(num1,num2));
        cs.close();
    }
}
