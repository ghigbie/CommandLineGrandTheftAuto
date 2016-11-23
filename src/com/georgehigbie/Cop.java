package com.georgehigbie;

/**
 * Created by georgehigbie on 11/22/16.
 */
public class Cop {



    public void bribe(Player player)
    {
        System.out.println("you bribed the cop and have to pay $250.");
        player.Money-=250;
        System.out.println("you have " + player.Money + " left");
    }



    }





