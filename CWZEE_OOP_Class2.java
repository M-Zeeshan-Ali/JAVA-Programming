package com.company;
class Employee{

    int salary;
    String name;

    //creating methods
    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setName(String n) {
        name=n;
    }
}
///////////////////////////////////////////////
class cellphone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void calling(){
        System.out.println("calling");
    }

}
////////////////////////////////////////
//method of square class
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
///////////////////////////////////
class Tommy1{
    String name="Zeeshan";
    public void hit(){
         System.out.println(name+"\tHitting the Enemy.");
    }
    public void run(){

        System.out.println(name+"\tRunning for Enemy in Game");
    }
    public void fire(){

        System.out.println(name+"\tFiring the Enemy in Game ");
       // return null;
    }
}

public class CWZEE_OOP_Class2 {
    public static void main(String[] args) {
        System.out.println("2nd Class of OOP");
/////////////////////////////////////////////////////////////
        //creating the object of the Employee Class
        Employee zee= new Employee();
        zee.name=("Zeeshan Ali");
        zee.salary=599999;

        //attributes the Class .
        System.out.println(zee.getSalary());
        System.out.println(zee.getName());
/////////////////////////////////////////////////////////////

////////////////////////////////////////////////
        //object of cellphone class
        cellphone sony = new cellphone();

        System.out.println();
        sony.calling();
        sony.vibrate();
        sony.ring();

        ////////////////////////////////////////////
        //creating an object of class square
        square sq =new square();
        sq.side=2;

        //attribute calling of class square
        System.out.println();

        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //sq.area();
        //sq.perimeter();
    /////////////////////////////////////////////////////

        Tommy1 game =new Tommy1();
      //  System.out.println(game.run()); System.out.println(game.hit()); System.out.println(game.fire());
       game.run();
        game.hit();
        game.fire();

///////////////////////////////////////////////////


    }
}
