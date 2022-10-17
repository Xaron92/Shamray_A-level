package ua.shamray.hw4;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = createRandomArray(10);
        PrimeNumber(array1);

    }

    public static int[] createRandomArray(int size) {
        int[] array1 = new int[size];
        int i;
        for (i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round((Math.random() * 9));
        }
        return array1;
    }

    public static void PrimeNumber(int[] array1) {
        int a = 0;
        for (int i = 0 ; i < array1.length; i++) {
            if (array1[i] % i != 0) {
                a++;
            }
            System.out.println(a);
        }
    }
}