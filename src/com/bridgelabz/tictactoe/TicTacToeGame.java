package com.bridgelabz.tictactoe;

import java.util.Hashtable;
import java.util.Scanner;

public class TicTacToeGame {
    static char[][] board = new char[3][3];
    Hashtable<String, String> playerSymbol = new Hashtable<>();
    Integer position;

    TicTacToeGame(){
        populate();
    }

    static void populate(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    void drawBoard(char[][] board) {
        System.out.println("Board:");
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public void playerChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Tic Tac Toe!");
        System.out.print("Player 1, what is your name? ");
        String p1 = scan.nextLine();
        System.out.print("Player 2, what is your name? ");
        String p2 = scan.nextLine();

        System.out.println("Player 1 - X or O?");
        String choice = scan.next();
        if(choice.equals("X")){
            playerSymbol.put(p1, "X");
            playerSymbol.put(p2, "O");
        }
        else{
            playerSymbol.put(p1, "O");
            playerSymbol.put(p2, "X");
        }
    }

    void checkWinner(){
        boolean gameEnded = false;
        while (!gameEnded){

        }
    }



}
