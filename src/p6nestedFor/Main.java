package p6nestedFor;

public class Main {
    public static void main(String[] args) {

        int tinggi = 5;
        // kotak
        for (int i = 0; i < tinggi; i++) {
            System.out.println("loop ke-" + (i + 1));
            for (int j = 0; j < tinggi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // segitiga
        // loop 1 *
        // loop 2 * *
        // loop 3 * * *
        // loop 4 * * * *
        // loop 5 * * * * *

        for (int j = 0; j < tinggi; j++) {
            // System.out.println("looping ke-" + (j + 1));
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        // segitiga
        // loop 1 * * * * *
        // loop 2 * * * *
        // loop 3 * * *
        // loop 4 * *
        // loop 5 *

        for (int i = 0; i < tinggi; i++) {
            System.out.print("looping ke-" + (i + 1));
            for (int j = i; j < tinggi; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
