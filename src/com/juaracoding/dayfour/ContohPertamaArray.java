package com.juaracoding.dayfour;

public class ContohPertamaArray {
    public static void main(String[] args) {
        int nomor[] = {1, 2, 3, 4};
        System.out.println("jumlah nomor = "+nomor.length);
        /*System.out.println(nomor[0]);
        System.out.println(nomor[1]);
        System.out.println(nomor[2]);
        System.out.println(nomor[3]);
        */
        for (int i=0;i<nomor.length;i++){
            System.out.println(nomor[i]);
        }

        System.out.println("-------------------------");

        String kota[] = {"jakarta","bandung","lampung","makasar","surabaya"};
        System.out.println("jumlah kota = "+kota.length);
        /*System.out.println(kota[0]);
        System.out.println(kota[1]);
        System.out.println(kota[2]);
        System.out.println(kota[3]);
        */
        for (int i=0; i< kota.length;i++){
            System.out.println(kota[i]);
        }
        //bisa juga menggunakan deklarasi for each

        System.out.println("-----------for each---------");
        for (String i:kota){
            System.out.println(i);
        }

        System.out.println("-------------------------");

        //cara deklarasi ke 2
        String nama[] = new String[5];
        nama[0] = "Test Satu";
        System.out.println(nama[0]);

    }
}
