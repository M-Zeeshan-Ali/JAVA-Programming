package com.company;
/*
public class DotOperator {
}
*/
class DotOperatorExample1   //class name is DotOperatorExample1
{
    void display()  //method Created
    {
        double d = 67.54;   //double is a variable  and d is a name of variable initialize the value
//casting double type to integer
        int i = (int)d; //typecasting double to int type variable
        System.out.println(i);  //print the integer value of typecasting
    }
    public static void main(String args[])
    {
        // object is created
        DotOperatorExample1 doe = new DotOperatorExample1();
//method calling
        doe.display();
    }
}