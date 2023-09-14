package hackerank;

import java.util.Scanner;

public class Detektif {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nama = sc.nextLine();
        String tkp = sc.nextLine();
        double expense = sc.nextDouble();
        sc.nextLine();
        String kerja = sc.nextLine();

        System.out.println("---------------------------------------");
        System.out.printf("|%-20s:%17s|\n", "Nama Pelaku", nama);
        System.out.printf("%s%17s|", "|Tempat Kejadian     :", tkp);
        System.out.printf("|%-20s:%16.2f%s|\n", "Kerugian", expense, "$");
        System.out.printf("|%-20s:%17s|\n", "Tanggal Kejadian", kerja);
        System.out.println("---------------------------------------");

        // System.out.println("---------------------------------------");
        // System.out.printf("|%-20s:%17s|\n", "Tempat Kejadian", tkp);
        sc.close();

    }
}
