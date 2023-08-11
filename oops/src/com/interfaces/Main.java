package com.interfaces;

public class Main {
    public static void main(String[] args) {
       Shape[] s = new Shape[] { new Rectangle(5, 10), new Circle(7) };
       calculate(s);
    }

    public static void calculate(Shape[] s){
//         Modularity and flexibility
        Shape[] shapes = s;
        for (Shape shape : shapes) {
            System.out.println("hi");
            System.out.println(shape.getArea());
        }

    }
}