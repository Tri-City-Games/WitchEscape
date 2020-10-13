import java.util.ArrayList;
import java.util.Arrays;

//Does this need to be a class or will it be taken care of with XML?

public class House {
    // A new game needs to initialize with the initial state for the player stats.
    // This will happen in a Game class, not here, but just for the sake of starting:
    // Copied this into GameClass during pair programming on 9 Oct.

    private String currentLocation= "Location"; // This could be an ENUM
    private ArrayList<String> itemsInRoom = new ArrayList<String>(Arrays.asList("frying pan", "rock", "bread"));
    private ArrayList<String> inventory = new ArrayList<String>(5);
    private int health = 5;
    private String equipped;

    // Stole this from GameClass for now (it should be inherited from GameClass
    private void printStats(){
        // This prints after every turn
        System.out.println("---------------- \n" +
                "Current Location: " + currentLocation + "\n" +
                "Items in Room: " + itemsInRoom + "\n" +
                "Inventory: " + inventory + "\n" +
                "Health: " + health);
    }

    // What we need to do next is get the prompt from location/house/prompt
    // Stopping here to start working on XML / Parser

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
}
