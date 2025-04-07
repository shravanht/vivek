package com.xworkz.steel;

import com.xworkz.steel.steelmetal.Steel;

public class SteelRunner {
    public static void main(String arg[]){
        System.out.println("main Started");

        Steel steel = new Steel();
        steel.setType("alloy");
        steel.setWeight(150.00);
        steel.setGrade("A36");
        steel.setRecyclable(true);
        steel.setCostPerKg(2.5);
        steel.setOrigin("India");
        steel.setManufacturer("Tata Steel");

        String type = steel.getType();
        double weight = steel.getWeight();
        String grade = steel.getGrade();
        boolean isRecyclable = steel.getIsRecyclable();
        double costPerKg = steel.getCostPerKg();
        String origin = steel.getOrigin();
        String manufacturer = steel.getManufacturer();

        System.out.println("The Steel type is "+type);
        System.out.println("The weight is "+weight);
        System.out.println("the grade is "+grade);
        System.out.println("it is recyclable "+isRecyclable);
        System.out.println("The cost per kg is "+costPerKg);
        System.out.println("The origin is "+origin);
        System.out.println("The manufacturer is "+manufacturer);

        Steel steel1 = new Steel();
        steel1.setType("carbon");
        steel1.setWeight(200.00);
        steel1.setGrade("A996");
        steel1.setRecyclable(false);
        steel1.setCostPerKg(3.0);
        steel1.setOrigin("USA");
        steel1.setManufacturer("US Steel");

        String type1 = steel1.getType();
        double weight1 = steel1.getWeight();
        String grade1 = steel1.getGrade();
        boolean isRecyclable1 = steel1.getIsRecyclable();
        double costPerKg1 = steel1.getCostPerKg();
        String origin1 = steel1.getOrigin();
        String manufacturer1 = steel1.getManufacturer();

        System.out.println("The Steel type is "+type1);
        System.out.println("The weight is "+weight1);
        System.out.println("the grade is "+grade1);
        System.out.println("it is recyclable "+isRecyclable1);
        System.out.println("The cost per kg is "+costPerKg1);
        System.out.println("The origin is "+origin1);
        System.out.println("The manufacturer is "+manufacturer1);

        Steel steel2 = new Steel();
        steel2.setType("Stainless");
        steel2.setWeight(100.00);
        steel2.setGrade("304");
        steel2.setRecyclable(true);
        steel2.setCostPerKg(4.2);
        steel2.setOrigin("Germany");
        steel2.setManufacturer("Thyssenkrupp");

        String type2 = steel2.getType();
        double weight2 = steel2.getWeight();
        String grade2 = steel2.getGrade();
        boolean isRecyclable2 = steel2.getIsRecyclable();
        double costPerKg2 = steel2.getCostPerKg();
        String origin2 = steel2.getOrigin();
        String manufacturer2 = steel2.getManufacturer();

        System.out.println("The Steel type is "+type2);
        System.out.println("The weight is "+weight2);
        System.out.println("the grade is "+grade2);
        System.out.println("it is recyclable "+isRecyclable2);
        System.out.println("The cost per kg is "+costPerKg2);
        System.out.println("The origin is "+origin2);
        System.out.println("The manufacturer is "+manufacturer2);


        Steel steel3 = new Steel();
        steel3.setType("tool");
        steel3.setWeight(75.00);
        steel3.setGrade("D2");
        steel3.setRecyclable(false);
        steel3.setCostPerKg(5.5);
        steel3.setOrigin("Japan");
        steel3.setManufacturer("Nippon Steel");

        String type3 = steel3.getType();
        double weight3 = steel3.getWeight();
        String grade3 = steel3.getGrade();
        boolean isRecyclable3 = steel3.getIsRecyclable();
        double costPerKg3 = steel3.getCostPerKg();
        String origin3 = steel3.getOrigin();
        String manufacturer3 = steel3.getManufacturer();

        System.out.println("The Steel type is "+type3);
        System.out.println("The weight is "+weight3);
        System.out.println("the grade is "+grade3);
        System.out.println("it is recyclable "+isRecyclable3);
        System.out.println("The cost per kg is "+costPerKg3);
        System.out.println("The origin is "+origin3);
        System.out.println("The manufacturer is "+manufacturer3);


        Steel steel4 = new Steel();
        steel4.setType("Galvanized");
        steel4.setWeight(180.00);
        steel4.setGrade("G60");
        steel4.setRecyclable(true);
        steel4.setCostPerKg(3.8);
        steel4.setOrigin("China");
        steel4.setManufacturer("Baosteel");

        String type4 = steel4.getType();
        double weight4 = steel4.getWeight();
        String grade4 = steel4.getGrade();
        boolean isRecyclable4 = steel4.getIsRecyclable();
        double costPerKg4 = steel4.getCostPerKg();
        String origin4 = steel4.getOrigin();
        String manufacturer4 = steel4.getManufacturer();

        System.out.println("The Steel type is "+type);
        System.out.println("The weight is "+weight);
        System.out.println("the grade is "+grade);
        System.out.println("it is recyclable "+isRecyclable);
        System.out.println("The cost per kg is "+costPerKg);
        System.out.println("The origin is "+origin);
        System.out.println("The manufacturer is "+manufacturer);

        System.out.println("Main ended");


    }
}
