package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 12;
        short shortValue = 17;
        int intValue = 20;

        long longTotal = 50000L + 10L*(byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue+  intValue));
    }
}
