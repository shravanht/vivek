package com.xworkz.festival;

import com.xworkz.festival.festivalmaterial.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Festival
        Festival festival1 = new Festival();
        festival1.setName("Diwali");
        festival1.setDate("November 12, 2023");
        festival1.setCountryOfOrigin("India");
        festival1.setReligious(true);
        festival1.setBudget(500.0);
        festival1.setOrganizer("Government of India");
        festival1.setTheme("Festival of Lights");

        System.out.println("Festival Name: " + festival1.getName());
        System.out.println("Date: " + festival1.getDate());
        System.out.println("Country of Origin: " + festival1.getCountryOfOrigin());
        System.out.println("Religious Festival: " + festival1.getIsReligious());
        System.out.println("Budget: $" + festival1.getBudget() + " million");
        System.out.println("Organizer: " + festival1.getOrganizer());
        System.out.println("Theme: " + festival1.getTheme());

        // Second Festival
        Festival festival2 = new Festival();
        festival2.setName("Christmas");
        festival2.setDate("December 25, 2023");
        festival2.setCountryOfOrigin("Bethlehem");
        festival2.setReligious(true);
        festival2.setBudget(300.0);
        festival2.setOrganizer("Global Christian Community");
        festival2.setTheme("Joy and Giving");

        System.out.println("\nFestival Name: " + festival2.getName());
        System.out.println("Date: " + festival2.getDate());
        System.out.println("Country of Origin: " + festival2.getCountryOfOrigin());
        System.out.println("Religious Festival: " + festival2.getIsReligious());
        System.out.println("Budget: $" + festival2.getBudget() + " million");
        System.out.println("Organizer: " + festival2.getOrganizer());
        System.out.println("Theme: " + festival2.getTheme());

        System.out.println("Main Ended");
    }
}

