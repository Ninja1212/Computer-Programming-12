package com.nima.module1.four;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
    }

    /**
     * gets the circle's area
     * @return the circle's area
     */
    @Override
    public double getArea() {
        double circleArea = PI * radius * radius;
        return circleArea;
    }

    /**
     * prints out with toString
     * @return the circle's attributes
     */
    @Override
    public String toString() {
        return "Circle{" + "PI=" + PI + ", radius=" + radius + '}';
    }


}