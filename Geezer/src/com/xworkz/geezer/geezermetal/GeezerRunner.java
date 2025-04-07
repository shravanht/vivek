package com.xworkz.geezer;

import com.xworkz.geezer.geezermetal.Geezer;

public class GeezerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Geezer Instance
        Geezer geezer1 = new Geezer();
        geezer1.setType("Instant");
        geezer1.setCapacity(15.0);
        geezer1.setGrade("A");
        geezer1.setEnergyEfficient(true);
        geezer1.setCost(4500.00);
        geezer1.setOrigin("India");
        geezer1.setManufacturer("Bajaj");

        System.out.println("The Geezer type is " + geezer1.getType());
        System.out.println("The capacity is " + geezer1.getCapacity() + " liters");
        System.out.println("The grade is " + geezer1.getGrade());
        System.out.println("Is energy efficient? " + geezer1.getIsEnergyEfficient());
        System.out.println("The cost is ₹" + geezer1.getCost());
        System.out.println("The origin is " + geezer1.getOrigin());
        System.out.println("The manufacturer is " + geezer1.getManufacturer());

        // Second Geezer Instance
        Geezer geezer2 = new Geezer();
        geezer2.setType("Storage");
        geezer2.setCapacity(25.0);
        geezer2.setGrade("B");
        geezer2.setEnergyEfficient(false);
        geezer2.setCost(3500.50);
        geezer2.setOrigin("USA");
        geezer2.setManufacturer("Whirlpool");

        System.out.println("The Geezer type is " + geezer2.getType());
        System.out.println("The capacity is " + geezer2.getCapacity() + " liters");
        System.out.println("The grade is " + geezer2.getGrade());
        System.out.println("Is energy efficient? " + geezer2.getIsEnergyEfficient());
        System.out.println("The cost is ₹" + geezer2.getCost());
        System.out.println("The origin is " + geezer2.getOrigin());
        System.out.println("The manufacturer is " + geezer2.getManufacturer());

        // Third Geezer Instance
        Geezer geezer3 = new Geezer();
        geezer3.setType("Gas");
        geezer3.setCapacity(20.0);
        geezer3.setGrade("C");
        geezer3.setEnergyEfficient(true);
        geezer3.setCost(5200.75);
        geezer3.setOrigin("Germany");
        geezer3.setManufacturer("Bosch");

        System.out.println("The Geezer type is " + geezer3.getType());
        System.out.println("The capacity is " + geezer3.getCapacity() + " liters");
        System.out.println("The grade is " + geezer3.getGrade());
        System.out.println("Is energy efficient? " + geezer3.getIsEnergyEfficient());
        System.out.println("The cost is ₹" + geezer3.getCost());
        System.out.println("The origin is " + geezer3.getOrigin());
        System.out.println("The manufacturer is " + geezer3.getManufacturer());

        // Fourth Geezer Instance
        Geezer geezer4 = new Geezer();
        geezer4.setType("Electric");
        geezer4.setCapacity(30.0);
        geezer4.setGrade("A+");
        geezer4.setEnergyEfficient(true);
        geezer4.setCost(6000.00);
        geezer4.setOrigin("Japan");
        geezer4.setManufacturer("Panasonic");

        System.out.println("The Geezer type is " + geezer4.getType());
        System.out.println("The capacity is " + geezer4.getCapacity() + " liters");
        System.out.println("The grade is " + geezer4.getGrade());
        System.out.println("Is energy efficient? " + geezer4.getIsEnergyEfficient());
        System.out.println("The cost is ₹" + geezer4.getCost());
        System.out.println("The origin is " + geezer4.getOrigin());
        System.out.println("The manufacturer is " + geezer4.getManufacturer());

        System.out.println("Main Ended");
    }
}
