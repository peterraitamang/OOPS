package com.example.oops;

 interface MyBank {
     void write();
}

class Status implements MyBank{

    @Override
    public void write() {
        System.out.println("Hello World");
    }
}
