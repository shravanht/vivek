package com.xworkz.mobilecase.mobilematerial;

public class MobileCase {
    private String material;
    private double weight; // in grams
    private String color;
    private boolean isShockproof;
    private double cost;
    private String origin;
    private String manufacturer;

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsShockproof() {
        return isShockproof;
    }
    public void setShockproof(boolean shockproof) {
        isShockproof = shockproof;
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
