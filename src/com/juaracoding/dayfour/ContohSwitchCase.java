package com.juaracoding.dayfour;

public class ContohSwitchCase {
    public static void main(String[] args) {
        int pilihMenu = 0;
        switch (pilihMenu){
            case 1:
                System.out.println("tampil data");
                break;
            case 2:
                System.out.println("tambah data");
            case 3:
                System.out.println("edit/update data");
                break;
            case 4:
                System.out.println("delete data");
                break;
            default:
                System.out.println("menu tidak ada");
                break;
        }
    }
}
