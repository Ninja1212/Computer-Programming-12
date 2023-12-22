package com.nima.module1.four;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> Shapes = new ArrayList<>();
        Shapes.add(new Triangle(5, 10));
        Shapes.add(new Triangle(5, 10, 8, Colour.BLUE));
        Shapes.add(new Circle(2, Colour.RED));
        
        for(int i = 0; i < Shapes.size(); i++){
            System.out.println(Shapes.get(i).toString());
            System.out.println(Shapes.get(i).getArea());
        }
    }
}
