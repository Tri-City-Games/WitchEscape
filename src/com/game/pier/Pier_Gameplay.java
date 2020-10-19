package com.game.pier;

import com.market.ArisMarketSquare;

import java.util.Scanner;

import static com.game.pier.Boardwalk.*;
import static com.game.pier.Pier.*;

//add an array of all locations and start removing them based on user's choice

public class Pier_Gameplay {

     static void player_input() throws InterruptedException {
        //health and item inventory count
         loop: while(true) {
             Scanner direction_choice = new Scanner(System.in);  // Create a Scanner object
             System.out.println("Where would you like to go?");

             String choice = direction_choice.nextLine();  // Read user input
             //System.out.println(choice);

             //DISPLAY PARAMETER PROMPT HERE
             switch (choice) {
                 case "sailor group":
                     //System.out.println("You arrive at " + choice);
                     sailor_group();
                     break;
                 case "ale house":
                     //System.out.println("You arrive at " + choice);
                     ale_House();
                     break;
                 case "pier":
                     //System.out.println("You arrive at " + choice);
                     ship_picker();
                     break;
                 case "wooden crates":
                     //System.out.println("You arrive at " + choice);
                     wooden_crate();
                     break;
                 case "ale kegs":
                     //System.out.println("You arrive at " + choice);
                     ale_kegs();
                     break;
                 case "grain bags":
                     //System.out.println("You arrive at " + choice);
                     grain_bags();
                     break;
                 case "to market":
                     ArisMarketSquare.fourthPrompt();
                     break;
                 default:
                     System.out.println("Sorry! You can't go there.");
                     player_input(); //REMOVING PLAYERINPUT() AND BREAK
                     break loop; //add to end of switch
             }
         }
    }

    public static void run_pier() throws InterruptedException {
        System.out.println("You emerge from the Market. You're standing on the boardwalk near the sea and you see a group of Sailors and further down an Ale House.");
        player_input();
//        random_gossip();
//        System.out.println("You leave and look around, you see the pier and a group of sailors."); //need to add a way to remove locations here
//        player_input();
//        System.out.println("You turn around, you see the pier and three ships.");
//        player_input();
//        System.out.println("You're back on the pier, you see some wooden crates and grain bags.");
//        player_input();
//        random_gossip();
//        System.out.println("Still on the pier, last place to look is some ale kegs.");
//        player_input();
//        Thread.sleep(4000);
//        System.out.println("You survive, get the piece of leather and head back toward the Market.");
   // }
    }
}

//add while loop for health (while health >0..)

//USING 'ENTER' KEY TO MOVE THROUGH THE PRINTLINS
//         Scanner scanner = new Scanner(System.in);
//         String readString = scanner.nextLine();
//         while(readString!=null) {
//             System.out.println(readString);
//
//             if (readString.isEmpty()) {
//                 System.out.println("Read Enter Key.");
//             }
//
//             if (scanner.hasNextLine()) {
//                 readString = scanner.nextLine();
//             } else {
//                 readString = null;
//             }
//         }

//        String cmd="foo bar \"foo bar\" foo"; String cmd would be 'choice'
//[...]
//        ArrayList commands = new ArrayList();
//        char[] chars = cmd.toCharArray();
//        boolean open = false;
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '\"') {
//                open = !open;
//            } else if (chars[i] == ' ' && !open) {
//                commands.add(sb.toString());
//                sb = new StringBuffer();
//            } else {
//                sb.append(chars[i]);
//            }
//        }
//        if (sb.length() > 0) {
//            commands.add(sb.toString());
//        }
//
//        String[] pieces = new String[commands.size()];
//        commands.toArray(pieces);

//OR use split: String strs[] = " 1 ON OFF".split(" ");
//With this example you'll get this array: ["", "1", "ON", "OFF"].
//add verbs to an array list, add nouns to another array list check both user input [0] and [1] against each
//verb/noun array USE.CONTAINS()