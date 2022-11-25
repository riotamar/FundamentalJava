package com.juaracoding.dayfour;

public class ContohPertamaLooping {
    public static void main(String[] args) {
        int i;
        for (i=0;i<10;i++){
            System.out.println(i+" . testing angka ganjil");
            // ingin menghasilkan output 1 3 5 7 9 atau angka ganjil
            //if(i % 2 == 1){
             //   System.out.println(i+ ". angka Ganjil");
            }
        for (i=0; i<10;i++){
            // ingin menghasilkan angka ganjil berentet dalam 1 line menggunakan print bukan println
            if(i % 2 == 1) {
                System.out.print(i+ " ");
            }
        }
            //System.out.println(i+". Kuningan"); //kenapa bernilai 9 karena mulai dari i=1, jika i=0 maka akan keluar 10
    }
}
