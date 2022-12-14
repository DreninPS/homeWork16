package com.hillel;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Player {
    public Player(String name, int gameCount) {
        this.name = name;
        this.gameCount = gameCount;
        gamesLeft = gameCount;
    }
    private boolean quit;
    private int winCount;
    private int gameCount;
    private int gamesLeft;
    private int gamedGames;
    private int hand;
    private String name;

    public void decrementGamesLeft(){
        gamesLeft -= 1;
    }
    public void incrementWinCount(){
        winCount+=1;
    }
    public void incrementGamedGames(){
        gamedGames+=1;
    }
}
