package com.georgehigbie;

import java.util.Random;

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


        Random random = new Random();
        int number = random.nextInt(3);



        switch (number){
            case 1:
                stripper.money += 50;
                System.out.println("This stripper won't pay up.");
                System.out.println("You slap her sorry ass again and get more money.");
                System.out.println("She's been holding out on you! But you taught her a lesson.");

                break;


            case 2:

                player.Money += stripper.money;
                stripper.money = 0;

                break;

            default:
                player.Money += stripper.money;
                stripper.money = 0;

        }



        Main.declareResult();

    }

}

