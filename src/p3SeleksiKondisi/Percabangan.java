package p3SeleksiKondisi;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {

        // '>' lebih besar
        // '<' lebih kecil
        // '>=' lebih besar sama dengan
        // '<=' lebih kecil sama dengan
        // '==' sama dengan
        // '!' tidak

        // || atau(salah satu benar lanjut)
        // && dan ( keduanya harus benar)

        int angka = 11;

        // if else
        if (angka != 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // nested if else (bersarang)

        if (angka < 10) {
            if (angka > 3) {
                System.out.println("angka lebih kecil dari 10 dan lebih besar dari 3");
            } else {
                System.out.println("angka lebih kecil dari 10 tetapi tidak lebih besar dari 3 ");
            }
        } else {
            System.out.println("angka tidak lebih kecil dari 10");
        }

        // keterbacaan
        int angka2 = 3;

        if (angka2 != 6) {
            int umur = 21; // keterbacaan
            System.out.println(true);
            System.out.println(umur);
        } else {
            System.out.println(false);
        }

        // System.out.println(umur); " tidak bisa karena pembuatan int umur didalam
        // ifelse if"
        int umur = 60;
        if (umur <= 17) {
            System.out.println("anda dibawah umur");
        } else if (umur > 17 && umur < 40) {
            System.out.println("anda cukup umur");
        } else if (umur > 40 && umur < 100) {
            System.out.println("anda terlalu tua");
        } else {
            System.out.println("umur anda melebihi batas");
        }

        // ternary "variable = (condition) ? expressionTrue : expressionFalse;"
        int number = 10;
        String hasil = (number % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);

        // switch case (case sensitive)
        // percabangan kode program dimana kita membandingkan isi sebuah variabel dengan
        // beberapa nilai
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka antara 1 hingga 3:");
        int nomor = input.nextInt();
        // SC1
        switch (nomor) {
            case 1:
                System.out.println("Anda memasukkan angka 1.");
                break;
            case 2:
                System.out.println("Anda memasukkan angka 2.");
                break;
            case 3:
                System.out.println("Anda memasukkan angka 3.");
                break;
            default:
                System.out.println("Angka yang Anda masukkan tidak valid.");
                break;
        }
        // SC2
        String hari = input.nextLine();

        switch (hari) {
            case "senin":
                System.out.println("Ini adalah hari kerja.");
                break;
            case "selasa":
            case "rabu":
            case "kamis":
            case "jumat":
                System.out.println("Ini adalah hari kerja juga ternyata.");
                break;
            case "sabtu":
            case "minggu":
                System.out.println("Ini adalah hari libur.");
                break;
            default:
                System.out.println("Input tidak valid.");
                break;
        }

    }
}