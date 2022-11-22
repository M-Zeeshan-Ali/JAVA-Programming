package com.company;
//class create
public class ZeeshanMyCalculation {
    int c;  //c variable declared
//addition method created with a and b parameter
    public void addition(int a,int b){
        c=a+b;  //addition result
        System.out.println("Addition of a and b is:"+c);    //print the result ,print the statement
    }
    //subtraction method with parameter pass
    public void subtraction(int a ,int b){
        c=a-b;      //instance variable is c to initialize the subtraction result.
        System.out.println("Subtraction of a and b is:"+c);
    }
    public void divide(int a ,int b){
        c=a/b;
        System.out.println("division of a and b is:"+c);
    }
    public void remainder(int a ,int b){
        c=a%b;
        System.out.println("Remainder of a and b is:"+c);
    }
}
//inheritence in java class created
class calculation extends ZeeshanMyCalculation{
    //product method created with a and b parameter
    public void multiplication(int a ,int b){
        c=a*b;  //inherit the ZeeshanMyCalculation to initilize the c variable
        System.out.println("Multiplication of a and b:" +c);}
    public static void main(String[] args) {
        calculation zee =new calculation(); //object is crated
            int a=10;   //initialize the value
            int b=5;    //initialize the value
        System.out.println("Inheritance in java using Extends Keyword ");
        System.out.println();
        zee.addition(a,b);  //zee is variable name of an object, reference call of addition method.
        zee.subtraction(a,b);
             zee.multiplication(a,b);
             zee.divide(a,b);
             zee.remainder(a,b);
    }
    }




