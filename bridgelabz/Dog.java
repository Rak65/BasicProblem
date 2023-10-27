package com.bridgelabz;

public class Dog {
    String breed = "BullDog";
    int age = 5;
    int weight = 23;

    void calculateDogAge() {
        int dogAge = 15;
        if(age>0) {
            if (age == 1)
                System.out.println("Dog age in human years = " + dogAge);
            else if (age == 2) {
                int dogAgeTwoYear = dogAge + 9;
                System.out.println("Dog is in human years = " + dogAgeTwoYear);
            } else {
                age = age - 2;
                int dogAgeInHumanYear = age * 5 + 24;
                System.out.println("Dog is in human years = " + dogAgeInHumanYear);
            }
        }
        else
            System.out.println("Please enter the valid dog age.");
    }
    void display(){
        System.out.println("Breed : "+breed+" Age "+age+" Weight "+weight);
        calculateDogAge();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
