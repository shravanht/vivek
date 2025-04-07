package com.xworkz.steel.steelmetal;

public class Steel {
    private String type;
    private double weight;
    private String grade;
    private boolean isRecyclable;
    private double costPerKg;
    private String origin;
    private String manufacturer;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public boolean getIsRecyclable() {
        return isRecyclable;
    }
    public void setRecyclable(boolean recyclable) {
        isRecyclable = recyclable;
    }

    public double getCostPerKg() {
        return costPerKg;
    }
    public void setCostPerKg(double costPerKg) {
        this.costPerKg = costPerKg;
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