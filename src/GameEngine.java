import com.we.xml.Location;
import com.we.xml.StaXParser;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class GameEngine {
    public static void main(String[] args) throws InterruptedException {
        StaXParser read = new StaXParser();
        List<Location> readConfig = read.readConfig("locations.xml");
        GameClass game = new GameClass();
        game.startNewGame();
    }
//    public static void main(String[] args) {
//        /* eventually we want something like this:
//GameClass game = new GameClass();
//game.startGame();
//*/
//        banner();
//        wantInstructions();
//        intro();
//        printStats();
//    }
//
//    // Prints opening banner
//    private static void banner(){
//        // Add sound clip here
//        System.out.println("Banner");
//    }
//
//    // Asks player if they want instructions
//    private static void wantInstructions(){
//        Scanner instInput = new Scanner(System.in);
//        System.out.println("Would you like instructions on how to play the game? Y/N");
//        String resp = instInput.nextLine().toUpperCase();
//
//        switch(resp) {
//            case "Y":
//                System.out.println("Here are the instructions.");
//                break;
//            case "N":
//                break;
//            default:
//                System.out.println("Please enter a valid input.");
//                wantInstructions();
//        }
//    }
//
//    private static void intro(){
//        // Add typewriter effect to this later. See notes
//// The following text needs to be moved to XML once we get it working.
//        System.out.println("   In the year 1692, during the Salem Witch trials, another heretical entity comes into being: the Undead. \n" +
//                "You are a young witch trying to leave your village in order to escape from the Puritans \n" +
//                "who have hanged or burned other suspected witches in town. Leaving the village has become more complicated \n" +
//                "now that you have to avoid not only the townsfolk, but also...ZOMBIES." +
//                "\n" +
//                "\n" +
//                "You wake up your home to the sound of townspeople banging on your door. Quickly gather your items and escape.");
//    }
//
//    private static void printStats(){
//        //This is hard coded for now
//        // set to initial state later
//        String currentLocation= "House";
//        // Look up how to add multiple items to an array succinctly
//        ArrayList<String> itemsInRoom = new ArrayList<String>();
//        itemsInRoom.add("rock");
//        itemsInRoom.add("frying pan");
//        itemsInRoom.add("bread");
//        ArrayList<String> inventory = new ArrayList<String>(5);
//        int health = 5;
//
//        // This prints after every turn
//        System.out.println("---------------- \n" +
//                "Current Location: " + currentLocation + "\n" +
//                "Items in Room: " + itemsInRoom + "\n" +
//                "Inventory: " + inventory + "\n" +
//                "Health: " + health);
//    }

    // Add item to inventory

    // Move to location

    // Write code to check if player health is >= 0
    // if health is 0 or less, game is over, prompt to restart game
}
