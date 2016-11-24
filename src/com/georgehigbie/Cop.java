package com.georgehigbie;

/**
 * Created by georgehigbie on 11/22/16.
 */
public class Cop {



    public void bribe(Player player) {
        System.out.println("You bribed the cop and have to pay $50.");
        player.Money-=100;
        System.out.println("You have " + player.Money + " left. Sometimes da pimp'n life is hard.");
        System.out.println("");
    }



}





