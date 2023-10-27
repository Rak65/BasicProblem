package com.bridgelabz;

import java.util.Scanner;

public class Furniture {
    String type = "Table";
    String[] material = {"Wood", "Glass", "Plastic", "Steel"};
    int price = 15000;

    public void discountCal() {
        int discountForEvenPosition = 200;
        int discountForOddPosition = 150;
        for (int i = 0; i < material.length; i++) {
            if (i % 2 == 1)
                System.out.println("Type: "+type+", Discount for " + material[i] + " = " + discountForEvenPosition + ", You need to pay : " + (price - discountForEvenPosition));
            else
                System.out.println("Type: "+type+", Discount for " + material[i] + " = " + discountForOddPosition + ", You need to pay : " + (price - discountForOddPosition));
        }
    }
    public void display(){
        discountCal();
    }

    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.display();
    }
}
