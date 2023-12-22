package com.nima.module1.four;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
    }

    @Override
    public double getArea() {
        double circleArea = PI * radius * radius;
        return circleArea;
    }

    @Override
    public String toString() {
        return "Circle{" + "PI=" + PI + ", radius=" + radius + '}';
    }


}