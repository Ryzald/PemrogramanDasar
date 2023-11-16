// decklarasi array
// cara ganti value
// cara memanggil array
package array;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        // assignment
        // tipedata [] nama = {komponen-komponen}

        System.out.println("assignment Array");

        // index = 0 1 2 3
        // | | | |
        // int[] arrayInteger = { 1, 2, 3, 4 };

        // Deklarasi array tanpa inisialisasi
        int[] myArray1;

        // Deklarasi dan inisialisasi awal array
        int[] myArray = { 1, 2, 3, 4, 5 };

        // Pendeklarasian array dengan kata kunci new
        int[] myArray3 = new int[5];
        // Inisialisasi elemen array setelah pendeklarasian
        System.out.println("ini array 3");
        System.out.println(myArray3[2]);
        System.out.println(Arrays.toString(myArray3));

        myArray3[0] = 10;
        myArray3[1] = 20;
        myArray3[2] = 30;
        myArray3[3] = 40;
        myArray3[4] = 50;

        System.out.println(myArray3[2]);
        System.out.println(Arrays.toString(myArray3));

        int[] arrayInteger = { 1, 2, 3, 4 };

        // cara mengganti value
        arrayInteger[0] = 11;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        System.out.println("cara pemanggilan array");
        // cara memanggil
        // keseluruhan
        System.out.println(Arrays.toString(arrayInteger));
        // index tertentu
        System.out.println(arrayInteger[2]);

        // // Deklarasi
        // // tipedata[] nama = new int[jumlahArray];

        // System.out.println("Deklarasi Array");
        // float[] arrayFloat = new float[5];

        // arrayFloat[3] = 11.5f;

        // System.out.println(arrayFloat[0]);
        // System.out.println(arrayFloat[1]);
        // System.out.println(arrayFloat[2]);
        // System.out.println(arrayFloat[3]);
        // System.out.println(arrayFloat[4]);

        // System.out.println(Arrays.toString(arrayInteger));
        // System.out.println(Arrays.toString(arrayFloat));

    }
}
