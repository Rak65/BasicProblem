package com.overloading;

public class CountNoOfObject {
    static int count = 0;
    CountNoOfObject(){
        count++;
    }

    public static void main(String[] args) {
        CountNoOfObject countNoOfObject1 = new CountNoOfObject();
        CountNoOfObject countNoOfObject2 = new CountNoOfObject();
        CountNoOfObject countNoOfObject3 = new CountNoOfObject();
        CountNoOfObject countNoOfObject4 = new CountNoOfObject();
        CountNoOfObject countNoOfObject5= new CountNoOfObject();
        System.out.println("Total number of object = "+count);
    }
}
