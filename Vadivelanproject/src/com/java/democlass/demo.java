

package com.java.democlass;

class Bikesshowroom {
    String Bikename = "NINJA";
    String NewBike = "APRILLA";

    public void disp() {
        System.out.println("This is my first bike showroom");
        System.out.println("BIKE NAME IS " + Bikename);
        System.out.println("NEW BIKE NAME IS " + NewBike);
    }
}

class Carshowroom extends Bikesshowroom {
    public void display() {
        super.disp(); // Call the disp() method from the parent class
        System.out.println("This is my carshowroom");
    }
}

class Raja extends Carshowroom {
    public void displays() {
        System.out.println("This is my flightshowroom");
    }
}

public class demo 
{
    public static void main(String[] args) 
    {
        Raja f1 = new Raja();
        f1.disp();
        f1.display(); // Call the display() method from Carshowroom
        f1.displays(); // Call the displays() method from Raja
     }
    
}

