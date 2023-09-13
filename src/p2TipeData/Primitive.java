package p2TipeData;

public class Primitive {
    public static void main(String[] args) {

        // Integer (whole numbers)
        int i = 10;
        System.out.println("======INTEGER======");
        System.out.println("Value of integer i = " + (i + 1));
        System.out.println("Maximum value = " + Integer.MAX_VALUE);
        System.out.println("Minimum value = " + Integer.MIN_VALUE);
        System.out.println("Size of an integer = " + Integer.BYTES + " bytes");
        System.out.println("Size of an integer = " + Integer.SIZE + " bits");

        // Byte (whole numbers)
        byte b = 10;
        System.out.println("======BYTE======");
        System.out.println("Value of byte b = " + b);
        System.out.println("Maximum value = " + Byte.MAX_VALUE);
        System.out.println("Minimum value = " + Byte.MIN_VALUE);
        System.out.println("Size of a byte = " + Byte.BYTES + " bytes");
        System.out.println("Size of a byte = " + Byte.SIZE + " bits");

        // Short (whole numbers)
        short s = 10;
        System.out.println("======SHORT======");
        System.out.println("Value of short s = " + s);
        System.out.println("Maximum value = " + Short.MAX_VALUE);
        System.out.println("Minimum value = " + Short.MIN_VALUE);
        System.out.println("Size of a short = " + Short.BYTES + " bytes");
        System.out.println("Size of a short = " + Short.SIZE + " bits");

        // Long (whole numbers)
        long l = 10L;
        System.out.println("======LONG======");
        System.out.println("Value of long l = " + l);
        System.out.println("Maximum value = " + Long.MAX_VALUE);
        System.out.println("Minimum value = " + Long.MIN_VALUE);
        System.out.println("Size of a long = " + Long.BYTES + " bytes");
        System.out.println("Size of a long = " + Long.SIZE + " bits");

        // Double (floating-point numbers)
        double d = -10.5d;
        System.out.println("======DOUBLE======");
        System.out.println("Value of double d = " + d);
        System.out.println("Maximum value = " + Double.MAX_VALUE);
        System.out.println("Minimum value = " + Double.MIN_VALUE);
        System.out.println("Size of a double = " + Double.BYTES + " bytes");
        System.out.println("Size of a double = " + Double.SIZE + " bits");

        // Float (floating-point numbers)
        float f = -8.5f;
        System.out.println("======FLOAT======");
        System.out.println("Value of float f = " + f);
        System.out.println("Maximum value = " + Float.MAX_VALUE);
        System.out.println("Minimum value = " + Float.MIN_VALUE);
        System.out.println("Size of a float = " + Float.BYTES + " bytes");
        System.out.println("Size of a float = " + Float.SIZE + " bits");

        // Character (characters based on ASCII)
        char c = 'c';
        System.out.println("======CHAR======");
        System.out.println("Value of char c = " + c);
        System.out.println("Maximum value = " + Character.MAX_VALUE);
        System.out.println("Minimum value = " + Character.MIN_VALUE);
        System.out.println("Size of a char = " + Character.BYTES + " bytes");
        System.out.println("Size of a char = " + Character.SIZE + " bits");

        // Boolean (true or false)
        boolean val = false;
        System.out.println("======BOOLEAN======");
        System.out.println("Value of boolean val = " + val);
        System.out.println("Maximum value = " + Boolean.TRUE);
        System.out.println("Minimum value = " + Boolean.FALSE);

    }
}
