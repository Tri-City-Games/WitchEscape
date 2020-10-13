package com.market;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArisMarketSquare {
//put market is east of house or direction
    //pier is north of market
    // inventory, text parsing, item management  all use xml

    public static void myMarket() {
        //****from Tom
//house market and pier are scenes****
        //if similar put in ONE superclass****
        //if user enters 1 goto wichwich sandwich shoppe
        //if user enters 2 goto to shoe lady's shoppe
        //if user enters 3 goto puritan church
       System.out.println("You are now in Aris Market Square. What area would you like to explore next? \n " +
                "Enter 1 for WichWich SandWich \n " +
                "Enter 2 for Shoe Lady's Shoppe \n " +
                "Enter 3 for WhichToSlay Church");
while (true) {
    Scanner locationInput = new Scanner(System.in);
    int response = locationInput.nextInt();
//    System.out.println(response);

    switch (response) {
        case 1:
            System.out.println("You are now inside WichWich Sandwich Shoppe");
            break;
        case 2:
            System.out.println("You are now inside Shoe Lady's Shoppe");
            break;
        case 3:
            System.out.println("You are now inside WhichToSlay Church");
            break;
        default:
            System.out.println("BRUHHHHH");
    }
//    if ((response >= 4) || (response <= 0)) {
//        System.out.println("NUMBERS ARE CLEARLY NOT YOUR STRONG SUIT! TRY AGAIN!");
//    } else if (response == 1) {
//        System.out.println("you are now in WichWich SandWich");
//        break;
//    } else if (response == 2) {
//        System.out.println("you are now in Shoe lady's Shoppe");
//        break;
//    } else if (response == 3) {
//        System.out.println("you are now in WhichToSlay Church");
//        break;
//    } else
//        break;
//    //look into changing this into a switch statement. may make it clearer. still need break****
//    // look into labeled break. loop with break in front****
//}
        //{System.out.println("WRONG!");


   // code here if wrong come up restate where wanna go

        // user input-user selects items to put in bag
        ArrayList<String> marketList = new ArrayList<String>(Arrays.asList("Leather", "More Leather", "Barret .50cal", "Horse", "lucky penny"));

//
//        System.out.println("Grab Items for your bag. \n ");
//                // "You can only have 5 items in your bag at any given time.
//
//        System.out.println("Grab upto 5 items: \n" +
//                "Enter 1 for Leather \n" +
//                "Enter 2 for RPG \n" +
//                "Enter 3 for Barret .50cal \n" +
//                "Enter 4 for Horse \n" +
//                "Enter 5 for Lucky Penny1");
//        System.out.println(marketList);
//
//        Scanner itemInput = new Scanner(System.in);
//        int response2 = itemInput.nextInt();
//        System.out.println(response2);
//
//        if (response2 == 1) {System.out.println("you are now in WichWich SandWich");}
//        else if (response2 == 2) {System.out.println("you are now in Shoe lady's Shoppe");}
//        else if (response2 == 3) {System.out.println("you are now in WhichToSlay Church"); }
//        else {System.out.println("WRONG!");}
//        List marketSquareInventory = new ArrayList();


        System.out.println("Grab Items for your bag. \n ");
        // "You can only have 5 items in your bag at any given time.

        System.out.println("Grab an item. You can only hold a total 0f 5 items from all locations at one time \n" +
                "Enter 0 for " + marketList.get(0) + "\n" +
                "Enter 1 for " + marketList.get(1) + "\n" +
                "Enter 2 for " + marketList.get(2) + "\n" +
                "Enter 3 for " + marketList.get(3) + "\n" +
                "Enter 4 for " + marketList.get(4));
//        System.out.println(marketList);

    //prompt  to grab another item
while (true) {
    Scanner itemInput = new Scanner(System.in);
    int response2 = itemInput.nextInt();
    System.out.println(response2);
//can call from list using index later can code this
    if (response2 == 0) {
        System.out.println("you now have" + marketList.get(0) + " in your bag");
    } else if (response2 == 1) {
        System.out.println("you now have" + marketList.get(1) + " in your bag");
        break;
    } else if (response2 == 2) {
        System.out.println("you now have" + marketList.get(2) + " in your bag");
        break;
    } else if (response2 == 3) {
        System.out.println("you now have" + marketList.get(3) + " in your bag");
        break;
    } else if (response2 == 4) {
        System.out.println("you now have" + marketList.get(4) + " in your bag");
        break;
    }else
        break;
}

// worry about limiting to five items later
        //delete previously grabbed items
        //add only what user grabbed
//
//inventory is what the user has it in its bag
// show what user has in bag
                System.out.println("You now have " + marketList + " in your bag! ");

            }


        }}