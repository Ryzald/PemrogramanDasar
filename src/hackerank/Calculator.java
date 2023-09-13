package hackerank;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input1 = sc.nextDouble();
        double input2 = sc.nextDouble();
        double tambah = input1 + input2;
        double kurang = input1 - input2;
        double bagi = input1 / input2;
        double kali = input1 * input2;

        System.out.printf("%-8s:%+10.2f\n", "TAMBAH", tambah);
        System.out.printf("%-8s:%+10.2f\n", "KURANG", kurang);
        System.out.printf("%-8s:%+10.2f\n", "BAGI", bagi);
        System.out.printf("%-8s:%+10.2f\n", "KALI", kali);
        sc.close();
    }
}
