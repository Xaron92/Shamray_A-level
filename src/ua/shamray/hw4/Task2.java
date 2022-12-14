package ua.shamray.hw4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = createRandomArray(1000);
        primeNumbers(array);
    }

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void primeNumbers(int[] array) {
        int a = 0;
        for (int j : array)
            if (PrimeNumber(j)) {
                a++;
            }
        System.out.print("\n Количество простых чисел " + a);
    }
        private static boolean PrimeNumber (int n)
        {
            int temp;
            if (n == 1)
                return false;
            if (n == 0)
                return false;
            for (int i = 2; i <= n / 2; i++) {
                temp = n % i;
                if (temp == 0)
                    return false;
            }
            return true;
        }
    }

