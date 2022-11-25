package com.juaracoding.UjianMinggu1;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String nama;
        int nim;
        nama = scan.nextLine();
        nim = scan.nextInt();
        System.out.println("Nama: "+nama.toUpperCase());
        System.out.println("NIM: "+nim);
        System.out.println(String.format("Tahun Masuk: " +nim));

    }
}
