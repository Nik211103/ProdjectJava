package Seminary;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/*Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24. */
public class Main2_1 {
    public static void main(String[] args) {
        int min = 0;
        int max = 2;
        int len = 10;
        Integer[] arr = getArr(min, max, len);
        System.out.println(Arrays.toString(arr));
        System.out.println(uniqPer(arr));
    }
    static Integer[] getArr(int min, int max, int len){
        Integer[] res = new Integer[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            res[i] = random.nextInt(min, max + 1);
        }
        return res;

    }
    static double uniqPer(Integer[] arr){
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        return hashSet.size()*100.00/ arr.length;
    }
}
