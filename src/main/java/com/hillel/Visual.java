package com.hillel;
import java.util.Scanner;


public class Visual {
    private static String q = "" +
              " 1111 "+
            "\n1    1"+
            "\n1    1"+
            "\n 1111 "+
            "\n    11";
    private static String rock = "" +
              "      "+
            "\n 1111 "+
            "\n11  11"+
            "\n1   11"+
            "\n 11111";
    private static String scissors = "" +
              "1   1 "+
            "\n 1 1  "+
            "\n  1   "+
            "\n11  11"+
            "\n11  11";
    private static String paper = "" +
              "111111"+
            "\n111111"+
            "\n111111"+
            "\n111111"+
            "\n111111";

    private static Scanner[] massOfScannerNumbers = {new Scanner(zero),new Scanner(one),new Scanner(two),new Scanner(three)};
    private static boolean[][][] massOfNumberMatrixOfBool = new boolean[4][5][6];

    public static void print(byte[] numberInMassOfBytes, char printChar, String space){

        boolean[][][] matrix = getMassOfNumberMatrixOfBool();
        boolean[][][] matrixToPrint = new boolean[numberInMassOfBytes.length][5][6];
        for (int i = 0; i < numberInMassOfBytes.length; i++) {
            matrixToPrint[i] = matrix[numberInMassOfBytes[i]];
        }
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < matrixToPrint.length; i++) {
                for (int k = 0; k < 6; k++) {
                    if(matrixToPrint[i][j][k]) System.out.print(printChar);
                    else System.out.print(" ");
                }
                if (i == 2||i==3){
                    System.out.print("     "+space);
                } else System.out.print("     ");
            }
            System.out.println("");
        }
    }

    private static boolean[][] getMatrixOfBool(int i){
        boolean[][] matrixOfBoolean = new boolean[5][6];
        for (int j = 0; j < 5; j++) {
            char[] charsInLine = massOfScannerNumbers[i].nextLine().toCharArray();
            for (int k = 0; k < 6; k++) {
                if(charsInLine[k]!=' ') matrixOfBoolean[j][k] = true;
                else matrixOfBoolean[j][k] = false;
            }
        }
        return matrixOfBoolean;
    }
    private static boolean[][][] getMassOfNumberMatrixOfBool(){
        for (int i = 0; i < 4; i++) {
            massOfNumberMatrixOfBool[i] = getMatrixOfBool(i);
        }
        return massOfNumberMatrixOfBool;
    }

}
