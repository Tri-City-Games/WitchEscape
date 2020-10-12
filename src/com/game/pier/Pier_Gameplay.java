package com.game.pier;

import java.util.Scanner;

import static com.game.pier.Boardwalk.*;
import static com.game.pier.Pier.*;

//add an array of all locations and start removing them based on user's choice

public class Pier_Gameplay {

    static void player_input() {

        Scanner direction_choice = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Where would you like to go?");

        String choice = direction_choice.nextLine();  // Read user input
        System.out.println("You arrive at " + choice);
//add while loop for health (while health >0..)
        if (choice == "sailor group") {
            sailor_group();
        } else if (choice == "ale house") {
            ale_House();
        } else if (choice == "pier"){
                boat_encounters();
        } else {
            System.out.println("Sorry! You can't go there.");
        }
    }


    public static void main(String[] args) {
        System.out.println("You emerge from the Market. You're standing on the boardwalk near the sea and you see a group of Sailors and further down an Ale House.");
        player_input();
        System.out.println("You leave and look around, you see the pier and the ale house."); //need to add a way to remove locations here
        random_gossip();
        player_input();

    }
}