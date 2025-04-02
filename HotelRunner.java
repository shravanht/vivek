package com.xworkz.hotelapp;

import com.xworkz.hotelapp.menu.Menu;
import com.xworkz.hotelapp.hotel.Hotel;


public class HotelRunner {
    public static void main(String args[]){
        System.out.println("main started");
        String ingredintsForTea[]= {"Milk","sugar","water","chaha powder"};
        String ingredintsForPalav[]= {"Rice","vegitbles","oil"};
        String  hotelBranches[] =  {"vijaynagar", "yelahanka"};

        Menu menus[]=new Menu[2];

        Menu menu1 = new Menu();
        menu1.menuId=1;
        menu1.menuName = "Amrut chaha";
        menu1.ingredients = ingredintsForTea;

        Menu menu2 = new Menu();
        menu2.menuId=2;
        menu2.menuName = "Palav";
        menu2.ingredients = ingredintsForPalav;



        menus[0]=menu1;
        menus[1]=menu2;

        Hotel ref = new Hotel();
        ref.hotelId = 1;
        ref.location = "Rajajinagar";
        ref.branches = hotelBranches;

        //hotel - menus[2]
        ref.menus = menus;

        ref.display();
        menu1.menuDisplay();
        menu2.menuDisplay();
        System.out.println("main ended");


    }

}