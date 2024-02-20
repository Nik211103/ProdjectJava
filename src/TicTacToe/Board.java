package TicTacToe;

public class Board {
    public Board(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | "); // Разделитель между клетками
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------"); // Горизонтальная линия
            }
        }

    }
}