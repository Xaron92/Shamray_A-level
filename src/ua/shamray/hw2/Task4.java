package ua.shamray.hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Наименьшее по модулю" + "Введите три числа");
        System.out.println( "наименьшее число по модулю" +"" + MinNumber(sc));
    }
    public static double MinNumber(Scanner sc) {
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = sc.nextInt();
        double x1 = x < 0 ? -x : x;
        double y1 = y < 0 ? -y : y;
        double z1 = z < 0 ? -z : z;
        double min = Math.min((z1), Math.min(x1, y1));
        if (min == x1) {
            min = x;
        } else if (min == y1) {
            min = y;
        } else {
            min = z;
        }
        return min;
    }
}
