package com.bridgelabz;

public class Shirt {
    String[] size = {"large","medium","small"};
    String color = "RED";
    int price = 1250;

    void calDiscount(){
        int discountOnLargeShirt =170;
        int discountOnMediumShirt =150;
        int discountOnSmallShirt =130;
        for (String s : size) {
            switch (s) {
                case "large" ->
                        System.out.println("Shirt color : "+color+ ", Discount for large shirt : " + discountOnLargeShirt + ", You need to pay " + (price - discountOnLargeShirt));
                case "medium" ->
                        System.out.println("Shirt color : "+color+ ", Discount for medium shirt : " + discountOnMediumShirt + ", You need to pay " + (price - discountOnMediumShirt));
                case "small" ->
                        System.out.println("Shirt color : "+color+ ", Discount for small shirt : " + discountOnSmallShirt + ", You need to pay " + (price - discountOnSmallShirt));
                default -> System.out.println("Try again");
            }
        }
    }
    void display(){
        calDiscount();
    }

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.display();
    }
}
