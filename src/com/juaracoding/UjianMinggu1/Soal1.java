package com.juaracoding.UjianMinggu1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //System.out.println("Tanggal Ganjil Genap");
        //System.out.print("Tanggal = ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a%2==0 && b%2==0){
            System.out.println("Tanggal genap dan plat nomor genap");
        }else if (a%2==1 && b%2==1) {
            System.out.println("Tanggal ganjil dan plat nomor ganjil");
        } else {
            System.out.println("Tanggal genap dan plat nomor ganjil");
        }
    }
}
