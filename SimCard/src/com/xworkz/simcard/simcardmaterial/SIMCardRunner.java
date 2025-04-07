package com.xworkz.simcard;

import com.xworkz.simcard.simmaterial.SIMCard;

public class SIMCardRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First SIM Card
        SIMCard sim1 = new SIMCard();
        sim1.setType("Nano");
        sim1.setWeight(0.2);
        sim1.setCarrier("Jio");
        sim1.setActivated(true);
        sim1.setCost(100.0);
        sim1.setOrigin("India");
        sim1.setManufacturer("Samsung");

        System.out.println("SIM Card Type: " + sim1.getType());
        System.out.println("Weight: " + sim1.getWeight() + " grams");
        System.out.println("Carrier: " + sim1.getCarrier());
        System.out.println("Activated: " + sim1.getIsActivated());
        System.out.println("Cost: ₹" + sim1.getCost());
        System.out.println("Origin: " + sim1.getOrigin());
        System.out.println("Manufacturer: " + sim1.getManufacturer());

        // Second SIM Card
        SIMCard sim2 = new SIMCard();
        sim2.setType("Micro");
        sim2.setWeight(0.3);
        sim2.setCarrier("Airtel");
        sim2.setActivated(false);
        sim2.setCost(150.0);
        sim2.setOrigin("India");
        sim2.setManufacturer("Apple");

        System.out.println("\nSIM Card Type: " + sim2.getType());
        System.out.println("Weight: " + sim2.getWeight() + " grams");
        System.out.println("Carrier: " + sim2.getCarrier());
        System.out.println("Activated: " + sim2.getIsActivated());
        System.out.println("Cost: ₹" + sim2.getCost());
        System.out.println("Origin: " + sim2.getOrigin());
        System.out.println("Manufacturer: " + sim2.getManufacturer());

        System.out.println("Main Ended");
    }
}

