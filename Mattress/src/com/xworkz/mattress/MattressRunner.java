package com.xworkz.mattress;

import com.xworkz.mattress.mattressmaterial.Mattress;

public class MattressRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Mattress
        Mattress mattress1 = new Mattress();
        mattress1.setType("Memory Foam");
        mattress1.setLength(200);
        mattress1.setWidth(180);
        mattress1.setThickness(20);
        mattress1.setHypoallergenic(true);
        mattress1.setPrice(15000);
        mattress1.setBrand("Sleepwell");
        mattress1.setOrigin("India");

        System.out.println("Mattress 1 Details:");
        System.out.println("Type: " + mattress1.getType());
        System.out.println("Length: " + mattress1.getLength() + " cm");
        System.out.println("Width: " + mattress1.getWidth() + " cm");
        System.out.println("Thickness: " + mattress1.getThickness() + " cm");
        System.out.println("Hypoallergenic: " + mattress1.getIsHypoallergenic());
        System.out.println("Price: ₹" + mattress1.getPrice());
        System.out.println("Brand: " + mattress1.getBrand());
        System.out.println("Origin: " + mattress1.getOrigin());

        // Second Mattress
        Mattress mattress2 = new Mattress();
        mattress2.setType("Spring");
        mattress2.setLength(190);
        mattress2.setWidth(150);
        mattress2.setThickness(18);
        mattress2.setHypoallergenic(false);
        mattress2.setPrice(12000);
        mattress2.setBrand("SpringFit");
        mattress2.setOrigin("USA");

        System.out.println("\nMattress 2 Details:");
        System.out.println("Type: " + mattress2.getType());
        System.out.println("Length: " + mattress2.getLength() + " cm");
        System.out.println("Width: " + mattress2.getWidth() + " cm");
        System.out.println("Thickness: " + mattress2.getThickness() + " cm");
        System.out.println("Hypoallergenic: " + mattress2.getIsHypoallergenic());
        System.out.println("Price: ₹" + mattress2.getPrice());
        System.out.println("Brand: " + mattress2.getBrand());
        System.out.println("Origin: " + mattress2.getOrigin());

        System.out.println("Main Ended");
    }
}

