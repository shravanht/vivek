package com.xworkz.chalk.chalkmaterial;

public class Chalk {
    private String color;               // Color of the chalk (e.g., White, Yellow, Multicolor)
    private double length;              // Length of the chalk in cm
    private double diameter;            // Diameter of the chalk in mm
    private boolean isDustFree;         // True if the chalk is dust-free
    private int quantityInBox;          // Number of chalks in a box
    private String brand;               // Brand of the chalk
    private String origin;              // Country of origin

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public boolean getIsDustFree() {
        return isDustFree;
    }
    public void setDustFree(boolean dustFree) {
        isDustFree = dustFree;
    }

    public int getQuantityInBox() {
        return quantityInBox;
    }
    public void setQuantityInBox(int quantityInBox) {
        this.quantityInBox = quantityInBox;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

