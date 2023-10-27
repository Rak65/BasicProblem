package com.bridgelabz;

public class Employee {
    String name ="Rakesh";
    int salary = 45000;
    String id = "123RK56";

    public void CalulateSalary(){
        int yearlySalary = salary * 12;
        System.out.println("Yearly Salary = "+yearlySalary);
    }
    public void print(){
        System.out.println("Name : "+name);
        CalulateSalary();
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.print();
    }
}
