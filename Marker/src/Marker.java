package com.xworkz.marker.markeritem;

public class Marker {
    private String brand;
    private String color;
    private double inkCapacity; // in ml
    private boolean isPermanent;
    private double price;
    private String origin;
    private String type;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getInkCapacity() {
        return inkCapacity;
    }
    public void setInkCapacity(double inkCapacity) {
        this.inkCapacity = inkCapacity;
    }

    public boolean getIsPermanent() {
        return isPermanent;
    }
    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
