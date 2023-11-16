package array;

import java.util.Arrays;
import java.util.Random;

public class QuizArray {
    public static void main(String[] args) {
        // 1. Buat array integer dengan nama myNumbers yang dapat menampung 10 elemen.
        int[] myNumbers = new int[10];

        int jumlahGanjil = 0;
        int jumlahGenap = 0;

        Random random = new Random();
        // myArray3[0] = 10;
        // myArray3[1] = 20;
        // myArray3[2] = 30;
        // myArray3[3] = 40;
        // myArray3[4] = 50;
        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = random.nextInt(100) + 1;
            // myArray3[0] = 10;
            if (myNumbers[i] % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }
        }

        System.out.println(Arrays.toString(myNumbers));
        System.out.println("bilangan genap");
        System.out.println(jumlahGenap);
        System.out.println("bilangan ganjil");
        System.out.println(jumlahGanjil);

        int[] ganjil = new int[jumlahGanjil];
        int[] genap = new int[jumlahGenap];
        int indexGanjil = 0;
        int indexGenap = 0;

        for (int i = 0; i < myNumbers.length; i++) {
            if (myNumbers[i] % 2 == 0) {
                genap[indexGenap] = myNumbers[i];
                indexGenap++;
            } else {
                ganjil[indexGanjil] = myNumbers[i];
                indexGanjil++;
            }
        }

        System.out.println("Nilai Ganjil: " + Arrays.toString(ganjil));
        System.out.println("Jumlah bilangan Ganjil: " + jumlahGanjil);
        System.out.println("Nilai Genap: " + Arrays.toString(genap));
        System.out.println("Jumlah bilangan Genap: " + jumlahGenap);

        // System.arraycopy(genap, 0, a, 0, genap2);

    }
}
