package com.fitness.gymMngnt.Gym;

import com.fitness.gymMngnt.Member.Member;


public class Gym {
    public int gymId;
    public String gymName;
    public String location;
    public Member[] members;



    public void display() {
        System.out.println("Gym ID: " + gymId);
        System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Members Enrolled: ");
        for (Member member : members) {
            member.displayMember();
        }
    }
}

