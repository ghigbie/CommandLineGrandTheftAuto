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

    public void payUp(Bum bum, Player player) {

        Random random = new Random();
        int number = random.nextInt(2);

        switch (number){
            case 0:
                bum.money += 2;
                System.out.println("Ain't got nuttin' for money");
                System.out.println("You slap his sorry ass again and get more money.");

                player.Money += bum.money;
                bum.money = 0;
                break;


            case 1:

                player.Money += bum.money;
                bum.money = 0;
                break;

            default:
                player.Money += bum.money;
                bum.money = 0;

        }
        Main.declareResult();

    }
}
