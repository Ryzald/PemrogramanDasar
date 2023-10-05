package hackerank;

import java.util.Scanner;

public class Hackerank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        int pesanan;
        int totalHarga = 0; // Inisialisasi totalHarga ke 0

        do {
            System.out.print("Masukkan angka menu yang ingin anda pesan: ");
            pesanan = sc.nextInt(); // Baca masukan pengguna
            sc.nextLine(); // Baca newline yang ditinggalkan oleh sc.nextInt()

            switch (pesanan) {
                case 1:
                    totalHarga += 20000;
                    break;
                case 2:
                    totalHarga += 15000;
                    break;
                case 3:
                    totalHarga += 18000;
                    break;
                case 4:
                    totalHarga += 17000;
                    break;
                case 5:
                    totalHarga += 25000;
                    break;
                default:
                    System.out.println("Menu nomer " + pesanan + " tidak ada");
                    break;
            }

            System.out.print("Apakah anda ingin memesan lagi (ya/tidak): ");
            pesan = sc.nextLine();

        } while (pesan.toLowerCase().contains("ya"));

        System.out.println("Total harga makanan anda adalah Rp " + (int) (totalHarga * 1.1) + ",-");

    }
}
