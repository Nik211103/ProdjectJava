package TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        System.out.println("Привет! Введите имя первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String player2 = scanner.nextLine();
        scanner.close();

        System.out.println("Игрок " + player1 + " vs " + player2);

        Board gameBoard = new Board(board);
    }
}