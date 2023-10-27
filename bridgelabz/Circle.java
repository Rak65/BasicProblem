package com.bridgelabz;

import java.text.DecimalFormat;

public class Circle {
    double radius = 15.0;
    void areaCircle(){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Area of circle = "+decimalFormat.format(area));
    }
    void circumferenceArea(){
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle = "+Math.round(circumference*100)/100.0);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.areaCircle();
        circle.circumferenceArea();
    }
}
