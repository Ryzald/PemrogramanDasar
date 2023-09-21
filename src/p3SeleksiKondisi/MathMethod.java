package p3SeleksiKondisi;

import java.lang.Math;
import java.util.Scanner;

public class MathMethod {
    public static void main(String[] args) {

        // // Menggunakan Math.max
        int maksimum = Math.max(6, 7);
        double maksimumSatu = Math.max(500, 200);
        System.out.println("Maksimum2 : " + maksimum);
        System.out.println("Maksimum1 : " + maksimumSatu);

        // // Menggunakan Math.nim
        int minimum = Math.min(7, 8);
        System.out.println("Minimum: " + minimum);

        // // random
        double randomDouble = Math.random();
        double data = ((randomDouble * 6) + 1); // generate angka pada dadu
        double data2 = ((randomDouble * 100) + 1); // generate angka 1-100
        int randomNum = (int) data;
        int randomNum2 = (int) data2;
        System.out.println("random : " + randomDouble);
        System.out.println("random : " + randomNum);
        System.out.println("random : " + randomNum2);

        // // math square root
        double square = Math.sqrt(49);
        float square2 = (float) Math.sqrt(80);
        int square3 = (int) Math.sqrt(9);
        System.out.println(square);
        System.out.println(square2);
        System.out.println(square3);

        // math absolute
        float angka1 = Math.abs(-50);
        int angka2 = Math.abs(-200);
        long angka3 = Math.abs(-23);
        System.out.println("math absolute : " + angka1);
        System.out.println("math absolute : " + angka2);
        System.out.println("math absolute : " + angka3);

    }
}
