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
    }

    private String name;
    private int gameCount;
    private int countOfWin;
    private int hand;
}
