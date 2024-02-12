package Extention.Lesson1And2;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1,0,0},
                {1,1,0},
                {0,0,1}};
        try {
            System.out.println("Сумма элементов равна: " + sumElement(array));
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }

    static int sumElement(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length){
                throw new RuntimeException("Массив не квадратный");
            }
            for (int j = 0; j < array[i].length; j++) {
                int item = array[i][j];
                if (item != 0 && item != 1){
                    throw new RuntimeException("элемент под индексом [" + i + ", " + j + "] " +
                            "не равен 1 или 0");
                }
                sum += item;
            }
        }
        return sum;
    }
}
