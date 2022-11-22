package com.company;
import java.util.Scanner;           //library file of java


    class Exercise2 {

        public static void main(String[] Strings) {
            //scanner is a class in java to get the value from user.
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Amount: ");     //print the statement
            double amount = input.nextDouble();    //double is keyword and amount is variable to print the user value.

            //loop statement is started here ,if condition is true like 1==1 then print the value again and again
            while (1 == 1) {
                    //print the statements from "Enter Type to "1 to 6" statement.
                System.out.print("Enter Type: " + "\n " +

                        "1: for lb to kg \n" +
                        "2: for OZ to g \n" +
                        "3: for ft to meter \n" +
                        "4: for ft to cm \n" +
                        "5: for inch to cm \n " +
                        "6: for temperature conversion (Celicus) \n");
                    // making a new scanner class to make an object ,new keyword is used to make an object in a scanner class
               Scanner sc = new Scanner(System.in);
               int type = sc.nextInt();     //get the user value only int type

                    //switch statement is started (type is a condition),in case 1
                switch (type) {
                    case 1:
                        double lb = amount * 0.45;      //user input  * 0.45 (lb to kg)
                        System.out.println("Result = " + lb + "kg");        //print the result in case 1 ,when user select the integer 1 (lb to kg)
                        break;  //if condition is  ture then break the loop ,otherwise program check other cases(loop will not break)
                    case 2:
                        double oz = amount * 28.34;
                        System.out.println("Result = " + oz+ "g"); //print the result in case 2 ,when user select the integer 2 (oz to g)
                        break;
                    case 3:
                        double ft = amount * 0.30;
                        System.out.println("Result = " + ft+ "meter");  //print the result in case 3 ,when user select the integer 3 (ft to m)
                        break;
                    case 4:
                        double ft1 = amount * 30.48;
                        System.out.println("Result = " + ft1+ "cm"); //print the result in case 4 ,when user select the integer 4 (ft to cm)
                        break;
                    case 5:
                        double in = amount * 2.54;
                        System.out.println("Result = " + in+ "cm"); //print the result in case 5 ,when user select the integer 5 (inch to cm)
                        break;
                    case 6:
                        double c = ((amount - 32) * 5 / 9);
                        System.out.println("Result = " + c+ "Celicus"); //print the result in case 6 ,when user select the integer 6 (celcius  to fah)
                        break;
                                    //if the default keyword is used as the last statement in a switch block, it does not need a break .
                    default:        // if there is no case match in the switch then default statement is print
                        System.out.println("incorrect Result = "+ -1);
                }
            }
}

    }


