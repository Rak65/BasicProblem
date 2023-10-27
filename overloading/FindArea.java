package com.overloading;

import java.util.Scanner;

public class FindArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side : ");
        double side = sc.nextDouble();
        System.out.println("Enter length : ");
        double length = sc.nextDouble();
        System.out.println("Enter width : ");
        double width = sc.nextDouble();
        System.out.println("Enter radius : ");
        int radius = sc.nextInt();

        FindArea findArea = new FindArea();
        double areaSq = findArea.area(side);
        double areaRec = findArea.area(length,width);
        System.out.println("Area of square = "+areaSq);
        System.out.println("Area of rectangle = "+areaRec);
        findArea.area(radius);
    }
    double area(double side){
        return Math.pow(side,2);
    }
    double area(double length, double width){
        return (length*width);
    }
    void area(int radius){
        double areaCircle = (Math.PI *  Math.pow(radius, 2));
        System.out.println("Area of circle = "+areaCircle);
    }
}
