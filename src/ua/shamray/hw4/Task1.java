package ua.shamray.hw4;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = createRandomArray(400);
        FindAverageInt(array1);
        GeometricMean(array1);
    }

    public static int[] createRandomArray(int size) {
        int[] array1 = new int[size];
        int i;
        for (i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round((Math.random() * 10 + 1));
            System.out.println(array1[i]);
        }
        return array1;
    }

    public static void FindAverageInt(int[] array1) {
        int average1 = 0;
        if (array1.length > 0) {
            int sum = 0;
            for (int i : array1) sum += array1[i];
            average1 = sum / array1.length;
            System.out.println("Среднее арифметическое\n" + average1);
        }
    }

    public static void GeometricMean(int[] array1) {
        double average1 = 0;
        if (array1.length > 0) {
            double sum = 0;
            for (double i : array1) sum *= array1[(int) i];
            average1 = Math.pow(sum, 1 / 400);
            System.out.println("Среднее геометрическое\n" + average1);
        }
    }
}