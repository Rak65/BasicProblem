package com.bridgelabz;

public class Student {
    String name = "Rakesh";
    int age = 25;
    String id = "12RB56";
    public static void main(String[] args) {
        Student student = new Student();
        student.details();
    }
    public void details(){
        System.out.println("Name : "+name+", Age : "+age);
    }
}
