package com.overloading;

import java.util.Scanner;

public class TypeCasting {
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two byte values :");
        byte firstValue = scanner.nextByte();
        byte secondValue = scanner.nextByte();
        sum(firstValue,secondValue);
    }

    private static void sum(byte firstValue, byte secondValue) {
        System.out.println("Sum is = "+((int) firstValue + (int) secondValue));
    }

    public static void main(String[] args) {
        input();
    }
}
