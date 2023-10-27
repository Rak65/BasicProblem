package com.bridgelabz;

public class TV {
    String brand = "LG";
    double sizeInInch = 32.0;
    int price = 65000;
    public void discount(){
        int discount =1200;
        if(brand.equals("LG")&& sizeInInch==32.0 && price==65000){
            System.out.println("You will get "+discount+" discount");
            System.out.println("After discount you need to pay : "+(price-discount));
        }
    }
    void display(){
        System.out.println("Brand : "+brand+" Size : "+sizeInInch);
        discount();
    }

    public static void main(String[] args) {
        TV tv = new TV();
        tv.display();
    }
}
