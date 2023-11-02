package hackerank.UTP;

import java.util.Scanner;

public class TinggiGedung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float samping = sc.nextFloat();
        float sudut = sc.nextFloat();
        sc.close();

        double tinggi = Math.ceil(Math.tan(Math.toRadians(sudut)) * samping);
        System.out.println("Tinggi gedung: " + (int) (tinggi));

        double miring = tinggi / Math.sin(Math.toRadians(sudut));
        System.out.println("Jarak kamera dengan Blisk: " + (int) miring);

        System.out.print("Apakah Blisk terdeteksi? ");
        System.out.print(miring <= 1000);

    }
}
