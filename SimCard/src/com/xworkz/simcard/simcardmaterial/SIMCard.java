package com.xworkz.simcard.simmaterial;

public class SIMCard {
    private String type;          // e.g., Nano, Micro, Standard
    private double weight;        // in grams
    private String carrier;      // e.g., Airtel, Jio, Vodafone
    private boolean isActivated;  // True if the SIM is active
    private double cost;          // Cost of the SIM card
    private String origin;        // Country of origin
    private String manufacturer;  // Manufacturer of the SIM card

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

    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public boolean getIsActivated() {
        return isActivated;
    }
    public void setActivated(boolean activated) {
        isActivated = activated;
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

