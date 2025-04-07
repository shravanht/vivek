package com.xworkz.crops;

import com.xworkz.crops.cropmaterial.Crops;

public class CropsRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Crop
        Crops crop1 = new Crops();
        crop1.setName("Wheat");
        crop1.setSeason("Rabi");
        crop1.setCountryOfOrigin("India");
        crop1.setFoodCrop(true);
        crop1.setYieldPerAcre(25.5);
        crop1.setFarmer("Rajesh Kumar");
        crop1.setUse("Food");

        System.out.println("Crop Name: " + crop1.getName());
        System.out.println("Season: " + crop1.getSeason());
        System.out.println("Country of Origin: " + crop1.getCountryOfOrigin());
        System.out.println("Food Crop: " + crop1.getIsFoodCrop());
        System.out.println("Yield per Acre: " + crop1.getYieldPerAcre() + " quintals");
        System.out.println("Farmer: " + crop1.getFarmer());
        System.out.println("Use: " + crop1.getUse());

        // Second Crop
        Crops crop2 = new Crops();
        crop2.setName("Rice");
        crop2.setSeason("Kharif");
        crop2.setCountryOfOrigin("China");
        crop2.setFoodCrop(true);
        crop2.setYieldPerAcre(30.0);
        crop2.setFarmer("Anita Sharma");
        crop2.setUse("Food");

        System.out.println("\nCrop Name: " + crop2.getName());
        System.out.println("Season: " + crop2.getSeason());
        System.out.println("Country of Origin: " + crop2.getCountryOfOrigin());
        System.out.println("Food Crop: " + crop2.getIsFoodCrop());
        System.out.println("Yield per Acre: " + crop2.getYieldPerAcre() + " quintals");
        System.out.println("Farmer: " + crop2.getFarmer());
        System.out.println("Use: " + crop2.getUse());

        System.out.println("Main Ended");
    }
}
