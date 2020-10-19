package com.game.player;

import java.util.ArrayList;

public class Player {
    private static String currentLocation = "House";
    private static int health = 5;
    public static ArrayList<String> inventory = new ArrayList<String>();
    private static String equipped = "No item equipped";

    private Player() {
    }

    public static void changeHealth(int num){
        setHealth(getHealth()+ num);
    }

    public static void addToBag(String item){
//        System.out.println("Your bag before adding item: " + inventory);
        inventory.add(item);
        System.out.println("Currently in your bag: " + inventory);
    }

    public static boolean threeLeather(){
        ArrayList<String> leather = new ArrayList<>();
        for (String item : inventory){
            if (item.equals("leather")) {
                leather.add(item);
            }
        }
        return leather.size() >= 3;
    }

    public static void leatherCheck(){
        if (threeLeather()){
            System.out.println("You have collected three pieces of leather! \n" +
                    "Return to the old woman in the market and make a trade for her horse!");
        }
        else {
            System.out.println("You need to collect three pieces of leather. Keep looking!");
        }
    }

    public static void printStats(){
        // This prints after every turn
        System.out.println("---------------- \n" +
                "Current Location: " + currentLocation + "\n" +
                        "Health: " + health + "\n" +
                        "Inventory: " + inventory + "\n" +
                        "Equipped: " + equipped
                );
    }

// GETTERS + SETTERS
    public static int getHealth(){
        return health;
    }

    public static int setHealth(int newHealth){
        return health = newHealth;
    }

    public static String getCurrentLocation() {
        return currentLocation;
    }

    public static void setCurrentLocation(String currentLocation) {
        Player.currentLocation = currentLocation;
    }

    public static String getEquipped() {
        return equipped;
    }

    public static void setEquipped(String equipped) {
        Player.equipped = equipped;
    }
}
