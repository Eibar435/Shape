package com.company;

class Cirulo extends Figuras {

    public static final double PI = 3.141592;

    protected double radius;

    public Cirulo(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return PI * getDiameter();
    }

}