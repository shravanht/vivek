package com.xworkz.tile.tilematerial;

public class Tile {
    private String material;
    private double size; // in square feet
    private String color;
    private boolean isWaterResistant;
    private double costPerSqFt;
    private String origin;
    private String manufacturer;

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsWaterResistant() {
        return isWaterResistant;
    }
    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
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

