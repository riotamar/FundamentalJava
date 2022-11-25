package com.juaracoding.UjianMinggu1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = 100;
        int b = 100;
        int c = 100;
        int d = a & b & c ;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        do{
            if(a%2==0 && b%2==0 && c%2==0){
                System.out.println("Deret aritmatika");
                System.out.println("10 12 14 16 18");
            }else{
                System.out.println("Deret aritmatika");
                System.out.println("80 83 86 89 92 95 98");
            }
        }while (d<=1);
    }
}
