package hackerank;

import java.util.Scanner;

public class RestoFilkom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ya atau tidak
        String pesan;

        // menu input
        int pesanan;

        // totalHarga
        int totalHarga = 0;

        do {
            System.out.print("Masukkan angka menu yang ingin anda pesan: ");
            pesanan = sc.nextInt();
            sc.nextLine();

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
