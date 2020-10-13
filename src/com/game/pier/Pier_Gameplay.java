package com.game.pier;

import java.util.Scanner;

import static com.game.pier.Boardwalk.*;
import static com.game.pier.Pier.*;

//add an array of all locations and start removing them based on user's choice

public class Pier_Gameplay {

    static void player_input() {
        //health and item inventory count
        Scanner direction_choice = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Where would you like to go?");

        String choice = direction_choice.nextLine();  // Read user input
        //System.out.println(choice);
            //add while loop for health (while health >0..)
        while(true) {
            if (choice.equals("sailor group")) {
                System.out.println("You arrive at " + choice);
                sailor_group();
                break;
            } else if (choice.equals("ale house")) {
                System.out.println("You arrive at " + choice);
                ale_House();
                break;
            } else if (choice.equals("pier")) {
                System.out.println("You arrive at " + choice);
                boat_encounters();
                break;
            } else if (choice.equals("wooden crates")) {
                System.out.println("You arrive at " + choice);
                wooden_crate();
                break;
            } else if (choice.equals("ale kegs")) {
                System.out.println("You arrive at " + choice);
                ale_kegs();
                break;
            } else if (choice.equals("grain bags")) {
                System.out.println("You arrive at " + choice);
                grain_bags();
                break;
            } else {
                System.out.println("Sorry! You can't go there.");
            }
        }
    }


    public static void run_pier() {
        System.out.println("You emerge from the Market. You're standing on the boardwalk near the sea and you see a group of Sailors and further down an Ale House.");
        player_input();
        random_gossip();
        System.out.println("You leave and look around, you see the pier and a group of sailors."); //need to add a way to remove locations here
        player_input();
        System.out.println("You turn around, you see the pier and three ships.");
        player_input();
        System.out.println("You're back on the pier, you see some wooden crates and grain bags.");
        player_input();
        random_gossip();
        System.out.println("Still on the pier, last place to look is some ale kegs.");
        player_input();
        System.out.println("You survive, get the piece of leather and head back toward the Market.");
    }
}