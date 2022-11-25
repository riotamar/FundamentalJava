package com.juaracoding.dayseven.bidang;

public class Kotak extends RuangBidang {

    int sisi = 1;

    public Kotak() {

    }

    public Kotak(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void draw() {
        for(int x = 0 ; x < sisi; x ++) {
            for (int y = 0 ; y < sisi ;y ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}