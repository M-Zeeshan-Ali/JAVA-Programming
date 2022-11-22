package com.company;

public class CWZEE_Consturctoroverloading {

    String language;

    // constructor with no parameter
    CWZEE_Consturctoroverloading() {
        this.language = "Java";
    }

    // constructor with a single parameter
    CWZEE_Consturctoroverloading(String language) {
        this.language = language;
    }
            //getter method creating
    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        CWZEE_Consturctoroverloading obj1 = new CWZEE_Consturctoroverloading();

        // call constructor with a single parameter
        CWZEE_Consturctoroverloading obj2 = new CWZEE_Consturctoroverloading("Python");

        obj1.getName();
        obj2.getName();
    }


}
