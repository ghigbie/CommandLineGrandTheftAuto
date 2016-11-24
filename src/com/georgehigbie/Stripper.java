package com.georgehigbie;

/**
 * Created by georgehigbie on 11/24/16.
 */
public class Stripper {

    int health;
    int money;

    public Stripper (int Health,int Money){

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


    public void payUp(Stripper stripper, Player player){


        player.Money += stripper.money;
        stripper.money = 0;

        Main.declareResult();

    }

}

