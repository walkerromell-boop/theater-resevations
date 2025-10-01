package com.pluralsight;

public class ClassExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Nissan");
        car1.setModel("Helltima");
        car1.display(); //this is how you call for a method on instance of an object
        // variable.display

        Car car2 = new Car();
        car2.setMake("Ford");
        car2.setModel("Mustang");
        car2.display();
    }


}
