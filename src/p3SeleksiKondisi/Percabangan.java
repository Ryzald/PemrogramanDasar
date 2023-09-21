package p3SeleksiKondisi;

public class Percabangan {
    public static void main(String[] args) {

        // '>' lebih besar
        // '<' lebih kecil
        // '>=' lebih besar sama dengan
        // '<=' lebih kecil sama dengan
        // '==' sama dengan
        // '!' tidak

        // || atau(salah satu benar lanjut)
        // && dan ( keduanya harus benar)

        int angka = 11;

        // if else
        if (angka != 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // nested if else (bersarang)

        if (angka < 10) {
            if (angka > 3) {
                System.out.println("angka lebih kecil dari 10 dan lebih besar dari 3");
            } else {
                System.out.println("angka lebih kecil dari 10 tetapi tidak lebih besar dari 3 ");
            }
        } else {
            System.out.println("angka tidak lebih kecil dari 10");
        }

        // keterbacaan
        int angka2 = 3;

        if (angka2 != 6) {
            int umur = 21; // keterbacaan
            System.out.println(true);
            System.out.println(umur);
        } else {
            System.out.println(false);
        }

        // System.out.println(umur); " tidak bisa karena pembuatan int umur didalam
        // ifelse if"
        int umur = 60;
        if (umur <= 17) {
            System.out.println("anda dibawah umur");
        } else if (umur > 17 && umur < 40) {
            System.out.println("anda cukup umur");
        } else if (umur > 40 && umur < 100) {
            System.out.println("anda terlalu tua");
        } else {
            System.out.println("umur anda melebihi batas");
        }

        // switch case

        // ternary "variable = (condition) ? expressionTrue : expressionFalse;"
    }
}