package com.xworkz.celebrity;

import com.xworkz.celebrity.celebritymaterial.Celebrity;

public class CelebrityRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Celebrity
        Celebrity celebrity1 = new Celebrity();
        celebrity1.setName("Shah Rukh Khan");
        celebrity1.setAge(58);
        celebrity1.setProfession("Actor");
        celebrity1.setAwardWinner(true);
        celebrity1.setNetWorth(750.0);
        celebrity1.setNationality("Indian");
        celebrity1.setAgency("Red Chillies Entertainment");

        System.out.println("Celebrity Name: " + celebrity1.getName());
        System.out.println("Age: " + celebrity1.getAge());
        System.out.println("Profession: " + celebrity1.getProfession());
        System.out.println("Award Winner: " + celebrity1.getIsAwardWinner());
        System.out.println("Net Worth: $" + celebrity1.getNetWorth() + " million");
        System.out.println("Nationality: " + celebrity1.getNationality());
        System.out.println("Agency: " + celebrity1.getAgency());

        // Second Celebrity
        Celebrity celebrity2 = new Celebrity();
        celebrity2.setName("Taylor Swift");
        celebrity2.setAge(35);
        celebrity2.setProfession("Singer");
        celebrity2.setAwardWinner(true);
        celebrity2.setNetWorth(400.0);
        celebrity2.setNationality("American");
        celebrity2.setAgency("Republic Records");

        System.out.println("\nCelebrity Name: " + celebrity2.getName());
        System.out.println("Age: " + celebrity2.getAge());
        System.out.println("Profession: " + celebrity2.getProfession());
        System.out.println("Award Winner: " + celebrity2.getIsAwardWinner());
        System.out.println("Net Worth: $" + celebrity2.getNetWorth() + " million");
        System.out.println("Nationality: " + celebrity2.getNationality());
        System.out.println("Agency: " + celebrity2.getAgency());

        System.out.println("Main Ended");
    }
}

