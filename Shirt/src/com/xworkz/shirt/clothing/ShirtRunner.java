package com.xworkz.shirt;

import com.xworkz.shirt.clothing.Shirt;

public class ShirtRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Shirt shirt1 = new Shirt();
        shirt1.setBrand("Polo");
        shirt1.setColor("Blue");
        shirt1.setSize("L");
        shirt1.setCotton(true);
        shirt1.setPrice(1299.99);
        shirt1.setOrigin("India");
        shirt1.setManufacturer("Polo Ralph Lauren");

        System.out.println("The Shirt brand is " + shirt1.getBrand());
        System.out.println("The color is " + shirt1.getColor());
        System.out.println("The size is " + shirt1.getSize());
        System.out.println("Is it cotton? " + shirt1.getIsCotton());
        System.out.println("The price is ₹" + shirt1.getPrice());
        System.out.println("The origin is " + shirt1.getOrigin());
        System.out.println("The manufacturer is " + shirt1.getManufacturer());


        Shirt shirt2 = new Shirt();
        shirt2.setBrand("Tommy Hilfiger");
        shirt2.setColor("White");
        shirt2.setSize("M");
        shirt2.setCotton(false);
        shirt2.setPrice(1499.50);
        shirt2.setOrigin("USA");
        shirt2.setManufacturer("Tommy Hilfiger");

        System.out.println("The Shirt brand is " + shirt2.getBrand());
        System.out.println("The color is " + shirt2.getColor());
        System.out.println("The size is " + shirt2.getSize());
        System.out.println("Is it cotton? " + shirt2.getIsCotton());
        System.out.println("The price is ₹" + shirt2.getPrice());
        System.out.println("The origin is " + shirt2.getOrigin());
        System.out.println("The manufacturer is " + shirt2.getManufacturer());


        Shirt shirt3 = new Shirt();
        shirt3.setBrand("H&M");
        shirt3.setColor("Black");
        shirt3.setSize("S");
        shirt3.setCotton(true);
        shirt3.setPrice(999.99);
        shirt3.setOrigin("Sweden");
        shirt3.setManufacturer("H&M");

        System.out.println("The Shirt brand is " + shirt3.getBrand());
        System.out.println("The color is " + shirt3.getColor());
        System.out.println("The size is " + shirt3.getSize());
        System.out.println("Is it cotton? " + shirt3.getIsCotton());
        System.out.println("The price is ₹" + shirt3.getPrice());
        System.out.println("The origin is " + shirt3.getOrigin());
        System.out.println("The manufacturer is " + shirt3.getManufacturer());

        // Fourth Shirt Instance
        Shirt shirt4 = new Shirt();
        shirt4.setBrand("Zara");
        shirt4.setColor("Grey");
        shirt4.setSize("XL");
        shirt4.setCotton(false);
        shirt4.setPrice(1999.75);
        shirt4.setOrigin("Spain");
        shirt4.setManufacturer("Zara");

        System.out.println("The Shirt brand is " + shirt4.getBrand());
        System.out.println("The color is " + shirt4.getColor());
        System.out.println("The size is " + shirt4.getSize());
        System.out.println("Is it cotton? " + shirt4.getIsCotton());
        System.out.println("The price is ₹" + shirt4.getPrice());
        System.out.println("The origin is " + shirt4.getOrigin());
        System.out.println("The manufacturer is " + shirt4.getManufacturer());

        System.out.println("Main Ended");
    }
}
