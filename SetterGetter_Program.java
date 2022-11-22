package com.company;
/*
public class SetterGetter_Program {
   public static class Vehicle {
       private String color;
    //getter method is created to getcolor by user
       String getColor() {
           return color;    //return the color
       }
//setter method is created to set the color
     void setColor(String color) {
           this.color = color;  //this. is a reference variable,color variable is initialize
       }
/*
        // Getter
        public String getColor() {
            return color;
        }

        // Setter
        public void setColor(String c) {
            this.color = c;
        }
    }

        //main body of the class
       public static void main(String[] args) {
           Vehicle v1 = new Vehicle();  //object is created of vehicle object ,variable =new object()function
           v1.setColor("Red");          //.operator is used for set color is RED.
           System.out.println(v1.getColor());   //print the reference variable v1.getcolor()
       }
   }
}
*/

import java.util.*;

class CollectionGetterSetterObject {
    private List<Person> listPeople;

    public void setListPeople(List<Person> list) {
        this.listPeople = new ArrayList<Person>(list);
    }

    public List<Person> getListPeople() {
        return new ArrayList<Person>(this.listPeople);
    }

    public static void main(String[] args) {
        CollectionGetterSetterObject app = new CollectionGetterSetterObject();

        List<Person> list1 = new ArrayList<Person>();
        list1.add(new Person("Peter"));
        list1.add(new Person("Alice"));
        list1.add(new Person("Mary"));

        app.setListPeople(list1);

        System.out.println("List 1: " + list1);

        list1.get(2).setName("Maryland");

        List<Person> list2 = app.getListPeople();
        System.out.println("List 2: " + list2);

        list1.get(0).setName("Peter Crouch");

        List<Person> list3 = app.getListPeople();
        System.out.println("List 3: " + list3);

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
