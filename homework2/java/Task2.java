package homework2.java;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Посчитаем площадь треуголника");
        System.out.println("Введите x1 y1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Введите x2 y2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Введите x3 y3");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int square = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) / 2);
        System.out.println("Результат");
        System.out.println(Math.abs(square));
    }
}