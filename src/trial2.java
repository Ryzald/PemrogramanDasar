import java.util.Scanner;

public class trial2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int panjang = input.length();
        System.out.println(input);
        System.out.println(panjang);

        // 1 =0
        // 2 =1
        // 3= 2
        // 4=3
        for (int i = 1; i <= panjang; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("x");
            }
            // System.out.println(input.charAt(i - 1));
            System.out.println();
        }

    }

}
