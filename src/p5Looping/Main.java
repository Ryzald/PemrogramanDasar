package p5Looping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int umur = 2;
        umur = umur + 1;
        // sama dengan
        umur++;

        // FOR LOOP
        // WHILE
        // DO WHILE
        Scanner input = new Scanner(System.in);

        // FOR
        // For loop digunakan untuk mengulangi blok kode secara berulang berdasarkan
        // kondisi yang telah ditentukan

        for (int i = 0; i < 5; i++) {
            System.out.println("perulanagan ke-" + i);

        }

        // while
        // While loop mengulangi blok kode selama kondisi yang diberikan benar (true)
        // ! WASPADA LOOP TAK TERHINGGA
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        boolean isgenap = true;
        int pembagi = 2;
        while (isgenap) {

        }

        while (pembagi < angka) {

            pembagi++;
        }

        // do while
        // Do-while loop juga mengulangi blok kode berdasarkan kondisi, tetapi memeriksa
        // kondisi setelah blok kode dijalankan, sehingga setidaknya satu iterasi akan
        // dieksekusi.
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
