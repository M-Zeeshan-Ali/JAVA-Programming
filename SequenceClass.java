package com.company;

public class SequenceClass {
    public static void main(String[] args) {
        long n, p;
        for(n=1,p=1;n<=10;n++)
            if(n%2== 1){
                p=p+n;
                System.out.println(n);
            }
            System.out.println("sum of odd number ="+p);



    }


}
