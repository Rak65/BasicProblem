package com.overloading;

import java.util.Scanner;

public class NestingMethod {
    static int length;
    static int breadth;
    static int height;
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length, breadth and height");
        length = scanner.nextInt();
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        volume();
    }
    static void volume(){
        int volume =length*breadth*height;
        System.out.println("Volume is : "+volume);
        area();
    }
    static void area(){
        int area = 2*(length*breadth + length*height + height*breadth);
        System.out.println("Area is "+area);
        perimeter();
    }
    static void perimeter(){
        int perimeter = 4*(length+breadth+height);
        System.out.println("Perimeter is "+perimeter);
    }

    public static void main(String[] args) {
        input();
    }
}
