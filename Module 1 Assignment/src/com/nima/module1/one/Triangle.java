package com.nima.module1.one;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double heronsHeight() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double heronsArea = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
        double heronsHeight = heronsArea * 2 / side2;
        return heronsHeight;
    }

    public double getArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double heronsArea = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
        return heronsArea;
    }
}

