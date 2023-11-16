package array;

import java.util.Arrays;

public class ArrayMultiDimensi {
    public static void main(String[] args) {

        /** SPLIT **/
        String text = "Hello World Java";

        // Memisahkan String berdasarkan koma
        String[] parts = text.split(" ");

        System.out.println(Arrays.toString(parts));
        // Menampilkan hasil
        for (String part : parts) {
            System.out.println(part);
        }

        /** SORT **/
        int[] numbers = { 5, 2, 8, 1, 6 };

        // Mengurutkan array
        Arrays.sort(numbers);

        // Menampilkan hasil
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        /** TO CHAR ARRAY **/
        // Contoh String
        String str = "Hello, World!";

        // Mengonversi String menjadi char array
        char[] charArray = str.toCharArray();

        // Menampilkan elemen-elemen char array
        System.out.println("Char array elements:");
        for (char c : charArray) {
            System.out.print(c + " ");
            // output
            // 0 1 2 3 4 5 6 7 8 9 10 11
            // H e l l o , W o r l d
        }

    }
}
