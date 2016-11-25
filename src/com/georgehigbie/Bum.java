package com.georgehigbie;

import java.util.Random;

/**
 * Created by georgehigbie on 11/24/16.
 */
public class Bum {

    int health;
    int money;

    public Bum(int Health, int Money) {

        this.health = Health;
        this.money = Money;
    }

    public void payUp(John john, Player player) {

        Random random = new Random();
        int number = random.nextInt(3);

        switch (number){
            case 1:
                john.money += 50;
                System.out.println("This john won't pay.");
                System.out.println("You slap his sorry ass again and get more money.");

                player.Money += john.money;
                john.money = 0;
                break;


            case 2:

                player.Money += john.money;
                john.money = 0;
                break;

            default:
                player.Money += john.money;
                john.money = 0;

        }
        Main.declareResult();

    }
}
