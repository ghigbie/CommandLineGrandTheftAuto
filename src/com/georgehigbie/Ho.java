package com.georgehigbie;

/**
 * Created by georgehigbie on 11/22/16.
 */
public class Ho {

    int health;
    int money;

    public Ho (int Health,int Money){

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


    public void payUp(Ho ho, Player player){


            player.Money += ho.money;
            ho.money = 0;
            System.out.println("dolla dolla bills y'aw, you now have " + player.Money);

        }

    }





