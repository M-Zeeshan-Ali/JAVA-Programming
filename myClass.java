package com.company;
import java.util.Scanner;

public class myClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array= new String[4];
       // array = 4;
        char element;
        int count=0;
        System.out.println("Enter the first letter");
        element = scan.next().charAt(0);

        System.out.println("Enter the Fruit List");
        for(int i=0; i<4;i++) {
          //cin>>array[i];
            char element1 = scan.next().charAt(0);
        }
        for(int i=0;i<4;i++)
        {
            char firstCharacter=array[i].charAt(0);
            if(firstCharacter==element){
                count++;
            }

        }System.out.print("found" + count + "no of String with first element" + element);
    }

}

/*
package com.company;

import java.util.Scanner;

public class CWZEE_ArrayOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = new String[4];
      //  array = [4];
        char element;
        char fruit;
        int cont=0;
        System.out.println("Enter the first letter");
        element = scan.next().charAt(0);

        System.out.println("Enter the Fruit List");
        for(int i=0; i<4; i++) {
            fruit  = scan.next().charAt(0);
        }
        for(int i=0; i<4; i++)
        {
            char firstCh=arr[i].charAt(0);
            if(firstCh==element) {
                cont++;
            }

        }
        System.out.println("found" +cont+ "no of String with first element"+ element);
    }
}
*/