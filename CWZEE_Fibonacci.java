package com.company;

public class CWZEE_Fibonacci {
    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
      //fibonacci series = 0,1,1,2,3,5,8,13,21,34
        int result = fib(4);
        System.out.println(result);
    }
}
