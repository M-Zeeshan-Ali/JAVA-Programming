import java.util.Scanner;



//class is define AsciiCodeProgram
public class AsciiCodeProgram {
    //body of code
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);  //Scanner class (object is creaqted) is used to get the user value

        System.out.println("**********Enter the Character***************"); //print the statement
        char ch=sc.nextLine().charAt(0);    //to get the user charachter value sc.nextLine() is method is used . operator is used for calling the reference "charAt(parameter 0)"
        // char ch=sc.nextInt().charAt(0);
        int i=ch;//int type variable is initialize ch variable
        System.out.println("Character ASCII value is "+i);  //print the user charcter value.
        
            }   //body of code is closed.

    }   // class paranthesis close
