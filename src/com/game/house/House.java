package com.game.house;

import com.game.player.Player;

import java.util.Scanner;

//Does this need to be a class or will it be taken care of with XML?

public class House {
    private static String housePrompt = "You wake up to the sound of the church bell ringing.\n" +
            "Your mother is baking bread on the hearth and rocking in a chair.\n" +
            "You get out of bed, and go to her.\n" +
            "\"They're coming for you,\" she says. She hands you a bag, and says\n" +
            "\"Better pack your things and sneak out while you can.\"";

    private static String whatsInTheBox = "There is a front door and a back door, \n" +
            "a closet, and window. Your mother is baking bread \n" +
            "on the hearth.";

    private static String options1 = "What would you like to do?\n" +
            "1. Open front door.\n" +
            "2. Open back door.\n" +
            "3. Talk to your mother.\n" +
            "4. Open the closet.\n" +
            "5. Pick up the frying pan.\n" +
            "6. Open the window.";

    private static String op1 = "You open the front door and a mob is waiting outside.\n" +
            "They throw stones at you, decreasing your health.\n" +
            "You close the door and look for another way out. [DECREMENT HEALTH -2]";

    private static String op2 = "You open the back door. Several zombies heard the door,\n" +
            "and swarm your house. Your mother tries to help you\n" +
            "close the door, but the zombies rip off her arm before\n" +
            "devouring you both. [GAME OVER]";

    private static String op3 = "You ask your mother to com with you, but she says she can't.\n" +
            "She gives you a piece of bread and you add it to your bag. [ADD BREAD TO BAG]";

    private static String op4 = "You open the closet and find a scrap of leather \n" +
            "and a locket your mother gave you. You can't do anything with the leather\n" +
            "put the locket on. [INCREMENT HEALTH +1]";

    private static String op5 = "You pick up a frying pan. You don't have a weapon,\n" +
            "but this should do for now.[SET FRYING PAN TO EQUIPPED]";

    private static String op6 = "You hug your mother, and climb out the window which faces the Market. [CUE MARKET CODE]";

    private static String op7 = "";

    private static String op8 = "";

    private static String op9 = "";

    private static String whatsLeftInTheBox = "You thought you saw a piece of leather in here earlier.";

    private static String options2 = "What would you like to do?\n" +
            "7. Open front door.\n" +
            "8. Open back door.\n" +
            "9. Check the closet.";

    public static void play() {
        System.out.println("THE HOUSE");
        System.out.println(housePrompt);
        System.out.println(" ");
        System.out.println(whatsInTheBox);
        System.out.println(" ");
        System.out.println("Your health is now: " + Player.getHealth());
        collectInput(options1);
    }

    public void returnFromMarket() {
        System.out.println("THE HOUSE");
        System.out.println(whatsLeftInTheBox);
        System.out.println(" ");
        collectInput(options2);
    }

    private static void collectInput(String options) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(options);
        int houseInput = input.nextInt();
        printConsequence(houseInput);
    }

    private static void printConsequence(int houseInput) {
        switch (houseInput) {
            case 1:
                System.out.println(op1);
                Player.changeHealth(-2);
                System.out.println("Your health is now:" + Player.getHealth());
                collectInput(options1);
                break;
            case 2:
                System.out.println(op2);
                System.exit(0);
                break;
            case 3:
                System.out.println(op3);
                collectInput(options1);
                break;
            case 4:
                System.out.println(op4);
                Player.changeHealth(1);
                System.out.println("Your health is now:" + Player.getHealth());
                collectInput(options1);
                break;
            case 5:
                System.out.println(op5);
                collectInput(options1);
                break;
            case 6:
                System.out.println(op6);
                break;
            case 7:
                System.out.println(op7);
                break;
            case 8:
                System.out.println(op8);
                break;
            case 9:
                System.out.println(op9);
                break;
            default:
                System.out.println("The number you entered was invalid. Please try again.");
                collectInput(options1); // This is awkward right here because it needs to print options 1 or options 2
        }
    }
}
/*  Possible actions in the house
    -Talk to mom (get bread)
    -Eat bread
    -Throw bread
    -Open front door (villagers, decrease health)
    -Close front door
    -Grab Frying Pan
    -Equip Frying Pan
    -Open back door
    -Close back door
    -Attack (with equipped weapon)
    -Open closet (collect an item, what?)
    -Grab item
    -Grab rock
    -Throw rock
    -
 */