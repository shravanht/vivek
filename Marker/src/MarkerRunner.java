package com.xworkz.marker;

import com.xworkz.marker.markeritem.Marker;

public class MarkerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        // First Marker Instance
        Marker marker1 = new Marker();
        marker1.setBrand("Sharpie");
        marker1.setColor("Black");
        marker1.setInkCapacity(10.5);
        marker1.setPermanent(true);
        marker1.setPrice(5.99);
        marker1.setOrigin("USA");
        marker1.setType("Permanent Marker");

        System.out.println("Marker Brand: " + marker1.getBrand());
        System.out.println("Color: " + marker1.getColor());
        System.out.println("Ink Capacity: " + marker1.getInkCapacity() + " ml");
        System.out.println("Permanent: " + marker1.getIsPermanent());
        System.out.println("Price: ₹" + marker1.getPrice());
        System.out.println("Origin: " + marker1.getOrigin());
        System.out.println("Type: " + marker1.getType());

        // Second Marker Instance
        Marker marker2 = new Marker();
        marker2.setBrand("Faber-Castell");
        marker2.setColor("Red");
        marker2.setInkCapacity(8.0);
        marker2.setPermanent(false);
        marker2.setPrice(3.49);
        marker2.setOrigin("Germany");
        marker2.setType("Whiteboard Marker");

        System.out.println("\nMarker Brand: " + marker2.getBrand());
        System.out.println("Color: " + marker2.getColor());
        System.out.println("Ink Capacity: " + marker2.getInkCapacity() + " ml");
        System.out.println("Permanent: " + marker2.getIsPermanent());
        System.out.println("Price: ₹" + marker2.getPrice());
        System.out.println("Origin: " + marker2.getOrigin());
        System.out.println("Type: " + marker2.getType());

        System.out.println("Main Ended");
    }
}

