package com.hillel;
import java.util.Random;



public class Computer {

    public String getName() {return name;}
    public int getHand() {
        this.hand = getRandomNumber();
        return hand;
    }
    private String name = "Computer";
    private int hand;


    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

}
