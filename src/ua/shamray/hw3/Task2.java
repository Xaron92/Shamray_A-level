package ua.shamray.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String phrase = sc.nextLine();
        System.out.println("результат" + " " + isPalindrome(phrase));
        RemoveSpaces(phrase);
    }

    public static String RemoveSpaces(String phrase) {
        return (phrase.replaceAll("\\W", ""));
    }

    public static boolean isPalindrome(String phrase) {
        return new StringBuilder(phrase).reverse().toString().equalsIgnoreCase(phrase);
    }
}


