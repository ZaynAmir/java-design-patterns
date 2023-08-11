package com.interfaces;

interface Shape {
    public float getArea();
}

class Rectangle implements Shape{
    public int width;
    public int height;
    Rectangle(int width, int height){
        this.width = width;
        this.height =height;
    }
    @Override
    public float getArea(){
        return width * height;
    }
}

class Circle implements Shape{
    public float radius;
    Circle(float radius){
        this.radius = radius;
    }
    @Override
    public float getArea(){
        return (float) (Math.PI * radius * radius);
    }
}

