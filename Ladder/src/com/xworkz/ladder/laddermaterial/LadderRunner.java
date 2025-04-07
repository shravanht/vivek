package com.xworkz.ladder;

import com.xworkz.ladder.laddermaterial.Ladder;

public class LadderRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Ladder Instance
        Ladder ladder1 = new Ladder();
        ladder1.setMaterial("Aluminum");
        ladder1.setHeight(12.0);
        ladder1.setNumberOfSteps(10);
        ladder1.setFoldable(true);
        ladder1.setCostPerUnit(1500.0);
        ladder1.setOrigin("USA");
        ladder1.setManufacturer("Werner");

        System.out.println("Ladder Material: " + ladder1.getMaterial());
        System.out.println("Height: " + ladder1.getHeight() + " feet");
        System.out.println("Number of Steps: " + ladder1.getNumberOfSteps());
        System.out.println("Foldable: " + ladder1.getIsFoldable());
        System.out.println("Cost per Unit: ₹" + ladder1.getCostPerUnit());
        System.out.println("Origin: " + ladder1.getOrigin());
        System.out.println("Manufacturer: " + ladder1.getManufacturer());

        // Second Ladder Instance
        Ladder ladder2 = new Ladder();
        ladder2.setMaterial("Fiberglass");
        ladder2.setHeight(20.0);
        ladder2.setNumberOfSteps(15);
        ladder2.setFoldable(false);
        ladder2.setCostPerUnit(3000.0);
        ladder2.setOrigin("Germany");
        ladder2.setManufacturer("Youngman");

        System.out.println("\nLadder Material: " + ladder2.getMaterial());
        System.out.println("Height: " + ladder2.getHeight() + " feet");
        System.out.println("Number of Steps: " + ladder2.getNumberOfSteps());
        System.out.println("Foldable: " + ladder2.getIsFoldable());
        System.out.println("Cost per Unit: ₹" + ladder2.getCostPerUnit());
        System.out.println("Origin: " + ladder2.getOrigin());
        System.out.println("Manufacturer: " + ladder2.getManufacturer());

        System.out.println("Main Ended");
    }
}

