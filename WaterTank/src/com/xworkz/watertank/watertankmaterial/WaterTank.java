package com.xworkz.watertank.watertankmaterial;

public class WaterTank {
    private String material;
    private double capacity; // in liters
    private String color;
    private boolean isDurable;
    private double costPerLiter;
    private String origin;
    private String manufacturer;

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsDurable() {
        return isDurable;
    }
    public void setDurable(boolean durable) {
        isDurable = durable;
    }

    public double getCostPerLiter() {
        return costPerLiter;
    }
    public void setCostPerLiter(double costPerLiter) {
        this.costPerLiter = costPerLiter;
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

