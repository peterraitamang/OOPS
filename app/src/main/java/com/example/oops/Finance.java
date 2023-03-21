package com.example.oops;

public abstract class Finance {
    String name;
    int salary;
 //wrong approach
//    void readData(){
//        System.out.println("I can read data");
//    }

    abstract void readData();
}
class Admin extends Finance{

    @Override
    void readData() {
        System.out.println("Hi , i can read data using abstract class.");
    }
}
