package homework2.java;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число");
        int x1 = sc1.nextInt();
        if ((x1 % 2) == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}

