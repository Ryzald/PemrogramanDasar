package hackerank;

import java.util.Scanner;

public class AjiArtsy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        sc.close();

        int length = kata.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(kata.charAt(i));
        }
    }
}
