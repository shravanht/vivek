
package com.xworkz.constitution.constitutionmaterial;

public class Constitution {
    private String name;
    private String dateOfAdoption;
    private String country;
    private boolean isDemocratic;
    private int numberOfArticles;
    private String author;
    private String significance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfAdoption() {
        return dateOfAdoption;
    }
    public void setDateOfAdoption(String dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public boolean getIsDemocratic() {
        return isDemocratic;
    }
    public void setDemocratic(boolean democratic) {
        isDemocratic = democratic;
    }

    public int getNumberOfArticles() {
        return numberOfArticles;
    }
    public void setNumberOfArticles(int numberOfArticles) {
        this.numberOfArticles = numberOfArticles;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSignificance() {
        return significance;
    }
    public void setSignificance(String significance) {
        this.significance = significance;
    }
}
