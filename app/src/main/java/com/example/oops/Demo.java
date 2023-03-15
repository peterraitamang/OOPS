package com.example.oops;

public class Demo {
    int length, breadth;

    void getData(int l , int  b){
        length = l;
        breadth = b;
    }
    int area(){
        int rectArea = length * breadth;
        return rectArea;
    }
}
