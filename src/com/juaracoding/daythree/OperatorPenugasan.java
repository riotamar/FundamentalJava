package com.juaracoding.daythree;

public class OperatorPenugasan {
    public static void main(String[] args) {
        int a, b, c, d, e, bo, bm;
        a = 5;
        b = 3;
        b = b + 1;
        c = a + b;
        d = c + c + a;
        e = (c + d) * a;
        bo = b += 1;
        bm = b %= 2;
        System.out.println("nilai a = " + a);
        System.out.println("nilai b = " + b);
        System.out.println("nilai c = " + c);
        System.out.println("nilai d = " + d);
        System.out.println("nilai e = " + e);
        System.out.println("nilai b operator gab = " + bo);
        System.out.println("nilai b operator gab modulus = " + bm);
    }
}
