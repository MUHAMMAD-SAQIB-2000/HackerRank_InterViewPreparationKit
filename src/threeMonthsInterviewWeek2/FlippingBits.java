package threeMonthsInterviewWeek2;

import java.math.BigInteger;

public class FlippingBits {

    public static void main(String[] args) {
        System.out.println(flippingBits(9));
    }

    public static long flippingBits(long n) {
        //converting to long and adding leading zeros
        String numBinaryString = Long.toBinaryString(n);
        numBinaryString = String.format("%32s", numBinaryString).replace(" ", "0");

        //flipping bits
        String bitsFlipped = "";
        for (int i = 0; i < numBinaryString.length(); i++) {
            char bit = numBinaryString.charAt(i);
            bitsFlipped += bit == '0' ? '1' : '0';
        }

        //converting to unsigned long
        Long unsignedLong = Long.parseLong(bitsFlipped, 2);
        return unsignedLong;
    }

}
