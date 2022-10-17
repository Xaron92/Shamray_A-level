package ua.shamray.hw2;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Посчитаем площадь треуголника, введите координаты");
        Scanner sc = new Scanner(System.in);
        System.out.println(SquareOfTriangle (sc));
    }
    public static int SquareOfTriangle(Scanner sc)  {
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int y3 = sc.nextInt();
        return Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) / 2);
    }
    }











