import javax.swing.*;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[] board = new char[9];


        char turn = 'o';
        int play;
        char winner = ' ';



        for (int i = 0; i < 9; i++){
            board[i] =' ';
        }

        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-*-*-");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-*-*-");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);



        for (int round = 0; round < 9; round++) {

            System.out.println("Where do you want to play? 1-9, " + turn + " turn");

            Scanner scan = new Scanner(System.in);
            play = Integer.parseInt(scan.nextLine());
            play = play - 1;


            if (board[play] == ' ') {

                board[play] = turn;


                System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
                System.out.println("-*-*-");
                System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
                System.out.println("-*-*-");
                System.out.println(board[6] + "|" + board[7] + "|" + board[8]);


                if (turn == 'o') {
                    turn = 'x';
                } else {
                    turn = 'o';
                }


                if (board[0] == board[1] && board[1] == board[2] && board[0] != ' ') {
                    System.out.println(board[0] + " Wins");
                    winner = turn;
                    round = 9;
                } else if (board[0] == board[3] && board[3] == board[6] && board[0] != ' ') {
                    System.out.println(board[0] + " Wins");
                    winner = turn;
                    round = 9;
                } else if (board[0] == board[4] && board[4] == board[8] && board[0] != ' ') {
                    System.out.println(board[0] + " Wins");
                    winner = turn;
                    round = 9;
                } else if (board[1] == board[4] && board[4] == board[7] && board[1] != ' ') {
                    System.out.println(board[0] + " Wins");
                    winner = turn;
                    round = 9;
                } else if (board[2] == board[5] && board[5] == board[8] && board[2] != ' ') {
                    System.out.println(board[0] + " Wins");
                    winner = turn;
                    round = 9;
                } else if (board[3] == board[4] && board[4] == board[5] && board[3] != ' ') {
                    System.out.println(board[0] + " Wins");
                    winner = turn;
                    round = 9;
                } else if (board[2] == board[4] && board[4] == board[6] && board[2] != ' ') {
                    System.out.println(board[0] + " Wins");
                    winner = turn;
                    round = 9;
                } else if (board[6] == board[7] && board[7] == board[8] && board[6] != ' ') {
                    System.out.println(board[0] + " Wins");
                    winner = turn;
                    round = 9;
                }
            } else {
                System.out.println("There's already someone using that space \n Try again");

            }
        }
        if (winner == ' ') {
            System.out.println("It's a tie!");
        }
    }
}












