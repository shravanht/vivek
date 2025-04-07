package com.xworkz.celebrity.celebritymaterial;

public class Celebrity {
    private String name;              // Name of the celebrity
    private int age;                  // Age of the celebrity
    private String profession;        // e.g., Actor, Singer, Athlete
    private boolean isAwardWinner;    // True if the celebrity has won any awards
    private double netWorth;          // Net worth in million dollars
    private String nationality;       // Country of nationality
    private String agency;            // Managing agency of the celebrity

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean getIsAwardWinner() {
        return isAwardWinner;
    }
    public void setAwardWinner(boolean awardWinner) {
        isAwardWinner = awardWinner;
    }

    public double getNetWorth() {
        return netWorth;
    }
    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAgency() {
        return agency;
    }
    public void setAgency(String agency) {
        this.agency = agency;
    }
}

