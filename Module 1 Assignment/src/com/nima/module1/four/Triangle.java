package com.nima.module1.four;

public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;
    double angle = 0;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Triangle(double side1, double side2, double side3, Colour colour) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colour = colour;
    }

    /**
     * Calculates triangle's semi-perimeter
     * Calculates herons Area with herons equation
     * Calculates herons Height with triangle equation
     * @return herons Height which is found after all calculations
     */
    private double heronsHeight() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double heronsArea = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        double heronsHeight = heronsArea * 2 / side2;
        return heronsHeight;
    }

    /**
     * Calculates semi-perimeter and herons area when given a real triangle's measurements
     * @return herons area if true and half of area (sometimes a triangle) if false
     */
    @Override
    public double getArea() {
        if (side1 != 0 && side2 != 0 && side3 != 0) {
            double semiPerimeter = (side1 + side2 + side3) / 2;
            double heronsArea = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
            return heronsArea;
        } else {
            return width * height / 2;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", height=" + height +
                '}';
    }

    @Override
    public double rotate90() {
        angle += 90;
        return angle;
    }

    @Override
    public double rotate180() {
        angle += 180;
        return angle;
    }

    @Override
    public double rotate(double degree) {
        angle += degree;
        return angle;
    }
}




