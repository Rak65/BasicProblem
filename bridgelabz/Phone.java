package com.bridgelabz;

public class Phone {
    String make = "Micro max";
    String model = "max52";
    String storage = "32gb";

    public void calculatePrice(){
        int price = 15000;
        if (make.equals("Micro max")&&model.equals("max52")&&storage.equals("32gb"))
            System.out.println("Price of phone is = "+price);
    }
    public void display(){
        System.out.println("Make : "+make+ " Model : "+model+" Storage : "+storage);
        calculatePrice();
    }
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.display();
    }
}
