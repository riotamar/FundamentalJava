package com.juaracoding.UjianMinggu1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a;
        a = scan.nextInt();
        if (a%2 == 0){
            System.out.println("Not Weird");
        }else {
            System.out.println("Weird");
        }
    }
}
