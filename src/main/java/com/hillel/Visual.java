package com.hillel;
import java.util.Scanner;


public class Visual {
    private  String q = "" +
              " 1111 "+
            "\n1    1"+
            "\n1    1"+
            "\n 1111 "+
            "\n    11";
    private  String rock = "" +
              "      "+
            "\n 1111 "+
            "\n11  11"+
            "\n1   11"+
            "\n 11111";
    private String scissors = "" +
              "1   1 "+
            "\n 1 1  "+
            "\n  1   "+
            "\n11  11"+
            "\n11  11";
    private String paper = "" +
              "111111"+
            "\n111111"+
            "\n111111"+
            "\n111111"+
            "\n111111";

    private String zero = "" +
            " 1111 "+
            "\n11  11"+
            "\n11  11"+
            "\n11  11"+
            "\n 1111 ";
    private String one = "" +
            "  11  "+
            "\n 111  "+
            "\n1 11  "+
            "\n  11  "+
            "\n111111";
    private String two = "" +
            "11111 "+
            "\n    11"+
            "\n  111 "+
            "\n11    "+
            "\n111111";
    private String three = "" +
            "111111"+
            "\n    11"+
            "\n 1111 "+
            "\n    11"+
            "\n111111";
    private String four = "" +
            "11  11"+
            "\n11  11"+
            "\n111111"+
            "\n    11"+
            "\n    11";
    private String five = "" +
            "111111"+
            "\n11    "+
            "\n11111 "+
            "\n    11"+
            "\n11111 ";
    private String six = "" +
            " 11111"+
            "\n11    "+
            "\n11111 "+
            "\n11  11"+
            "\n 1111 ";
    private String seven = "" +
            "111111"+
            "\n   11 "+
            "\n  11  "+
            "\n 11   "+
            "\n11    ";
    private String eight = "" +
            " 1111 "+
            "\n11  11"+
            "\n 1111 "+
            "\n11  11"+
            "\n 1111 ";
    private String nine = "" +
            " 11111"+
            "\n11  11"+
            "\n 11111"+
            "\n    11"+
            "\n111111";

    private Scanner[] massOfScannerNumbers;
    private void initScaner() {
        massOfScannerNumbers = new Scanner[]{new Scanner(zero), new Scanner(one), new Scanner(two), new Scanner(three)
                , new Scanner(four), new Scanner(five), new Scanner(six), new Scanner(seven), new Scanner(eight), new Scanner(nine),
                new Scanner(q), new Scanner(rock), new Scanner(scissors), new Scanner(paper)};
    }
    private boolean[][][] massOfNumberMatrixOfBool = new boolean[14][5][6];

    public void print(int[] numberInMassOfBytes, char printChar, String space, String distance){
        initScaner();
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
                if (i == 2||i == 3||i == 5||i==7){
                    System.out.print(distance + space);
                } else if(i<2) {
                    System.out.print(distance);
                }else System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < massOfScannerNumbers.length; i++) {
            massOfScannerNumbers[i].close();
        }
    }

    private boolean[][] getMatrixOfBool(int i){
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
    private boolean[][][] getMassOfNumberMatrixOfBool(){
        for (int i = 0; i < 14; i++) {
            massOfNumberMatrixOfBool[i] = getMatrixOfBool(i);
        }
        return massOfNumberMatrixOfBool;
    }

}
