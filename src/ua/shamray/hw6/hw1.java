package ua.shamray.hw6;
import java.util.Scanner;
public class hw1 {
    public static class Phone {
        public String number;
        public String model;
        public String weight;
        String name = "Peter";
        public void receiveCall() {
            System.out.println("Звонит " + name);}
        public void getNumber() {
            System.out.println(number);
        }
        public Phone(String a, String b, String c) {
            number = a;
            model = b;
            weight = c;}
        public Phone(String a, String b) {
            number = a;
            model = b;}
           Phone (){}
        }
        static String getStr() {
            Scanner str = new Scanner(System.in);
        return str.nextLine();}
        public static void main(String[] args) {
            Phone ph1 = new Phone();
            Phone ph2 = new Phone();
            Phone ph3 = new Phone();
            System.out.print("Введите номер 1-го телефона: ");
            ph1.number = getStr();
            System.out.print("Введите его модель: ");
            ph1.model = getStr();
            System.out.print("Вес: ");
            ph1.weight = getStr();
            System.out.print("Введите номер 2-го телефона: ");
            ph2.number = getStr();
            System.out.print("Введите его модель: ");
            ph2.model = getStr();
            System.out.print("Вес: ");
            ph2.weight = getStr();
            System.out.print("Введите номер 3-го телефона: ");
            ph3.number = getStr();
            System.out.print("Введите его модель: ");
            ph3.model = getStr();
            System.out.print("Вес: ");
            ph3.weight = getStr();
            System.out.println(ph1.number + " " + ph1.model + " " + ph1.weight);
            System.out.println(ph2.number + " " + ph2.model + " " + ph2.weight);
            System.out.println(ph3.number + " " + ph3.model + " " + ph3.weight);
            System.out.println();
            ph1.receiveCall();
            ph1.getNumber();
            System.out.println();
            ph2.receiveCall();
            ph2.getNumber();
            System.out.println();
            ph3.receiveCall();
            ph3.getNumber();
           }
    }

