package com.georgehigbie;

/**
 * Created by georgehigbie on 11/24/16.
 */
public class Beeach {


    int health;
    int money;

    public Beeach(int Health, int Money) {

        this.health = Health;
        this.money = Money;
    }

//    public String stop(Ho ho){
//
//        if (ho.health <=20)
//        {
//            String stopped = "the Ho stopped being naughty and went back to work";
//            return stopped;
//        }
//        else{
//            ho.health -= player.power;
//            System.out.println("hit her again");
//            return stop(ho);
//        }
//
//    }


    public void payUp(Beeach beeach, Player player) {


        player.Money += beeach.money;
        beeach.money = 0;

        Main.declareResult();
    }
}

