package ua.shamray.hw4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = createRandomArray(50);
        System.out.print("" + Arrays.toString(array1));
    }
    public static int[] createRandomArray(int size) {
        int[] array1 = new int[size];
        int i;
        for (i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round((Math.random() * 100 + 1));
            System.out.print((array1[i]) + " ");
        }
        return array1;
    }
    private static boolean myMethod(int j) {
        if (j == 1)
            return false;
        if (j == 0)
            return false;
        for (int i = 1; i <= j; i++) {
            if (j % 2 == 1)
                return true;
            if (j % 3 == 1)
               return true;
        }
        return true;
    }
}

