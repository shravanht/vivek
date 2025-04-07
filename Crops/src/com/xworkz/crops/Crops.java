package com.xworkz.crops.cropmaterial;

public class Crops {
    private String name;
    private String season;
    private String countryOfOrigin;
    private boolean isFoodCrop;
    private double yieldPerAcre;
    private String farmer;
    private String use;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public boolean getIsFoodCrop() {
        return isFoodCrop;
    }
    public void setFoodCrop(boolean foodCrop) {
        isFoodCrop = foodCrop;
    }

    public double getYieldPerAcre() {
        return yieldPerAcre;
    }
    public void setYieldPerAcre(double yieldPerAcre) {
        this.yieldPerAcre = yieldPerAcre;
    }

    public String getFarmer() {
        return farmer;
    }
    public void setFarmer(String farmer) {
        this.farmer = farmer;
    }

    public String getUse() {
        return use;
    }
    public void setUse(String use) {
        this.use = use;
    }
}

