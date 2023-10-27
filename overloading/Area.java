package com.overloading;

import java.util.Scanner;

public class Area {
    public double areaTriangle(double length, double height){
        return (length*height)/2;
    }
    public double areaRectangle(double length, double width){
        return (length * width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length, height and width : ");
        double length = scanner.nextDouble();
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        Area area = new Area();
        double rectangleArea = area.areaRectangle(length,width);
        double triangleArea = area.areaTriangle(length,height);
        System.out.println("Area of rectangle = "+rectangleArea);
        System.out.println("Area of triangle = "+triangleArea);
    }
}
