package p5Looping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // FOR
        for (int i = 0; i < args.length; i++) {
            System.out.println("berjalan");
        }

        // while
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        boolean isPrima = true;
        int pembagi = 2;

        while (pembagi < angka) {
            if (angka % pembagi == 0) {
                isPrima = false;
                break;
            }
            pembagi++;
        }

        if (isPrima && angka > 1) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }

        // do while
        int pinBenar = 1234;
        int pin;

        do {
            System.out.print("Masukkan PIN Anda: ");
            pin = input.nextInt();

            if (pin != pinBenar) {
                System.out.println("PIN salah. Coba lagi.");
            }

        } while (pin != pinBenar);

        System.out.println("Selamat! Anda berhasil masuk.");
        input.close();

    }
}
