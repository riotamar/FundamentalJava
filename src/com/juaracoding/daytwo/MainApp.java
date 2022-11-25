package com.juaracoding.daytwo;

public class MainApp { // ini namanya class

    int x = 5;

    public static void main(String[] args) { // ini namanya method
        int x = 10;
        System.out.println("Hello world!");
        System.out.println(x);
        MainApp mainApp = new MainApp();
        mainApp.namaMethod();

    }

    void namaMethod() { // ini namanya method
        int y = this.x;
        System.out.println(y);
    }

}