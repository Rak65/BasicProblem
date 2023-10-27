package com.overloading;

import java.util.Scanner;

public class Calculator {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two value : ");
        int valueFirst = scanner.nextInt();
        int valueSecond = scanner.nextInt();
        int result =add(valueFirst,valueSecond);
        System.out.println("Result = "+result);
    }
    public int add(int valueFirst, int valueSecond){
        return (valueFirst+valueSecond);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.input();
    }
}
