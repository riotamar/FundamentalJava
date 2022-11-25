package com.juaracoding.daytwo;

import java.util.SortedSet;

public class Variable {
    public static void main(String[] args) {
        //Numberic
        int usia = 20; // untuk memasukan nilai / value = angka
        float nilai = 8.7f; // untuk float wajib menggunkaan huruf f belakang nya
        double nilaiProgramming = 8.9; //biasakan untuk penulisan 2kata menggunakan hruf besar pada kata ke 2
        Double angka = 9.9; // perbedaan Double ini sebagai Objek (non primitive)
        System.out.println(usia);
        System.out.println(nilai);
        System.out.println(nilaiProgramming);
        System.out.println(angka);

        // char
        char huruf = 'A'; //char menggunakan petik 1 (')
        System.out.println(huruf);

        char angkaDua = '2';
        char char_angkaDua = (char) angkaDua;
        System.out.println(char_angkaDua);
        System.out.println(angkaDua);

        // Text
        String Alamat = "Kuningan"; // Text menggunakan petik 2 (")
        System.out.println(Alamat);

        // Boolean Bernilai true or false
        Boolean isAddress = true;
        System.out.println(isAddress);

    }
}
