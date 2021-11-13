package com.company;

import java.lang.Math;

public class Triangulo extends Figuras {

    private double sideLength;   // cm
    private double heightLength; // cm

    public Triangulo(double sideLength) {
        this.sideLength = sideLength;
        this.heightLength = calculateHeightLength();
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
        this.heightLength = calculateHeightLength();
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getHeightLength() {
        return heightLength;
    }

    public double area() {
        return (sideLength * heightLength) / 2.0;
    }

    public double perimeter() {
        return sideLength * 3.0;
    }

    private double calculateHeightLength() {
        return (Math.sqrt(3.0) * this.sideLength) / 2.0;
    }

}