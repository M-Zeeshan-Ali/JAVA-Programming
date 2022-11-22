/*
Constructors in Java :
Constructors are similar to methods,, but they are used to initialize an object.
Constructors do not have any return type(not even void).
Every time we create an object by using the new() keyword, a constructor is called.
If we do not create a constructor by ourself,
then the default constructor(created by Java compiler) is called.

 Rules for creating a Constructor :
The class name and constructor name should be the same.
It must have no explicit return type.
It can not be abstract, static, final, and synchronized.

Paramerterized constructor : A constructor with some specified number of parameters is known as a parameterized constructor.
Syntax :
<class-name>(<data-type> param1, <data-type> param2,......){
//code to be executed on the invocation of the constructor
}

class CWH {
    CWH(String s, int b){

        System.out.println("This is the " +b+ "th video of "+ " "+ s);
    }

}
public class CWH_constructors {
    public static void main(String[] args) {
        CWH obj1 = new CWH("CodeWithHarry Java Playlist",42);

    }
}
    */

//  Defaut constructor : A constructor with 0 parameters is known as default constructor.
//         Syntax :
//   <class_name>(){
//code to be executed on the execution of the constructor
// }

package com.company;

//In the above code, CWZEE() is the constructor of class CWH
// The CWZEE() constructor is invoked automatically with the creation of object ob1.

/*
class CWZEE {

    CWZEE(){
        System.out.println("This is the default constructor of CW_ZEESHAN_ALI class.");
    }

}

class CWH {
//parameterized Constructor.
    CWH(String s, int b){

        System.out.println("This is the " +b+ "th video of "+ " "+ s);
        //CWH obj2 = new CWH("CodeWithHarry Java Playlist",42);
    }

}

public class CWZEE_Constructor {
    public static void main(String[] args) {
//In the above code, CWZEE() is the constructor of class CWH
// The CWZEE() constructor is invoked automatically with the creation of object ob1.
        CWZEE obj1 = new CWZEE();

        CWH obj2 = new CWH("M.Zeeshan Ali",579);
    }
  */




/*


*/

    /*
package com.company;


class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }


}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class cwh_44_ps09 {

    public static void main(String[] args) {
        /*
        // Problem 1
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */

/*
    // Problem 3
    Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
                System.out.println(r.getBreadth());







                }
                }

    */
