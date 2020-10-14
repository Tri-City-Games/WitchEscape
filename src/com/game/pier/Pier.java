package com.game.pier;

import java.util.*;

public class Pier {

    //Boats Encounters
    static void boat_encounters() throws InterruptedException {
        //Boat 1()-Turned Away
        System.out.println("You approach the first ship. It's made of dark wood and you see what appear to be bite marks...maybe from mysterious sea creatures?");
        Thread.sleep(2000);
        System.out.println("You quickly get on the ramp to aboard the ship, look around and don't see anyone on deck.");
        Thread.sleep(2000);
        System.out.println("Hey! You! Get outta here!");
        Thread.sleep(4000);
        System.out.println("You're startled as a Sailor appears and rushes you off the ship back on to the pier.");
        //Boat 2()-Zombie attack
        Thread.sleep(4000);
        System.out.println("You approach the second ship. This one is black and an eerie fog seems to be lingering around it just above the sea.");
        Thread.sleep(2000);
        System.out.println("You look around, coast is clear. You board the ship, creep around the dock when suddenly...");
        Thread.sleep(2000);
        System.out.println("ZOMBIES ATTACK!"); //need to flesh this out further-add health and equipped items
        //you either live or die here.
        //Boat 3()-Leather found
        Thread.sleep(4000);
        System.out.println("You approach the third ship. It's made from wood but it's white and well taken care of, the paint looks fresh.");
        Thread.sleep(2000);
        System.out.println("The ramp is brightly lit, you don't see anyone around. Hopefully you can find just a scrap of leather aboard this ship.");
        Thread.sleep(2000);
        System.out.println("You walk around the deck and see a sign on the door-'Laundry'");
        //prompt user to choose to enter or walk away
        Thread.sleep(2000);
        System.out.println("You enter the Laundry and start rummaging around the various laundry bags in the room");
        Thread.sleep(2000);
        System.out.println("Just when you're about to give up, you find a sailor's pants with the belt still on them!");
        Thread.sleep(2000);
        System.out.println("You pull the belt off the pants and place it inside your bag.");
        //add belt to inventory here
        Thread.sleep(2000);
        System.out.println("You run out of the laundry, off the ship's ramp and back onto the pier");
    }

    //Wooden Crate()
    static void wooden_crate () throws InterruptedException {
        //user input that prompt them to search the wooden crates
        System.out.println("You see some wooden crates filled with exotic looking fresh fruit.");
        Thread.sleep(3000);
        System.out.println("You push around the fruit looking for a leather scrap-you find nothing.");
    }
    //Grain Bags()
    static void grain_bags() throws InterruptedException {
        //user input that prompt them to search the grain bags
        System.out.println("You see some large thick linen grain bags, you untie them hoping you can use the leather wrapping.");
        Thread.sleep(3000);
        System.out.println("The leather wrapping comes away and doesn't seem to be enough to give to the lady in the market.");
    }

    //Ale Kegs()
    static void ale_kegs() throws InterruptedException {
        //user input that prompts them to search the ale kegs
        System.out.println("You see some large ale kegs.");
        Thread.sleep(3000);
        System.out.println("You think that it's a good idea to get shield of sorts to protect you from the angry townspeople and even the rare occurrence of Zombie attack ");
        Thread.sleep(3000);
        System.out.println("You try to pop off the lid of the first keg-it's sealed shut.");
        Thread.sleep(2000);
        System.out.println("You try to pop off the lid of the second keg-it pops off!");
        //equip function here add to inventory/weapons
    }

}