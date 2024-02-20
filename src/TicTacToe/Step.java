package TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step {


    public static void step(String player1, String player2) {
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};

        Scanner scanner = new Scanner(System.in);
        int currentPlayer = 1;
        while (true) {
            Board gameBoard = new Board(board);
            System.out.println("Игрок " + (currentPlayer == 1 ? player1 : player2) + ", введите номер клетки (1-9): ");

            try {
                int pos = scanner.nextInt();

                if (pos < 1 || pos > 9) {
                    System.out.println("Некорректный ввод. Введите число от 1 до 9.");
                    continue;
                }

                int row = (pos - 1) / 3;
                int col = (pos - 1) % 3;

                if (board[row][col] == ' ') {
                    board[row][col] = (currentPlayer == 1 ? 'X' : 'O');
                    currentPlayer = 3 - currentPlayer; // Переключение игрока
                } else {
                    System.out.println("Клетка уже занята. Попробуйте еще раз.");
                }


            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                scanner.next();
            }

                if (Step.checkWin(board, 'X')) {
                gameBoard = new Board(board);
                System.out.println("Победил игрок " + player1 + "!");
                break;
            } else if (Step.checkWin(board, 'O')) {
                gameBoard = new Board(board);
                System.out.println("Победил игрок " + player2 + "!");
                break;
            } else if (isDraw(board)) {
                gameBoard = new Board(board);
                System.out.println("Ничья!");
                break;
            }
        }
        scanner.close();
    }

    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }
}
