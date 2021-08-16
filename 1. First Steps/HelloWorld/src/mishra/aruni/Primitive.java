package mishra.aruni;

import java.math.BigDecimal;

public class Primitive {
    static int instaceVariable;

    public static void main(String[] args) {

        int myMinInteger = Integer.MIN_VALUE;
        System.out.println(myMinInteger);

        int a = 1_2_3;
        System.out.println(a);

        byte myMinByte = Byte.MIN_VALUE;
        System.out.println(myMinByte);

        short myShortByte = Short.MIN_VALUE;
        System.out.println(myShortByte);

        long myLong = 100L;
        long myMaxValue = Long.MAX_VALUE;
        System.out.println(myMaxValue);

        //casting
        byte myNewByte = (byte) (myMinByte / 1);

        double myMinDouble = Double.MIN_VALUE;
        System.out.println(myMinDouble);

        BigDecimal myBiGBigDecimal = BigDecimal.TEN;

        System.out.println(myBiGBigDecimal);

        char myChar = 'a';
        char myUnicodeChar = '\u0905';
        System.out.println(myUnicodeChar);

        String s = "HELLO ";
        s = s + "world " + '\u0905';
        System.out.println(s);

        int result = 1;
        result += 1;
        int value;
        System.out.println(instaceVariable);
        if (result != 2) {

        }
    }
}
