package com.nima.module1.four;

public interface Rotate {
    public default double rotate90() {
        double angle = 90;
        return angle;
    }
    public default double rotate180() {
        double angle = 180;
        return angle;
    }
    public default double rotate(double degree) {
        double angle = degree * 2;
        return angle;
    }
}
// GET THIS CHECKED!!!