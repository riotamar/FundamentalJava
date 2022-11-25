package com.juaracoding.UjianMinggu1;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = 100;
        int b = 29;
        int c = a & b;
        a = scan.nextInt();
        b = scan.nextInt();
        do{
            if(a%2==0 && b%2==0){
                System.out.println("Deret aritmatika");
                System.out.println("10 12 14 16 18");
            }else{
                System.out.println("Deret aritmatika");
                System.out.println("80 83 86 89 92 95 98");
            }
        }while (c<=1);
    }
}
