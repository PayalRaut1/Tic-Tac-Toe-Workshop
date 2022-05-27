package com.bridgelabz;

import java.util*;
import java.util.Scanner;

public class TicTacToe1 {
    public static void main(String[] args)
    {
        // System.out.println("Welcome To Tic Tac Toe Workshop");

        char[] board = createTTTBoard();
        char UserLetter = chooseLetter();
        char ComputerLetter;
        if (UserLetter == 'X') {
            ComputerLetter = 'O';
        } else {
            ComputerLetter = 'X';

        }
        System.out.println("Computer Letter is: " + ComputerLetter + " User Letter is : " + UserLetter);
    }

    public static char chooseLetter();

    {
        char symbol;
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter your symbol");
        symbol = UserInput.next().toUpperCase().charAt(0);
        return symbol;
    }

    public static char[] createTTTBoard() {
        char[] board = new char[10];
        for (int index = 0; index < board.length; index++)
        {
            board[index] = ' ';
        }
        return board;
    }
}


