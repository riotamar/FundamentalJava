package com.juaracoding.UjianMinggu1;

public class TanggaGenapDanPlatNoGenap {
    public static void main(String[] args) {

        System.out.println("Menampilkan Tanggal Genap dan Plat Genap");
        int i;
        int tanggal = 31;
        //menampilkan tanggal genap
        System.out.println("tanggal Genap");
        for ( i=tanggal;i>0;i--) {
            if (i % 2 == 0) {
                System.out.print(i+ " " );
            }
        }

        System.out.println();
        System.out.println("------------------");

        //menampilkan plat nomor genap
        int j;
        int plat = 9;
        System.out.println("plat genap");
        for ( j=plat;j>0;j--) {
            if (j % 2 == 0) {
                System.out.print(j+ " " );
            }
        }

        System.out.println();
        System.out.println("------------------");

        System.out.println("Menampilkan Tanggal Ganjil dan Plat Ganjil");

        int a;
        //menampilkan tanggal ganjil
        System.out.println("tanggal Ganjil");
        for ( a=tanggal;a>0;a--) {
            if (a % 2 == 1) {
                System.out.print(a+ " " );
            }
        }

        System.out.println();
        System.out.println("------------------");

        //menampilkan plat nomor ganjil
        int b;
        System.out.println("Plat ganjil");
        for ( b=plat;b>0;b--) {
            if (b % 2 == 1) {
                System.out.print(b+ " " );
            }
        }

        System.out.println();
        System.out.println("------------------");

        System.out.println("Menampilkan Tanggal Genap dan Plat Ganjil");

        int c;
        //menampilkan tanggal genap
        System.out.println("tanggal Genap");
        for ( c=tanggal;c>0;c--) {
            if (c % 2 == 0) {
                System.out.print(c+ " " );
            }
        }

        System.out.println();
        System.out.println("------------------");

        //menampilkan plat nomor ganjil
        int d;
        System.out.println("Plat ganjil");
        for ( d=plat;d>0;d--) {
            if (d % 2 == 1) {
                System.out.print(d+ " " );
            }
        }




    }
}
