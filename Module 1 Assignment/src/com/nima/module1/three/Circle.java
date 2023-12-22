package com.nima.module1.three;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double circleArea = 2 * PI * radius;
        return circleArea;
    }

    @Override
    public String toString() {
        return "Circle{" + "PI=" + PI + ", radius=" + radius + '}';
    }


}