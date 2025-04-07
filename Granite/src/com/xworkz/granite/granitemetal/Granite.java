package com.xworkz.granite.granitemetal;

public class Granite {
    private String type;
    private double weight;
    private String grade;
    private boolean isPolished;
    private double costPerSqFt;
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

    public boolean getIsPolished() {
        return isPolished;
    }
    public void setPolished(boolean polished) {
        isPolished = polished;
    }

    public double getCostPerSqFt() {
        return costPerSqFt;
    }
    public void setCostPerSqFt(double costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
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

