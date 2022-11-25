package com.juaracoding.daythree;

public class ContohKetigaIF {
    public static void main(String[] args) {
        // konversi nilai predikat
        // A = 91 - 100 , B = 85 - 90 , c = 78 - 74

        int nilai = 90;
        if (nilai > 90){
            System.out.println("predikat A");
        }else if(nilai > 84){
            System.out.println("Predikat B");
        }else {
            System.out.println("Predikat C");
        }
    }
}
