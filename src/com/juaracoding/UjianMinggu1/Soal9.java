package com.juaracoding.UjianMinggu1;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String nama , profesi ;
        int salary;
        nama = scan.nextLine();
        profesi = scan.nextLine();
        salary = scan.nextInt();
        System.out.println("Nama: "+nama.toUpperCase());
        System.out.println("Profesi: "+profesi.toUpperCase());
        System.out.println("Salary: "+salary);
    }
}
