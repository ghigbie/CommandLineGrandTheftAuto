package com.georgehigbie;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by georgehigbie on 11/22/16.
 */
public class John {
    int money;
    int hitPower;
    int health;
    int MoneyRandomizer;
    int HealthRandomizer;

    String response = Main.name + ", what do you want to do? (Please type a number.)";


    public John(int Money, int Health) {

        this.money = Money;
        this.health = Health;
    }

//    public String stop(John john) {
//
//        if (john.health <= 20) {
//            String stopped = "he paid up...they always do";
//            return stopped;
//        } else {
//            john.health -= player.power;
//            System.out.println("hit her again");
//            return stop(john);
//        }
//
//    }


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
