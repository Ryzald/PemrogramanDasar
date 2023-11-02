package hackerank.UTP;

import java.io.*;
import java.util.*;

public class trial {
    public static void main(String[] args) {
        float TinggiGedung = 50;
        Scanner input = new Scanner(System.in);
        float sudut_evaluasi = input.nextFloat();
        float KecepatanPeserta = input.nextFloat();

        float JarakDasarGedung = (float) Math.ceil(TinggiGedung * Math.tan(Math.toRadians(sudut_evaluasi)));
        int JarakDasarGedungBulat = (int) JarakDasarGedung;
        System.out.println("Jarak horizontal bola terhadap gedung: " + JarakDasarGedungBulat + " meter");

        float KecepatanPesertaUbah = KecepatanPeserta * 1000 / 3600;
        int KecepatanPesertaUbahBulat = (int) KecepatanPesertaUbah;
        int BerhasilApaTidak = JarakDasarGedungBulat / KecepatanPesertaUbahBulat;
        if (BerhasilApaTidak <= 6) {
            System.out.println("Peserta dapat menangkap bola: true");
        } else {
            System.out.println("Peserta dapat menangkap bola: false");
        }
    }
}
