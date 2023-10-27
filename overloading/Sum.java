package com.overloading;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum sum = new Sum();
        System.out.println("Enter three number : ");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        int c = sc.nextInt();
        int firstMethod = sum.add(a,b,c);
        System.out.println("Add = "+firstMethod);
        int secMethod = sum.add(a,c,b);
        System.out.println("Add = "+secMethod);
        sum.add(a,c);
    }
    int add(int a, int c, double b){
        return (int) (a+b+c);
    }
    int add(int a, double b, int c){
        return (int) (a+b+c);
    }
    void add(int a, int c){
        int add = a+c;
        System.out.println("Add = "+add);
    }
}
