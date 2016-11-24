package com.georgehigbie;

import java.util.Random;

/**
 * Created by georgehigbie on 11/22/16.
 */
public class John {
    int money;
    int hitPower;
    int health;
    int MoneyRandomizer;
    int HealthRandomizer;


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


        player.Money += john.money;
        john.money = 0;

        Main.declareResult();
    }
}
