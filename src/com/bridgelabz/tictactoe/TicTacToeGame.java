package com.bridgelabz.tictactoe;


public class TicTacToeGame {
    static int[][] board = new int[3][3];
    Integer position;

    TicTacToeGame(){
        populate();
    }
    static void populate(){
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = num;
                num++;
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }

}
