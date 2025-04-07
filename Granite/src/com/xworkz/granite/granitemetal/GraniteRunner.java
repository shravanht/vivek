package com.xworkz.granite;

import com.xworkz.granite.granitemetal.Granite;

public class GraniteRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Granite Instance
        Granite granite1 = new Granite();
        granite1.setType("Marble");
        granite1.setWeight(500.0);
        granite1.setGrade("A");
        granite1.setPolished(true);
        granite1.setCostPerSqFt(150.75);
        granite1.setOrigin("Italy");
        granite1.setManufacturer("Cosentino");

        System.out.println("Granite Type: " + granite1.getType());
        System.out.println("Weight: " + granite1.getWeight() + " kg");
        System.out.println("Grade: " + granite1.getGrade());
        System.out.println("Polished: " + granite1.getIsPolished());
        System.out.println("Cost per sq ft: ₹" + granite1.getCostPerSqFt());
        System.out.println("Origin: " + granite1.getOrigin());
        System.out.println("Manufacturer: " + granite1.getManufacturer());

        // Second Granite Instance
        Granite granite2 = new Granite();
        granite2.setType("Quartz");
        granite2.setWeight(300.0);
        granite2.setGrade("B");
        granite2.setPolished(false);
        granite2.setCostPerSqFt(100.50);
        granite2.setOrigin("USA");
        granite2.setManufacturer("Caesarstone");

        System.out.println("Granite Type: " + granite2.getType());
        System.out.println("Weight: " + granite2.getWeight() + " kg");
        System.out.println("Grade: " + granite2.getGrade());
        System.out.println("Polished: " + granite2.getIsPolished());
        System.out.println("Cost per sq ft: ₹" + granite2.getCostPerSqFt());
        System.out.println("Origin: " + granite2.getOrigin());
        System.out.println("Manufacturer: " + granite2.getManufacturer());

        System.out.println("Main Ended");
    }
}

