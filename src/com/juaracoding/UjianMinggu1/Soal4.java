package com.juaracoding.UjianMinggu1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = 10;
        int b = 10;
        a = scan.nextInt();
        b = scan.nextInt();
        if(a%2==0 && b%2==1){
            System.out.println("2 x 3 = 6");
            System.out.println("2 x 6 = 12");
        }else {
            System.out.println("3 x 3 = 9");
            System.out.println("3 x 6 = 18");
            System.out.println("3 x 9 = 27");
        }
    }
}
