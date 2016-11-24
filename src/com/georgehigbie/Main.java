package com.georgehigbie;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String name;
    public static Player playerPimp;
    public static String person;
    public static void main(String[] args) {

        startGame();
        createPlayer();

    }




    public static void startGame(){
        System.out.println("You are a pimp working the streets of New Orleans.");
    }

    public static void createPlayer() {
        String[] nameChoices = {"Silky", "Slick Back", "Feathers", "Daddy Baby", "Booty Bauss", "Sir Slaps-a-Lot"};

        Random random = new Random();
        int number =  random.nextInt(5);

        switch (number) {

            case 0:
                name = nameChoices[0];
                break;

            case 1:
                name = nameChoices[1];
                break;

            case 2:
                name = nameChoices[2];
                break;

            case 3:
                name = nameChoices[3];
                break;

            case 4:
                name = nameChoices[4];
                break;

            default:
                name = nameChoices[0];
        }


        Player playerPimp = new Player(500, 20, name);
        String nameIntro = "Your name is " + name;
        System.out.println(nameIntro + " ");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.println("The object of the game is the get 1G, that's $1000.00.");
        System.out.println("Press \"1\" to play the game and be the Pimp Master.");
        int begin = scanner.nextInt();

        if(begin == 1){
            startSituations();
        }else{
            System.out.println("Press \"1\" to start");
        }

    }

    public static void startSituations(){

        checkWinLoseStatus();

        Ho ho = new Ho(50, 50);
        Cop cop = new Cop();
        John john = new John(50, 100);
        Stripper stripper = new Stripper(50, 50);

        String hoStart = "One of your hos ";
        String copStart = "A cop ";
        String johnStart = "A john ";
        String stripperStart = "One of your strippers ";

        String refuses = hoStart + "refuses to pay while talking to you on a street corner.";
        String hidesDrugs = hoStart + "is selling drugs on the side and does not give you your cut.";
        String wontWork=  hoStart + "wont get out and work";
        String hiding = hoStart + "is hiding in a corner and wont work";
        String late = hoStart + "is late for work";
        String smoking = hoStart + "is smoking her product";

        String copBribe = copStart + "demands a bribe.";
        String copCollection = copStart + "comes collecting.";
        String copBusts = copStart + "busts one of your hos.";

        String johnRefuses = johnStart + "refuses to pay";
        String johnNotPayAll = johnStart + "refuses to pay the entire bill";
        String johnSaving = johnStart + "refuses";

        String stripNoWork = stripperStart + "does not want to work.";
        String stripHiding = stripperStart + "is hiding from you and refuses to work";
        String stripHidingTips = stripperStart + "is hiding some of her tip money";
        String stripWorking = stripperStart + "is working on the side for extra and does not fork up her share.";

//        String std = hoStart + "has an STD. You have to take her to a clinic.";
//        String

        String response = name + ", what do you want to do? (Please type a number.)";

        String [] hoSituations = {refuses, hidesDrugs, wontWork, hiding, late, smoking};
        String [] copSituations = {copBribe, copBusts, copCollection};
        String [] johnSituations = {johnRefuses, johnNotPayAll, johnSaving};
        String [] stripperSituations = {stripNoWork, stripHiding, stripHidingTips, stripWorking};


        Random random = new Random();
        int number =  random.nextInt(6);
        String[] situations;
        boolean isHo = false;
        boolean isJohn = false;
        boolean isCop = false;
        boolean isStripper = false;

        switch (number) {

            case 0:
                situations = hoSituations;
                isHo = true;
                person = "ho";
                break;

            case 1:
                situations = johnSituations;
                isJohn = true;
                person = "john";
                break;

            case 2:
                situations = copSituations;
                isCop = true;
                person = "cop";
                break;

            case 3:
                situations = stripperSituations;
                isStripper = true;
                person = "stripper";
                break;

            case 4:
                situations = hoSituations;
                isHo = true;
                person = "ho";
                break;

            default:
                situations = hoSituations;
                isHo = true;
                person = "ho";
        }

        Random random1 = new Random();
        int number1 =  random1.nextInt(situations.length-1);
        String situation = situations[number1];


        System.out.println(situation);
        System.out.println(response);

        String promptPlayer = "1) Slap dat " + person + ".   2) Run Away from dat " + person + ".   3) Give dat " + person + " money" + ".   4) Let it Slide." ;
        System.out.println(promptPlayer);



        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch(n){

            case 1:
                if(person.equals("ho")){
                    ho.payUp(ho, playerPimp);
                }

                if(person.equals("cop")){
                    System.out.println("You shouldn't be slappn' dem cops, yo!");
                    gameOverLoser();
                }

                if(person.equals("john")){
                    john.payUp(john, playerPimp);

                }
                if(person.equals("stripper")){
                    stripper.payUp(stripper, playerPimp);
                }
                startSituations();
                break;

            case 2:
                if(person.equals("cop")){
                    startSituations();
                }
                else {gameOverLoser();}
                break;

            case 3:
                cop.bribe(playerPimp);
                startSituations();
                break;

            case 4:
                startSituations();
                break;

        }

    }

    public static void declareResult(){
        Random random = new Random();
        int number = random.nextInt(4);

        switch(number){

            case 1:
                System.out.println("Dolla dolla bills y'aw!");
                break;
            case 2:
                System.out.println("You busted dat "+ Main.person + "'s ass, yo!");
                break;
            case 3:
                System.out.println("Nobody should mess with " + Main.playerPimp.getPimpName() +".");
                break;
            default:
                System.out.println("Dolla dolla bills y'aw!");
        }
        System.out.println("You now have " + playerPimp.Money);

        System.out.println("");

    }

    public static void gameOverLoser(){
        System.out.println("You suck as a Pimp!  Game Over");
        System.out.println("Go get a real job!");
        System.exit(0);

    }

    public static void youWin(){
        System.out.println("You are da Pimp Master! You win!");
        System.out.println("Go buy a nice ring! It will help your slapping hand.");
        System.exit(0);
    }

    public static void checkWinLoseStatus(){

        if(playerPimp.Money >= 1000){
            youWin();
        }

        if(playerPimp.Money <= 0){
            gameOverLoser();
        }

    }


}



