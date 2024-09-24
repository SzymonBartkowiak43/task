package org.example.skarbDoZnalezienia;

public class Main {
    public static void main(String[] args) {
        int size = 15;
        char [][] mapa = new char[size][size];
        for(int i = 0; i < size; i++ ) {
            for(int j = 0; j < size; j++ ) {
                mapa[i][j] = 'O';
            }
        }
        mapa[2][2] = 'X';


//        System.out.println("Droga do skarbu: " + Treasure.findTreasure(mapa,0,0,size));
    }
}
