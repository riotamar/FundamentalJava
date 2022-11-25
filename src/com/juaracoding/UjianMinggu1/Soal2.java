package com.juaracoding.UjianMinggu1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String a;
        a = scan.nextLine();
        switch (a){
            case "Weekday":
                System.out.println("Senin Selasa Rabu Kamis Jum'at");
                break;
            case "Weekend":
                System.out.println("Sabtu Minggu");
                break;
            case "111":
                System.out.println("Invalid input");
                break;

        }











        /*Scanner in = new Scanner (System.in);
       String minggu;
        System.out.print("Masukan minggu : ");
        minggu = in.nextLine();
        switch (minggu){
            case 1:
                if(minggu == "Weekday"){
                    System.out.println("Senin Selasa Rabu Kamis Jum'at");
                }
                break;
            case 2:
                if(minggu == "Weekend"){
                    System.out.println("Sabtu Minggu");
                }
                break;
            case 3:
                if (minggu == "111"){
                    System.out.println("Invalid input");
                }
                break;
        }*/
    }
}
