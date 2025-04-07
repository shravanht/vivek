package com.xworkz.mobilecase;

import com.xworkz.mobilecase.mobilematerial.MobileCase;

public class MobileCaseRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Mobile Case
        MobileCase case1 = new MobileCase();
        case1.setMaterial("Silicone");
        case1.setWeight(50.0);
        case1.setColor("Black");
        case1.setShockproof(true);
        case1.setCost(1200.0);
        case1.setOrigin("China");
        case1.setManufacturer("Spigen");

        System.out.println("Mobile Case Material: " + case1.getMaterial());
        System.out.println("Weight: " + case1.getWeight() + " grams");
        System.out.println("Color: " + case1.getColor());
        System.out.println("Shockproof: " + case1.getIsShockproof());
        System.out.println("Cost: ₹" + case1.getCost());
        System.out.println("Origin: " + case1.getOrigin());
        System.out.println("Manufacturer: " + case1.getManufacturer());

        // Second Mobile Case
        MobileCase case2 = new MobileCase();
        case2.setMaterial("Leather");
        case2.setWeight(80.0);
        case2.setColor("Brown");
        case2.setShockproof(false);
        case2.setCost(2500.0);
        case2.setOrigin("Italy");
        case2.setManufacturer("Gucci");

        System.out.println("\nMobile Case Material: " + case2.getMaterial());
        System.out.println("Weight: " + case2.getWeight() + " grams");
        System.out.println("Color: " + case2.getColor());
        System.out.println("Shockproof: " + case2.getIsShockproof());
        System.out.println("Cost: ₹" + case2.getCost());
        System.out.println("Origin: " + case2.getOrigin());
        System.out.println("Manufacturer: " + case2.getManufacturer());

        System.out.println("Main Ended");
    }
}
