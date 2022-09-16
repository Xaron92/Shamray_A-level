package ua.shamray.d;

import java.security.PublicKey;

// y = x-2 if x>0
// y = 0 if x=0
// y = |x|, if x<0
public class homework3 {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 2;
        int x3 = -3;
        System.out.println("f(" + x1 + ") = " + calculate(x1));
        System.out.println("f(" + x2 + ") = " + calculate(x2));
        System.out.println("f(" + x3 + ") =" + calculate(x3));

    }

    public static int calculate(int x) {
        int y;
        if (x > 0) return x - 2;
            return Math.abs(x);
    }
}