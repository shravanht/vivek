package com.xworkz.geezer.geezermetal;

public class Geezer {
    private String type;
    private double capacity;  // in liters
    private String grade;
    private boolean isEnergyEfficient;
    private double cost;
    private String origin;
    private String manufacturer;

    // Getters and Setters
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public boolean getIsEnergyEfficient() {
        return isEnergyEfficient;
    }
    public void setEnergyEfficient(boolean isEnergyEfficient) {
        this.isEnergyEfficient = isEnergyEfficient;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

