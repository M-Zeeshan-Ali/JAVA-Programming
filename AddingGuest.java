package com.company;        //java program package name
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class AddingGuest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //for user input we use Scanner Class ,/*scanner keyword is used to get input from user*/
        ArrayList<String> guestlist = new ArrayList<>(); //an ArrayList of String to hold all the names of the guests.
        guestlist.add("AFFAN");    //one name must be adding in the guest list

        //loop condition used
        do {
            System.out.println("\n=== GUEST LIST ===");
            //for loop i initialize 0,guestlist.size() is a condition ;increment the index of name like 1,2,3 with their name
            int i = 0;
            for (; i < guestlist.size(); i++) {
                //%s means its a string, %d is an integer, %f is floating point number
                System.out.printf(" %d  %s \n" , (i + 1) , guestlist.get(i));
            }

            System.out.println("\n--- MENU ---");

            System.out.print("Enter 1 : For Adding the Guest Name \n"); //select the integer value like 1
            /*sc.nextFloat and sc.nextInt() method is used for float and integer value*/
            int option = sc.nextInt();  //get the user value only int type
            sc.nextLine();

            // swith
            switch (option) {
                case 1:
                    System.out.print("write New Guest name: ");
                    guestlist.add(sc.nextLine()); // ADD the guest name written by user IN GUEST LIST.
                    break; //if condition is  ture then break the loop ,otherwise program check other cases(loop will not break)
            }

        }

        while (true); //if condition is (boolean) true executed otherwise

    }

}
