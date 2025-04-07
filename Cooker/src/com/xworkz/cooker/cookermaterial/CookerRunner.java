package com.xworkz.cooker;

import com.xworkz.cooker.cookermaterial.Cooker;

public class CookerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Cooker
        Cooker cooker1 = new Cooker();
        cooker1.setType("Pressure Cooker");
        cooker1.setWeight(3.5);
        cooker1.setMaterial("Stainless Steel");
        cooker1.setInductionCompatible(true);
        cooker1.setCost(1500.0);
        cooker1.setOrigin("India");
        cooker1.setManufacturer("Hawkins");

        System.out.println("Cooker Type: " + cooker1.getType());
        System.out.println("Weight: " + cooker1.getWeight() + " kg");
        System.out.println("Material: " + cooker1.getMaterial());
        System.out.println("Induction Compatible: " + cooker1.getIsInductionCompatible());
        System.out.println("Cost: ₹" + cooker1.getCost());
        System.out.println("Origin: " + cooker1.getOrigin());
        System.out.println("Manufacturer: " + cooker1.getManufacturer());

        // Second Cooker
        Cooker cooker2 = new Cooker();
        cooker2.setType("Induction Cooker");
        cooker2.setWeight(2.0);
        cooker2.setMaterial("Aluminum");
        cooker2.setInductionCompatible(true);
        cooker2.setCost(2500.0);
        cooker2.setOrigin("Japan");
        cooker2.setManufacturer("Panasonic");

        System.out.println("\nCooker Type: " + cooker2.getType());
        System.out.println("Weight: " + cooker2.getWeight() + " kg");
        System.out.println("Material: " + cooker2.getMaterial());
        System.out.println("Induction Compatible: " + cooker2.getIsInductionCompatible());
        System.out.println("Cost: ₹" + cooker2.getCost());
        System.out.println("Origin: " + cooker2.getOrigin());
        System.out.println("Manufacturer: " + cooker2.getManufacturer());

        System.out.println("Main Ended");
    }
}

