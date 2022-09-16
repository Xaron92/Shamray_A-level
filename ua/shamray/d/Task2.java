package ua.shamray.d;

public abstract class Task2 {
    public static void main(String[] args) {
        printodd ( 1,  2);
        printodd ( 2,  2);
}

    public static void printodd (int x, int y)  {
        System.out.println(x%2 == 0?y:x);
        if (x%2 == 0) {
            System.out.println(y);}
            else System.out.println(x);

    }
}