package com.juaracoding.dayfour;

public class ContohNestedFor {
    public static void main(String[] args) {
        // bikin kotak 3 x 3 dengan tanda *
        //***
        //***
        //***
        int i ;
        int j ;
        int sisi = 5;

        //(for outter
        for (i=0;i<3;i++){
            // for dalam (for inner)
            for (j=0;j<sisi;j++){ // looping for untuk int j akan 3 kali ke samping
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("-----------------------------------");//<---- untuk pindah baris membedakan codingan kotak dan codingan segitiga
        //buat segitiga
        //*
        //**
        //***

        //outer
        for (i=0;i<sisi;i++){
            //inner
            for (j=0;j<i;j++){
                System.out.print("*"); //*
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");//<---- untuk pindah baris membedakan codingan kotak dan codingan segitiga
        //buat angka membentuk segitiga
        //1
        //12
        //123

        //outer
        for (i=0;i<sisi;i++){
            //inner
            for (j=0;j<i+1;j++){
                System.out.print((j+1)+ " "); //*
            }
            System.out.println();
        }


        System.out.println("-----------------------------------");//<---- untuk pindah baris membedakan codingan kotak dan codingan segitiga
        //buat segitiga tetapi berupa angka
        //1
        //1 *
        //1 * 3
        //1 * 3 *

        //outter
        for (i=0;i<sisi;i++){
            //inner
            for (j=1;j<i+1;j++){
                if (j % 2 == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");//<---- untuk pindah baris membedakan codingan kotak dan codingan segitiga
        //buat segitiga tetapi berupa angka
        //0
        //0 *
        //0 * 2
        //0 * 2 *

        //outter
        for (i=0;i<sisi;i++){
            //inner
            for (j=0;j<i+1;j++){
                if (j % 2 == 0) {
                    System.out.print(j);
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");//<---- untuk pindah baris membedakan codingan kotak dan codingan segitiga
        //membuat segitiga urutan angka ganjil dari yang terbesar ke yang terkecil
        //9 7 5 3 1
        //9 7 5 3
        //9 7 5
        //9 7

        //outter
        for (i=10;i>0;i--){
            if (i % 2 == 1){
            //inner
                for (j=i;j>0;j--){
                    if(j % 2 == 1) {
                        System.out.print(j+ "");
                    }
                }
            }
            System.out.println();
        }

    }
}
