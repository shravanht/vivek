package com.xworkz.chalk;

import com.xworkz.chalk.chalkmaterial.Chalk;

public class ChalkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Chalk
        Chalk chalk1 = new Chalk();
        chalk1.setColor("White");
        chalk1.setLength(9.5);
        chalk1.setDiameter(8.0);
        chalk1.setDustFree(true);
        chalk1.setQuantityInBox(12);
        chalk1.setBrand("Camlin");
        chalk1.setOrigin("India");

        System.out.println("Chalk 1 Details:");
        System.out.println("Color: " + chalk1.getColor());
        System.out.println("Length: " + chalk1.getLength() + " cm");
        System.out.println("Diameter: " + chalk1.getDiameter() + " mm");
        System.out.println("Dust Free: " + chalk1.getIsDustFree());
        System.out.println("Quantity in Box: " + chalk1.getQuantityInBox());
        System.out.println("Brand: " + chalk1.getBrand());
        System.out.println("Origin: " + chalk1.getOrigin());

        // Second Chalk
        Chalk chalk2 = new Chalk();
        chalk2.setColor("Yellow");
        chalk2.setLength(8.0);
        chalk2.setDiameter(9.5);
        chalk2.setDustFree(false);
        chalk2.setQuantityInBox(10);
        chalk2.setBrand("Faber-Castell");
        chalk2.setOrigin("Germany");

        System.out.println("\nChalk 2 Details:");
        System.out.println("Color: " + chalk2.getColor());
        System.out.println("Length: " + chalk2.getLength() + " cm");
        System.out.println("Diameter: " + chalk2.getDiameter() + " mm");
        System.out.println("Dust Free: " + chalk2.getIsDustFree());
        System.out.println("Quantity in Box: " + chalk2.getQuantityInBox());
        System.out.println("Brand: " + chalk2.getBrand());
        System.out.println("Origin: " + chalk2.getOrigin());

        System.out.println("Main Ended");
    }
}
