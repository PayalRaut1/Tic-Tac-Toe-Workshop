package com.bridgelabz;

public class TicTacToe1
{
    public static void main(String[] args)
           {
       // System.out.println("Welcome To Tic Tac Toe Workshop");

        char[] gameboard = createTTTBoard();
            }

            public static char[] createTTTBoard()
            {
                char[] board = new char[10];
                for(int index = 0; index < board.length; index++)
                {
                    board[index] = ' ';
                }
                return  board;
            }
        }


