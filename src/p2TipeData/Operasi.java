package p2TipeData;

public class Operasi {
    public static void main(String[] args) {

        // Operasi Aritmetika
        int angka1 = 10;
        int angka2 = 5;
        int hasil;
        System.out.println("===================");
        System.out.println(angka2 + angka2);

        // 1. Penjumlahan
        hasil = angka1 + angka2;
        System.out.println(angka1 + " ditambah " + angka2 + " sama dengan " + hasil);

        // 2. Pengurangan
        hasil = angka1 - angka2;
        System.out.printf("%d dikurangi %d sama dengan %d \n", angka1, angka2, hasil);

        // 3. Perkalian
        hasil = angka1 * angka2;
        System.out.printf("%d dikali %d sama dengan %d \n", angka1, angka2, hasil);

        // 4. Pembagian
        hasil = angka1 / angka2;
        System.out.printf("%d dibagi %d sama dengan %d \n", angka1, angka2, hasil);

        float a = 6;
        float b = 5;
        float hasilFloat = a / b;
        System.out.println(a + " dibagi " + b + " sama dengan " + hasilFloat);

        // 5. Modulus (sisa hasil bagi)
        hasil = angka1 % angka2;
        System.out.printf("Sisa hasil bagi %d dan %d adalah %d \n", angka1, angka2, hasil);

    }
}
