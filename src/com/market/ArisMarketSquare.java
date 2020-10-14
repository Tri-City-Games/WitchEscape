package com.market;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//public class ArisMarketSquare {
//    // user input-user selects items to put in bag
//    static ArrayList<String> marketList = new ArrayList<String>(Arrays.asList("Leather", "More Leather", "Barret .50cal", "Pumpkin spice latte", "lucky penny"));
//
////put market is east of house or direction
//    //pier is north of market
//    // inventory, text parsing, item management  all use xml
//
//    public static void myMarket() {
//        firstPrompt();
//        insideShoppe();
//        secondPrompt();
//        thirdPrompt();
//    }
//        //****from Tom
////house market and pier are scenes****
//        //if similar put in ONE superclass****
//        //if user enters 1 goto wichwich sandwich shoppe
//        //if user enters 2 goto to shoe lady's shoppe
//        //if user enters 3 goto puritan church
//    public static void firstPrompt() {    // ask player where they want to go
//        System.out.println("You are now in Aris Market Square. What area would you like to explore next? \n " +
//                "Enter 1 for WichWich SandWich \n " +
//                "Enter 2 for Shoe Lady's Shoppe \n " +
//                "Enter 3 for WhichToSlay Church");
//        while (true) {
//            Scanner locationInput = new Scanner(System.in);
//            int response = locationInput.nextInt();
////    System.out.println(response);
//
//            switch (response) {
//                case 1:
//                    System.out.println("You are now inside WichWich Sandwich Shoppe");
//                    break;
//                case 2:
//                    System.out.println("You are now inside Shoe Lady's Shoppe.\n" +
//                            "Make a deal with the lady to obtain your horse for the escape.\n" +
//                            "You must collect 3 pieces of leather to trade for the horse.");
//                    insideShoppe();
//                    break;
//                case 3:
//                    System.out.println("You are now inside WhichToSlay Church. You have also been slayed. ");
//                    System.out.println("GAME OVER");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("You must be great at many things. Following simple directions is not one of them");
//            }
//        }
//    }
//
//    public static void insideShoppe() {
//        //System.out.println("Grab Items for your bag. \n ");
//        // "You can only have 5 items in your bag at any given time.
//
//        System.out.println("Grab an item. You can only hold a total of 5 items from all locations at one time \n" +
//                "Enter 0 for " + marketList.get(0) + "\n" +
//                "Enter 1 for " + marketList.get(1) + "\n" +
//                "Enter 2 for " + marketList.get(2) + "\n" +
//                "Enter 3 for " + marketList.get(3) + "\n" +
//                "Enter 4 for " + marketList.get(4));
//
//        //prompt to grab another item until 5 items in bag
//        while (true) {
//            Scanner itemInput = new Scanner(System.in);
//            int response2 = itemInput.nextInt();
//            System.out.println(response2);
////can call from list using index later can code this
//            if (response2 == 0) {
//                System.out.println("you now have " + marketList.get(0) + " in your bag");
//            } else if (response2 == 1) {
//                System.out.println("you now have " + marketList.get(1) + " in your bag");
//                break;
//            } else if (response2 == 2) {
//                System.out.println("you now have " + marketList.get(2) + " in your bag");
//                break;
//            } else if (response2 == 3) {
//                System.out.println("you now have " + marketList.get(3) + " in your bag");
//                break;
//            } else if (response2 == 4) {
//                System.out.println("you now have " + marketList.get(4) + " in your bag");
//                break;
//            } else
//                break;
//        }
//    }
//
//    public static void thirdPrompt() {
//        System.out.println("Which area would you like to explore next? \n " +
//                "Enter 1 for WichWich SandWich \n" +
//                "Enter 2 for Shoe Lady's Shoppe \n" +
//                "Enter 3 for WhichToSlay Church \n" +
//                "Enter 4 for Pier");
//        while (true) {
//            Scanner locationInput2 = new Scanner(System.in);
//            int response3 = locationInput2.nextInt();
////    System.out.println(response);
//
//            switch (response3) {
//                case 1:
//                    System.out.println("You are now inside WichWich Sandwich Shoppe");
//                    break;
//                case 2:
//                    System.out.println("You are now inside Shoe Lady's Shoppe.\n" +
//                            "You will give pieces of leather to the lady and receive your horse");
//                    break;
//                case 3:
//                    System.out.println("You are now inside WhichToSlay Church. You have also been slayed.");
//                    break;
//                case 4:
//                    System.out.println("You are now in the Pier");
//                    break;
//                default:
//                    System.out.println("BRUHHHHH");
//            }
//            System.out.println("You now have " + marketList + " in your bag! ");
//        }
//    }
//    public static void fourthPrompt() {
//        new Pier_Gameplay();
//    }
//// worry about limiting to five items later
//            //delete previously grabbed items
//            //add only what user grabbed
////
////inventory is what the user has it in its bag
//// show what user has in bag
////      for when user returns from the pier
//
//
//
//
//}







public class ArisMarketSquare {
    // user input-user selects items to put in bag
    static ArrayList<String> marketList = new ArrayList<String>(Arrays.asList("Leather", "More Leather", "Barret .50cal", "Pumpkin spice latte", "lucky penny"));

//put market is east of house or direction
    //pier is north of market
    // inventory, text parsing, item management  all use xml

    public static void myMarket() {
        firstPrompt();
        insideShoppe();
//        secondPrompt();
        thirdPrompt();
    }
    //****from Tom
//house market and pier are scenes****
    //if similar put in ONE superclass****
    //if user enters 1 goto wichwich sandwich shoppe
    //if user enters 2 goto to shoe lady's shoppe
    //if user enters 3 goto puritan church
    public static void firstPrompt() {    // ask player where they want to go
        System.out.println("You are now in Aris Market Square. What area would you like to explore next? \n " +
                "Enter 1 for WichWich SandWich \n " +
                "Enter 2 for Shoe Lady's Shoppe \n " +
                "Enter 3 for WhichToSlay Church");
//        while (true) {
            Scanner locationInput = new Scanner(System.in);
            int response = locationInput.nextInt();
//    System.out.println(response);

            switch (response) {
                case 1:
                    System.out.println("You are now inside WichWich Sandwich Shoppe");
                    break;
                case 2:
                    System.out.println("You are now inside Shoe Lady's Shoppe.\n" +
                            "Make a deal with the lady to obtain your horse for the escape.\n" +
                            "You must collect 3 pieces of leather to trade for the horse.");
                    insideShoppe();
                    break;
                case 3:
                    System.out.println("You are now inside WhichToSlay Church. You have also been slayed. ");
                    System.out.println("GAME OVER");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You must be great at many things. Following simple directions is not one of them");
            }
//        }
    }

    public static void insideShoppe() {
        //System.out.println("Grab Items for your bag. \n ");
        // "You can only have 5 items in your bag at any given time.

        System.out.println("Grab an item. You can only hold a total of 5 items from all locations at one time \n" +
                "Enter 0 for " + marketList.get(0) + "\n" +
                "Enter 1 for " + marketList.get(1) + "\n" +
                "Enter 2 for " + marketList.get(2) + "\n" +
                "Enter 3 for " + marketList.get(3) + "\n" +
                "Enter 4 for " + marketList.get(4));

        //prompt to grab another item until 5 items in bag
//        while (true) {
            Scanner itemInput = new Scanner(System.in);
            int response2 = itemInput.nextInt();
            System.out.println(response2);
//can call from list using index later can code this
            if (response2 == 0) {
                System.out.println("you now have " + marketList.get(0) + " in your bag");
            } else if (response2 == 1) {
                System.out.println("you now have " + marketList.get(1) + " in your bag");
//                break;
            } else if (response2 == 2) {
                System.out.println("you now have " + marketList.get(2) + " in your bag");
//                break;
            } else if (response2 == 3) {
                System.out.println("you now have " + marketList.get(3) + " in your bag");
//                break;
            } else if (response2 == 4) {
                System.out.println("you now have " + marketList.get(4) + " in your bag");
//                break;
            } else{}
//                break;
//        }
    }

    public static void thirdPrompt() {
        System.out.println("Which area would you like to explore next? \n " +
                "Enter 1 for WichWich SandWich \n" +
                "Enter 2 for Shoe Lady's Shoppe \n" +
                "Enter 3 for WhichToSlay Church \n" +
                "Enter 4 for Pier");
//        while (true) {
            Scanner locationInput2 = new Scanner(System.in);
            int response3 = locationInput2.nextInt();
//    System.out.println(response);

            switch (response3) {
                case 1:
                    System.out.println("You are now inside WichWich Sandwich Shoppe");
                    break;
                case 2:
                    System.out.println("You are now inside Shoe Lady's Shoppe.\n" +
                            "'Why are you come to my Shoppe once again. Have you my leather?." +
                            "okie dokie. Here ye horse! '");
                    break;
                case 3:
                    System.out.println("You are now inside WhichToSlay Church. You have also been slayed.");
                    break;
                case 4:
                    System.out.println("You are now in the Pier");
                    break;
                default:
                    System.out.println("BRUHHHHH");
            }
            System.out.println("You now have " + marketList + " in your bag! ");
//        }
    }
//
// worry about limiting to five items later
    //delete previously grabbed items
    //add only what user grabbed
//
//inventory is what the user has it in its bag
// show what user has in bag
//      for when user returns from the pier


    public static void fourthPrompt() {

            System.out.println("Which area would you like to explore next? \n " +
                    "Enter 1 for WichWich SandWich \n" +
                    "Enter 2 for Shoe Lady's Shoppe \n" +
                    "Enter 3 for WhichToSlay Church \n" +
                    "Enter 4 for Pier");
//        while (true) {
            Scanner locationInput2 = new Scanner(System.in);
            int response3 = locationInput2.nextInt();
//    System.out.println(response);

            switch (response3) {
                case 1:
                    System.out.println("You are now inside WichWich Sandwich Shoppe");
                    break;
                case 2:
                    System.out.println("You are now inside Shoe Lady's Shoppe.\n" +
                            "You will give pieces of leather to the lady and receive your horse");
                    break;
                case 3:
                    System.out.println("You are now inside WhichToSlay Church. You have also been slayed.");
                    break;
                case 4:
                    System.out.println("You are now in the Pier");
                    break;
                default:
                    System.out.println("BRUHHHHH");
            }
            System.out.println("You now have " + marketList + " in your bag! ");
//        }
             }
}











