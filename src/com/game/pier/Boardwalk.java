package com.game.pier;

import java.util.Random;

public class Boardwalk {

    //random gossip generated as Sabrina walks around the game
    static void random_gossip() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("You hear people walking around you whisper...");
        Thread.sleep(5000);
        String townspeople_gossip;
        String[] gossip = {"What is that witchy little girl doing out here alone? She better watch her back-there are some angry people in town",
                "I hope she gets what she deserves...devilish witch!",
                "These witches will doom us all if we don't do something about them quick!" };
        Random rand = new Random();
        townspeople_gossip = gossip [rand.nextInt(gossip.length)];

        System.out.println(townspeople_gossip);
    }

    //encounter with sailor group
    static void sailor_group() throws InterruptedException {
        String[] sailor = {"Hey little girl! You should be at home doing laundry-not out here!", "Leather? We don't have leather to give to you!", "Yeah, the only leather we use is on the ship with our belongings."};
        System.out.println(sailor[0]);
        Thread.sleep(5000);
        System.out.println("You ask the Sailors if they have any leather to give you...");
        Thread.sleep(5000);
        System.out.println("One of them angrily answers: ");
        Thread.sleep(5000);
        System.out.println(sailor[1]);
        Thread.sleep(5000);
        System.out.println("You take a step back startled, and then the youngest Sailor comes over and whispers...");
        Thread.sleep(5000);
        System.out.println(sailor[2]);
    }

    //encounter at Ale House
    static void ale_House() throws InterruptedException {
        System.out.println("You approach the Ale House, you hear people talking and laughing and music playing.");
        Thread.sleep(5000);
        System.out.println("There's a group of men outside, they look like old sailors. The waitress approaches them and they start asking her about the Zombies in the area.");
        Thread.sleep(5000);
        System.out.println("The waitress says 'There hasn't been a lot of Zombie sightings out on the pier but it's bound to happen'.");
        Thread.sleep(5000);
        System.out.println("The sailors start telling a story about a Zombie encounter on their ship. 'We didn't have any weapons! We used mops and buckets to protect ourselves and shove them Zombies overboard!'");
        Thread.sleep(5000);
        System.out.println("'Yeah! I even used the top of an ale keg as a shield to protect me from their bites! If I had gotten bit, i'd be a goner!");
        Thread.sleep(5000);
        System.out.println("Suddenly, they all stopped talking and noticed you standing there on the boardwalk, intently listening to their conversation.");
        Thread.sleep(5000);
        System.out.println("The waitress says to you, 'Child, you best be going. It's late and it's not safe to be who you are on this side of town.");
        Thread.sleep(5000);
        System.out.println("You snap out of it, turn and leave. You head toward the pier, still looking for that piece of leather.");
    }

    //Zombie Attack()?
}