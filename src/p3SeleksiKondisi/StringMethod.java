package p3SeleksiKondisi;

public class StringMethod {
    public static void main(String[] args) {
        String varA = "Nama SaYa Adalah Jono";
        // // 0123456789

        // upper case (jadiin huruf kapital)
        String up = varA.toUpperCase();
        System.out.println("upper case : " + up);

        // lower case
        String down = varA.toLowerCase();
        System.out.println("lower case : " + down);

        // substring
        String sub = varA.substring(0, 9);
        String sub2 = varA.substring(5);
        System.out.println("subString : " + sub);
        System.out.println("subString : " + sub2);

        // replace
        String KalimatReplace = varA.replace('a', 'o');
        System.out.println(varA);
        System.out.println(KalimatReplace);

        // to String
        int varB = 2023;
        Double varC = 254.0;

        String ts = Integer.toString(varB);
        String ts2 = Double.toString(varC);

        System.out.println(ts);
        System.out.println(varB + 5);
        System.out.println(ts + 5);

        String x = ts.getClass().getName();
        System.out.println(x);

        // length
        String varX = "Hai Jonok";
        // 012345678
        int panjang = varX.length();
        System.out.println(panjang);

        // charAt
        char ambil = varX.charAt(panjang - 1);
        System.out.println(ambil);
    }
}
