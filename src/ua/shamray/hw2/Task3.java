package ua.shamray.hw2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число\n" + "IsEven = true");
        System.out.println(isEven(input));
    }
    public static boolean isEven(Scanner input) {
        int x = input.nextInt();
        return (x % 2 == 0) ;
    }
}
