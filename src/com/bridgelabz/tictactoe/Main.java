package com.bridgelabz.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void playerChance(int turn){
        //will run inside check_winner method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Row: ");
        Integer row = scan.nextInt();
        System.out.println("Enter Column: ");
        Integer col = scan.nextInt();
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        System.out.println(Arrays.deepToString(game.getBoard()));
//        game.playerChoice();
    }
}
