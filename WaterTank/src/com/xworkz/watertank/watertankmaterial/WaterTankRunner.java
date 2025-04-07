package com.xworkz.watertank;

import com.xworkz.watertank.watertankmaterial.WaterTank;

public class WaterTankRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Water Tank Instance
        WaterTank tank1 = new WaterTank();
        tank1.setMaterial("Plastic");
        tank1.setCapacity(1000.0);
        tank1.setColor("Blue");
        tank1.setDurable(true);
        tank1.setCostPerLiter(0.50);
        tank1.setOrigin("India");
        tank1.setManufacturer("Sintex");

        System.out.println("Water Tank Material: " + tank1.getMaterial());
        System.out.println("Capacity: " + tank1.getCapacity() + " liters");
        System.out.println("Color: " + tank1.getColor());
        System.out.println("Durable: " + tank1.getIsDurable());
        System.out.println("Cost per Liter: ₹" + tank1.getCostPerLiter());
        System.out.println("Origin: " + tank1.getOrigin());
        System.out.println("Manufacturer: " + tank1.getManufacturer());

        // Second Water Tank Instance
        WaterTank tank2 = new WaterTank();
        tank2.setMaterial("Steel");
        tank2.setCapacity(2000.0);
        tank2.setColor("Silver");
        tank2.setDurable(true);
        tank2.setCostPerLiter(1.20);
        tank2.setOrigin("Germany");
        tank2.setManufacturer("ArcelorMittal");

        System.out.println("\nWater Tank Material: " + tank2.getMaterial());
        System.out.println("Capacity: " + tank2.getCapacity() + " liters");
        System.out.println("Color: " + tank2.getColor());
        System.out.println("Durable: " + tank2.getIsDurable());
        System.out.println("Cost per Liter: ₹" + tank2.getCostPerLiter());
        System.out.println("Origin: " + tank2.getOrigin());
        System.out.println("Manufacturer: " + tank2.getManufacturer());

        System.out.println("Main Ended");
    }
}

