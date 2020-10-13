import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

import com.market.ArisMarketSquare;
import com.game.pier.Pier_Gameplay;
import com.game.house.*;

public class GameClass {
    // This is a placeholder for now.
    private String currentLocation= "com.game.house.House"; // This could be an ENUM
    private ArrayList<String> itemsInRoom = new ArrayList<String>(Arrays.asList("frying pan", "rock", "bread"));
    private ArrayList<String> inventory = new ArrayList<String>(5);
    private int health = 5;
    private String equipped;

    public GameClass() {
        // instantiates a new Game
    }

    void startNewGame() {
        banner();
        wantInstructions();
        intro();
        // run Amanda's code
        House.play();
        // run Sohail's code
<<<<<<< HEAD

=======
>>>>>>> 86b660e741c1ffc60b1a32efec47a05c3578f35f
        ArisMarketSquare.myMarket();
        // run Laura's code
        Pier_Gameplay.run_pier();
    }

    // Prints opening banner
    private static void banner(){
        Thread thd = new Thread();
        File file = new File("src/Banner.txt");
        try {
            int charValue = 0;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            thd.start();
            while ((charValue = reader.read()) != -1) {
                char character = (char)charValue;
                if(character == '\0'){
                    System.out.println();
                }
                System.out.print(character);
                Thread.sleep(3);
            }
        }catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
        // Add sound clip here
    }

    // Asks player if they want instructions
    private static void wantInstructions(){
        Scanner instInput = new Scanner(System.in);
        System.out.println("Would you like instructions on how to play the game? Y/N");
        String resp = instInput.nextLine().toUpperCase();

        switch(resp) {
            case "Y":
                System.out.println("Here are the instructions.");
                break;
            case "N":
                break;
            default:
                System.out.println("Please enter a valid input.");
                wantInstructions();
        }
    }

    private static void intro(){
        // Add typewriter effect to this later. See notes
        // The following text needs to be moved to XML once we get it working.
        System.out.println("   In the year 1692, during the Salem Witch trials, another heretical entity comes into being: the Undead. \n" +
                "You are a young witch trying to leave your village in order to escape from the Puritans \n" +
                "who have hanged or burned other suspected witches in town. Leaving the village has become more complicated \n" +
                "now that you have to avoid not only the townsfolk, but also...ZOMBIES." +
                "\n" +
                "\n" +
                "This is where we print the XML.");
    }

    private void printStats(){
        // This prints after every turn
        System.out.println("---------------- \n" +
                "Current Location: " + currentLocation + "\n" +
                "Items in Room: " + itemsInRoom + "\n" +
                "Inventory: " + inventory + "\n" +
                "Health: " + health);
    }
}