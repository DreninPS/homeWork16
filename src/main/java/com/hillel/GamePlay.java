package com.hillel;

public class GamePlay {

    public void startGame(Player player, Computer computer){
        int computerHand = computer.getHand();

        if (player.getHand()==computerHand){
            System.out.println("No Winner!");
            System.out.println("Player " + player.getHand() + " Computer "+computerHand);
        }else if(player.getHand()==1&&computerHand==2){
            System.out.println("Player "+ player.getHand() + " Computer "+ computerHand);
            System.out.println("Player Win!");
        }else if(player.getHand()==1&&computerHand==3) {
            System.out.println("Player " + player.getHand() + " Computer " + computerHand);
            System.out.println("Computer Win!");
        } else if (player.getHand()==2&&computerHand==1) {
            System.out.println("Player "+ player.getHand() + " Computer "+ computerHand);
            System.out.println("Computer Win!");
        } else if (player.getHand()==2&&computerHand==3) {
            System.out.println("Player "+ player.getHand() + " Computer "+ computerHand);
            System.out.println("Player Win!");
        } else if (player.getHand()==3&&computerHand==1) {
            System.out.println("Player "+ player.getHand() + " Computer "+ computerHand);
            System.out.println("Player Win!");
        } else if (player.getHand()==3&&computerHand==2) {
            System.out.println("Player "+ player.getHand() + " Computer "+ computerHand);
            System.out.println("Computer Win!");
        }
    }

}
