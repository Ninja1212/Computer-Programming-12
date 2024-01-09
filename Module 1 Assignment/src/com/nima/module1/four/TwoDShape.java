package com.nima.module1.four;

public abstract class TwoDShape {
    double width;
    double height;

    /**
     * Obtains a color from its class
     * Sets TwoDShape's parameters
     */
    Colour colour;
    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public TwoDShape() {}

    public abstract double getArea();

    /**
     * General setters and getters for the parameters of a TwoDShape
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    /**
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    /**
     * Set and get colour for TwoDShapes
     */
    public void setColour() { this.colour = colour; }

    public Colour getColour() { return colour; }
}