package com.xworkz.shirt.clothing;

public class Shirt {
    private String brand;
    private String color;
    private String size;
    private boolean isCotton;
    private double price;
    private String origin;
    private String manufacturer;


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

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public boolean getIsCotton() {
        return isCotton;
    }
    public void setCotton(boolean isCotton) {
        this.isCotton = isCotton;
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

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}


