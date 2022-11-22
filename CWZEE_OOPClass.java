package com.company;

import java.util.Scanner;
//i have create a class name is Employee
class Employee1{
    int id,salary;
    String name,department,bank,gender;
// employee details ,make a method within class
     public void eDetails1(){
         //get the user of Employee ID,if condition is true like id==20926 then print the if statements otherwise print else
      //   int id ;
           Scanner sc=new Scanner(System.in); /*scanner keyword is used to get input from user*/
           System.out.println("Enter the Employee ID :");
           id=sc.nextInt();

        if(id==20926) {
            System.out.println("\nyour Employee1 Id is :"+id);
            System.out.println("Your name is :" + name);
            System.out.println("you are :" + gender);
            System.out.println("Your bank name is :" + bank);
            System.out.println("Your department is :" + department);
            System.out.println("your Current Salary is:" + salary);
        }
        else{
            System.out.println("Enter again correct ID:");
             }

        }
        //method calling for salary return int value
    public int getSalary1() {
        return 0;
    }
}
        //another main class is make
public class CWZEE_OOPClass {
    public static void main(String[] args) {
        System.out.println("Understanding the OOP Basic Class ");
//make an object of class,new object creating name shamim.

        Employee1 shamim =new Employee1();
            //setting attributes
        shamim.id= 20925;
        shamim.name = "MS Shamim";
        shamim.gender= "Female";
        shamim.bank="Faysal Bank Of Pakistan";
        shamim.department="Bank | Operations ";
        shamim.salary= 30_000;

        //calling the attributes and print the attributes with the help of object.
        shamim.eDetails1();


    }
}
