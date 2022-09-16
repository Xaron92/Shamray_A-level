package homework2.java;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Введите три числа");
        System.out.println("Первое");
        double x = sc4.nextInt();
        System.out.println("Второе");
        double y = sc4.nextInt();
        System.out.println("Третье");
        double z = sc4.nextInt();
        x = x < 0?-x:(x);
        y = y < 0?-y:y;
        z = z < 0?-z:z;
        System.out.println(x <= (y) ? x : (y) <= (z) ? (y) : (z));
    }

}

