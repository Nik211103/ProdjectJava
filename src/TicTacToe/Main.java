package TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Привет! Введите имя первого игрока: ");
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String player2 = scanner.nextLine();
        System.out.println("Игрок " + player1 + " (X) vs " + player2 + " (O)");

        Step.step(player1, player2);
    }
}