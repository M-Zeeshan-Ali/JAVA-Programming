package com.company;

class Employee6 {
    // First constructor
    Employee6(String s,String z, int id,int salary){
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The Last name of the first employee is : " + z);
        System.out.println("The id of the first employee is : " + id);
        System.out.println("The Salary of the first employee is : " + salary);
    }
    //    Constructor overloaded
    Employee6(String s, int i, int salary){
        System.out.println("\nThe name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }

}
class CWH_constructors {
    public static void main(String[] args) {
        Employee6 zee = new Employee6("Zeeshan","Ali",01,50000);

        Employee6 zee1 = new Employee6("M.ZEESHAN",2,70000);



    }
}
