package homework4;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10 + 1));
            System.out.println(array[i]);
        }

        double sum = 0;
        for (int b = 0; b < array.length; b++) {
            sum = sum + array[b];
        }
        System.out.println("Среднеарифетическое чисел массива" + " " + sum / array.length);
        System.out.println("Среднегеометрическое числе массива" + " " + Math.pow(sum, 1.0 / array.length));
    }
}