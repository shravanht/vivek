package com.xworkz.tile;

import com.xworkz.tile.tilematerial.Tile;

public class TileRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Tile Instance
        Tile tile1 = new Tile();
        tile1.setMaterial("Ceramic");
        tile1.setSize(2.5);
        tile1.setColor("White");
        tile1.setWaterResistant(true);
        tile1.setCostPerSqFt(8.99);
        tile1.setOrigin("Italy");
        tile1.setManufacturer("Marazzi");

        System.out.println("Tile Material: " + tile1.getMaterial());
        System.out.println("Size: " + tile1.getSize() + " sq ft");
        System.out.println("Color: " + tile1.getColor());
        System.out.println("Water Resistant: " + tile1.getIsWaterResistant());
        System.out.println("Cost per Sq Ft: ₹" + tile1.getCostPerSqFt());
        System.out.println("Origin: " + tile1.getOrigin());
        System.out.println("Manufacturer: " + tile1.getManufacturer());

        // Second Tile Instance
        Tile tile2 = new Tile();
        tile2.setMaterial("Porcelain");
        tile2.setSize(3.0);
        tile2.setColor("Beige");
        tile2.setWaterResistant(false);
        tile2.setCostPerSqFt(12.49);
        tile2.setOrigin("Spain");
        tile2.setManufacturer("Porcelanosa");

        System.out.println("\nTile Material: " + tile2.getMaterial());
        System.out.println("Size: " + tile2.getSize() + " sq ft");
        System.out.println("Color: " + tile2.getColor());
        System.out.println("Water Resistant: " + tile2.getIsWaterResistant());
        System.out.println("Cost per Sq Ft: ₹" + tile2.getCostPerSqFt());
        System.out.println("Origin: " + tile2.getOrigin());
        System.out.println("Manufacturer: " + tile2.getManufacturer());

        System.out.println("Main Ended");
    }
}

