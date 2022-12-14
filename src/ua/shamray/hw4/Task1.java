package ua.shamray.hw4;

import java.math.BigDecimal;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = createRandomArray(400);
        FindAverageInt(array1);
        FindAverageGeomtric(array1);
    }

    public static int[] createRandomArray(int size) {
        int[] array1 = new int[size];
        int i;
        for (i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round((Math.random() * 10 + 1));
            System.out.print((array1[i]) + " ");
        }
        return array1;
    }

    public static void FindAverageInt(int[] array1) {
        int average1;
        int sum = 0;
        if (array1.length > 0) {
            for (int i : array1) sum += array1[i];
            average1 = sum / array1.length;
            System.out.println("\nСреднее арифметическое\n" + average1);
        }
    }

    public static void FindAverageGeomtric(int[] array1) {

        int k = 1;
        if (array1.length > 0) {
            for (int j : array1) k = k * array1[j];
            BigDecimal x = new BigDecimal(k);
            int exponent = 1/400;
        System.out.println("Среднее геометрическое \n" +x.pow(exponent));
        }
    }
}