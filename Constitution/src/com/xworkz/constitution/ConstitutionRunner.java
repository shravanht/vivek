package com.xworkz.constitution;

import com.xworkz.constitution.constitutionmaterial.Constitution;

public class ConstitutionRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Constitution
        Constitution constitution1 = new Constitution();
        constitution1.setName("Indian Constitution");
        constitution1.setDateOfAdoption("26 January 1950");
        constitution1.setCountry("India");
        constitution1.setDemocratic(true);
        constitution1.setNumberOfArticles(448);
        constitution1.setAuthor("Dr. B. R. Ambedkar");
        constitution1.setSignificance("Supreme law of India, establishes the framework for the political principles, procedures, and powers of the government.");

        System.out.println("Constitution Name: " + constitution1.getName());
        System.out.println("Date of Adoption: " + constitution1.getDateOfAdoption());
        System.out.println("Country: " + constitution1.getCountry());
        System.out.println("Democratic: " + constitution1.getIsDemocratic());
        System.out.println("Number of Articles: " + constitution1.getNumberOfArticles());
        System.out.println("Author: " + constitution1.getAuthor());
        System.out.println("Significance: " + constitution1.getSignificance());

        // Second Constitution
        Constitution constitution2 = new Constitution();
        constitution2.setName("United States Constitution");
        constitution2.setDateOfAdoption("17 September 1787");
        constitution2.setCountry("United States of America");
        constitution2.setDemocratic(true);
        constitution2.setNumberOfArticles(7);
        constitution2.setAuthor("Founding Fathers of the USA");
        constitution2.setSignificance("Established the framework for the federal government and the rights of individuals.");

        System.out.println("\nConstitution Name: " + constitution2.getName());
        System.out.println("Date of Adoption: " + constitution2.getDateOfAdoption());
        System.out.println("Country: " + constitution2.getCountry());
        System.out.println("Democratic: " + constitution2.getIsDemocratic());
        System.out.println("Number of Articles: " + constitution2.getNumberOfArticles());
        System.out.println("Author: " + constitution2.getAuthor());
        System.out.println("Significance: " + constitution2.getSignificance());

        System.out.println("Main Ended");
    }
}

