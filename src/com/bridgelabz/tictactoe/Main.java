package com.bridgelabz.tictactoe;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        System.out.println(Arrays.deepToString(game.getBoard()));
    }
}
