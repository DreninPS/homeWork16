package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainStartGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String space = "          ";
        System.out.print("Welcome! Enter your name please! ");
        String name = reader.readLine();
        System.out.print(name + ", how much times you want to play? ");
        Player player = new Player(name , enterNumber());
        for (int i=0; i<25; i++)
            System.out.println("\n\n\n\n");

        Visual.print(new byte[]{1, 2, 3, 0},'@', space);
        System.out.println("\n"+"Rock 1   Scissors 2   Paper 3 "+space+"   Quit 0"
                        +space+"   "+name+"    Computer");


        Computer computer = new Computer();
        GamePlay gamePlay = new GamePlay();




    }
    static int enterNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int intNumber = 0;
            try {
                intNumber = Integer.parseInt(String.valueOf(number));
            }catch (Exception e){
                System.out.println("Enter only numbers\n" + e );
                enterNumber();
            }
        return intNumber;
    }
}