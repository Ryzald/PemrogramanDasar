package latihanSoal;

import java.util.Scanner;

public class Dua {
    static void rahasia(int n) {
        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " genap");
            } else {
                System.out.println(i + " ganjil");
            }
        }

        return;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        rahasia(read.nextInt());
    }
}
