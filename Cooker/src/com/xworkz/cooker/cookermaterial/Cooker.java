package com.xworkz.cooker.cookermaterial;

public class Cooker {
    private String type;          // e.g., Pressure Cooker, Induction Cooker, Non-stick
    private double weight;        // in kilograms
    private String material;     // e.g., Stainless Steel, Aluminum
    private boolean isInductionCompatible;  // True if compatible with induction cooktops
    private double cost;          // Cost of the cooker
    private String origin;        // Country of origin
    private String manufacturer;  // Manufacturer of the cooker

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

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean getIsInductionCompatible() {
        return isInductionCompatible;
    }
    public void setInductionCompatible(boolean inductionCompatible) {
        isInductionCompatible = inductionCompatible;
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

