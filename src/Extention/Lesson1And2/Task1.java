package Extention.Lesson1And2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        decoder(Index(arr, num));
        input.close();

    }

    public static int Index(int[] array, int num) {
        int minLength = 5;
        if (array == null) {
            return -3;
        } else if (array.length < minLength) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -2;
    }

    public static void decoder(int code) {
        switch (code) {
            case -1:
                System.out.println("Длина массива меньше 5");
                break;
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Массив равен 0");
                break;
            default:
                System.out.printf("Индекс элемента равен %d", code);

        }
    }
}