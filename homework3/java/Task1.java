package homework3.java;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String phrase = sc.nextLine();
        System.out.println("результат" + " " + isPalindrome(phrase));

    }

    public static boolean isPalindrome (String text) {
        return text.replaceAll("\\s", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", ""))
                        .reverse().toString());
    }
}



