package com.game.player;


import java.util.ArrayList;

public abstract class Player {
    private static String currentLocation = "House";
    private static int health = 5;
    private static ArrayList<String> inventory = new ArrayList<String>(5);
    private static String equipped = "No item equipped";

    private Player() {
    }

    public static void changeHealth(int num){
        setHealth(getHealth()+ num);
    }


    private static void printStats(){
        // This prints after every turn
        System.out.println("---------------- \n" +
                "Current Location: " + currentLocation + "\n" +
                        "Health: " + health + "\n" +
                        "Inventory: " + inventory + "\n" +
                        "Equipped: " + equipped
                );
    }

// GETTERS + SETTERS
    public static int getHealth() {


        return health;
    }


    public static void setHealth(int newHealth) {
        health = newHealth;
    }

    public static String getCurrentLocation() {
        return currentLocation;
    }

    public static void setCurrentLocation(String currentLocation) {
        Player.currentLocation = currentLocation;
    }

    public static ArrayList<String> getInventory() {
        return inventory;
    }

    public static void setInventory(ArrayList<String> inventory) {
        Player.inventory = inventory;
    }

    public static String getEquipped() {
        return equipped;
    }

    public static void setEquipped(String equipped) {
        Player.equipped = equipped;
    }

    // come up with a mehtod that checks the health is zero or less. if true. exit game. system.exit
}
