package com.xworkz.ladder.laddermaterial;

public class Ladder {
    private String material;
    private double height; // in feet
    private int numberOfSteps;
    private boolean isFoldable;
    private double costPerUnit;
    private String origin;
    private String manufacturer;

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }
    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public boolean getIsFoldable() {
        return isFoldable;
    }
    public void setFoldable(boolean foldable) {
        isFoldable = foldable;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }
    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
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

