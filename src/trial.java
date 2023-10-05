import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sisiAtas = sc.nextInt();
        int sisiBawah = sc.nextInt();
        int tinggi = sc.nextInt();

        for (int i = 0; i < tinggi; i++) {
            for (int j = i; j < tinggi - 1; j++) {
                System.out.print("  ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }

            for (int j = 0; j < (sisiAtas - 2); j++) {
                System.out.print("* ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }
}
