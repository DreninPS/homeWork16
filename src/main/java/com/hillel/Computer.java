package com.hillel;
import lombok.ToString;

import java.util.Random;


@ToString
public class Computer {
    public Computer() {
        this.hand = getRandomNumber();
    }

    public String getName() {return name;}
    public int getHand() {
        return hand;
    }
    public int getWinCount() {return winCount; }

    private String name = "Computer";
    private int hand;
    private int winCount;

    public void choseHand(){
        this.hand = getRandomNumber();
    }
    public void incrementWinCount(){
        winCount+=1;
    }
    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }


}
