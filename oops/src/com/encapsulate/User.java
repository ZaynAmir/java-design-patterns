package com.encapsulate;

public class User {
    public String name;

    public User(String name, int age){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hi my name is " + name);
    }
}
