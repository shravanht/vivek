package com.xworkz.hotelapp.hotel;

import com.xworkz.hotelapp.menu.Menu;


public class Hotel {
    public int  hotelId;
    public String location;
    public String branches[];
    public Menu menus[];

    public void display(){
        System.out.println("* * * * * * * * * * * *");
        System.out.println("hotel id is "+this.hotelId);
        System.out.println("hotel location is "+this.location);
        for(String hotelBranches:branches) {
            System.out.println("hotel branch is " + hotelBranches);
        }
    }


}