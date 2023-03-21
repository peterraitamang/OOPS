package com.example.oops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    int a,b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyBank activity = new com.example.oops.Status();
        activity.write();

        Finance activity1 = new Admin();
        activity1.readData();





//        areaOfRectangle();
//
//        //        peter.id = 1;
////        peter.name = "Peter Rai";
////        peter.address ="Lalitpur";
//
////        Log.d("Name",peter.name);
////        System.out.println(peter.id);
//
//        Student peter = new Student(1, "Peter Rai", "Lalitpur");
//        System.out.println(peter.id+peter.name+peter.address);
//
//    }
//
//    private void areaOfRectangle() {
//        Demo obj = new Demo();
//        obj.getData(2,3);
//        int result = obj.area();
//        System.out.println("Area:"+result);
//    }
//
//
//    static class Student{
//        int id;
//        String name;
//        String address;
//
//        public Student(int id, String name, String address) {
//            this.id = id;
//            this.name = name;
//            this.address = address;
//        }
//    }
//Multilevel Inheritance
//        Status myIntro = new Status();
//        myIntro.myname();
//        myIntro.myPet();
//        myIntro.myStatus();
//    }
//
//    class Name{
//        public void myname(){
//            System.out.println("My name is Peter Rai.");
//        }
//    }
//    class Pet extends Name{
//        public void myPet(){
//            System.out.println("I have a cat as a pet.");
//        }
//    }
//    class Status extends Pet{
//        public void myStatus(){
//            System.out.println("Iam currently unemployed.");
//        }
//    }
        //Hierarchical Inheritance
        Status status = new Status();
        Pet pet = new Pet();
        pet.petName();
        pet.Name();
        status.status();
        status.Name();


    }

    class Person{
        public void Name(){
            System.out.println("My Name is Peter Rai.");
        }
    }
    class Pet extends Person{
        public void petName(){
            System.out.println("I have a dog.");
        }
    }
    class Status extends Person{
        public void status(){
            System.out.println("Iam currently employed.");
        }
    }
}