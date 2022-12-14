package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainStartGame {
    public static void main(String[] args) throws IOException {
        int[] intMassForVisualPrint = new int[]{11, 12, 13, 10,0,0,0,0,0,0};
        String space = "       ";
        String name = enterName();
        System.out.print(name + ", how much times you want to play? Max 99 games) ");
        GamePlay gamePlay = new GamePlay();
        Computer computer = new Computer();
        Player player = new Player(name , enterNumber());
        Visual visual = new Visual();
        cls();
        prepareMassForVisualPrint(player,computer,intMassForVisualPrint,true);
        visual.print(intMassForVisualPrint,'@', space, "     ");
        underSign(name, space, true);

        for (int i = 0; i < player.getGameCount(); i++) {
        choseYourDestiny(player);
        cls();
        if(player.isQuit()) {
            visual.print(new int[]{(player.getHand()+10), computer.getHand()+10},'@', space, alignment(name.length()));
            System.out.println(name + "    " + computer.getName()+"\n\nGame Over");
            prepareMassForVisualPrint(player,computer,intMassForVisualPrint,false);
            visual.print(intMassForVisualPrint,'@', space, "     ");
            underSign(name, space, false);
            break;}
        String whoIsWing = gamePlay.startGame(player,computer);
            System.out.println("\n");
        visual.print(new int[]{(player.getHand()+10), computer.getHand()+10},'@', space, alignment(name.length()));
            System.out.println(name + "    " + computer.getName()+"\n\n");
        player.decrementGamesLeft();
        prepareMassForVisualPrint(player,computer,intMassForVisualPrint,true);
        visual.print(intMassForVisualPrint,'@', space, "     ");
        underSign(name, space, true);
        computer.choseHand();
            System.out.println("\n");
        }



    }
    static int enterNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        String subStr = number.length() > 2 ? number.substring(0, 2) : number;
        int intNumber = 0;
            try {
                intNumber = Integer.parseInt(String.valueOf(subStr));
            }catch (Exception e){
                System.out.println("Enter only numbers\n" + e );
                enterNumber();
            }
        return intNumber;
    }
    private static String enterName() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Welcome! Enter your name please! Max 20 letter ");
        String nameFromConsole = reader.readLine();
        String name = nameFromConsole.length() > 20 ? nameFromConsole.substring(0, 20) : nameFromConsole;
        return name;
    }
    private static String alignment(String name){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 22-name.length(); i++) {
            s.append(" ");
        }
        return s.toString();
    } private static String alignment(int i){
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < i; j++) {
            s.append(" ");
        }
        return s.toString();
    }
    private static void cls(){
        for (int i=0; i<25; i++)
            System.out.println("\n\n\n\n");
    }
    private static void underSign(String name, String space, boolean continueGame){
        System.out.print("\n"+"Rock 1   Scissors 2   Paper 3 "+space+"   Quit 0"
                +space+"    Player "+name);
        System.out.print(alignment(name)+" Computer"+alignment(14));
        if(continueGame){
            System.out.println("Games Left");
        }else {
            System.out.println("Played Games");
        }
    }
    private static void choseYourDestiny(Player player) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String hand = reader.readLine();
        if(hand.length()>1){
            System.out.println("Please chose 1 or 2 or 3 or 0 to Quit Game");
            choseYourDestiny(player);
        } else {
            try {
                int i = Integer.parseInt(String.valueOf(hand));
                if(i>=0&&i<=3) {
                     player.setHand(i);
                     if(i==0) {
                         player.setQuit(true);
                     }else player.incrementGamedGames();

                    }else {
                    System.out.println("Please chose 1 or 2 or 3 or 0 to Quit Game");
                    choseYourDestiny(player);
                }
            }catch (Exception e){
                System.out.println("Enter only one number\n" + e );
                choseYourDestiny(player);
            }
        }
    }
    private static void prepareMassForVisualPrint(Player player, Computer computer,
                                                  int[] intMassForVisualPrint, boolean continueGame){
        intMassForVisualPrint[4] = (player.getWinCount()-player.getWinCount()%10)/10;
        intMassForVisualPrint[5] = player.getWinCount()%10;
        intMassForVisualPrint[6] = (computer.getWinCount()-computer.getWinCount()%10)/10;
        intMassForVisualPrint[7] = computer.getWinCount()%10;
        if (continueGame){
        intMassForVisualPrint[8] = (player.getGamesLeft() -player.getGamesLeft()%10)/10;
        intMassForVisualPrint[9] = player.getGamesLeft()%10;
        }else {
            intMassForVisualPrint[8] = (player.getGamedGames() -player.getGamedGames()%10)/10;
            intMassForVisualPrint[9] = player.getGamedGames()%10;
        }

    }

}