package com.xworkz.mattress.mattressmaterial;

public class Mattress {
    private String type;               // Type of mattress (e.g., Memory Foam, Spring, Latex)
    private double length;             // Length in cm
    private double width;              // Width in cm
    private double thickness;         // Thickness in cm
    private boolean isHypoallergenic;  // True if hypoallergenic
    private double price;              // Price of the mattress
    private String brand;              // Brand of the mattress
    private String origin;             // Country of origin

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getThickness() {
        return thickness;
    }
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public boolean getIsHypoallergenic() {
        return isHypoallergenic;
    }
    public void setHypoallergenic(boolean hypoallergenic) {
        isHypoallergenic = hypoallergenic;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
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

