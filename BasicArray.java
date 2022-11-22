package com.company;

public class BasicArray {


    


  //  public class JavaStringArrayExample {

        public static void main(String args[]) {

            String[] schoolbag = { "Books", "Pens", "Pencils", "Notebooks" };

            String findString = "Pens";
            boolean found = false;
            for (String element:schoolbag) {
                if (element.equals(findString)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("The array contains the string: " + findString);
            }
            else {
                System.out.println("The array does not contain the string: " + findString);
            }
        }
   // }
}
