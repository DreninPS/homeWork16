package com.hillel;

public class GamePlay {

    public String startGame(Player player, Computer computer){
        int computerHand = computer.getHand();
        if (player.getHand()==computerHand){
            return "No Winner!";
        }else if(player.getHand()==1&&computerHand==2){
            player.incrementWinCount();
            return "Player Win!";
        }else if(player.getHand()==1&&computerHand==3) {
            computer.incrementWinCount();
            return "Computer Win!";
        } else if (player.getHand()==2&&computerHand==1) {
            computer.incrementWinCount();
            return "Computer Win!";
        } else if (player.getHand()==2&&computerHand==3) {
            player.incrementWinCount();
            return "Player Win!";
        } else if (player.getHand()==3&&computerHand==1) {
            player.incrementWinCount();
            return "Player Win!";
        } else if (player.getHand()==3&&computerHand==2) {
            computer.incrementWinCount();
            return "Computer Win!";
        }
    return "";
    }

}
