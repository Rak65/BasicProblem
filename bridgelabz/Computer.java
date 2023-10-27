package com.bridgelabz;

public class Computer {
    String processor = "Intel Core i series";
    int ramInGb = 8;
    int storageInGB = 32;
    void calculatePrice(){
        int price = 56000;
        if(processor.equals("Intel Core i series")&& ramInGb==8 && storageInGB==32)
            System.out.println("Price of computer is : "+price);
    }
    void display(){
        System.out.println("Processor : "+processor+" Ram "+ramInGb+" Storage : "+storageInGB);
        calculatePrice();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.display();
    }
}
