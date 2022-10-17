package ua.shamray.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        System.out.println("Вы ввели" + " " + Method(input) + " " + "слов");
    }
    public static int Method(String input) {
        int count = 0;
        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }
}





