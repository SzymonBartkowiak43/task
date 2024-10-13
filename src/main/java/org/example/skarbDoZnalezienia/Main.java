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

       // System.out.println(findTreasure(mapa,0,0,""));
    }

//    public static String findTreasure(char[][] map,int x, int y) {
//        if(map[x][y] == 'X') {
//            return path + "X"+ x + "||" + y + "X" ;
//        }
//
//        return findTreasure(map, x+1, y, path) + findTreasure(map,x,y+1,path);
//
//    }
}
