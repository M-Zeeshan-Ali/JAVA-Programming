package com.company;

public class MethodPractice {
//A method is a function which is used to declared within the class.
    static int logic(int x , int y){
        int z;
        if (x > y) {
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z; //callin the function
    }

    public static void main(String[] args) {
        System.out.println("\t Welcome to the ZeeshanWorld,\n \t its a method Class");
        int a=10,b=1,c;
       // int a=5;
       // int b=10;
      //  int c;
        c = logic(a,b);
        System.out.println("Result is = " + c);


        //  c=a+b;
       /*
        if(a>b ){
           // c=a+b;
            System.out.println(c);
        }
        else{
         //   c=(a+b)*5;
            System.out.println(c*5);
        }
*/

    }
}
