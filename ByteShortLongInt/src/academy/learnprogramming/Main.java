package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println(" Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println(" Busted MIN value = " + (myMinIntValue - 1));

        int MyMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min Value " + myMinByteValue );
        System.out.println("Byte max Value " + myMaxByteValue );

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min Value " + myMinShortValue );
        System.out.println("Short max Value " + myMaxShortValue );
        
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min Value " + myMinLongValue );
        System.out.println("Long max Value " + myMaxLongValue );
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte newByteValue = (byte) (myMinByteValue/2);

        short newShortValue = (short) (myMinShortValue/2);

    }
}
