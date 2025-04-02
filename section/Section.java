package com.freshmart.supermarket.section;


import com.freshmart.supermarket.product.Product;

public class Section {
        public int sectionId;
        public String sectionName;
        public Product[] products;


        public void displaySection() {

            System.out.println("----------------------");
            System.out.println("Section ID: " + sectionId);
            System.out.println("Section Name: " + sectionName);
            System.out.println("Products in this Section:");
            for (Product product : products) {
                product.displayProduct();
            }
            System.out.println("----------------------");
        }
    }

