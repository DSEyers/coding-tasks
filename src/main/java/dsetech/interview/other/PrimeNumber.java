package dsetech.interview.other;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            final long line = Long.parseLong(scanner.nextLine());
            System.out.println(primeCalc1(line));
            System.out.println(primeCalc2(line));
        }
    }

    private static boolean primeCalc1(long numIn) {

        // A prime number is a number which is divisible by only two numbers: 1 and itself.
        if (numIn <= 1) {
            return false;
        }

        if (numIn == 2) {
            return true;
        }

        for (int i = 3; i <= numIn / 2; i += 2) {
            if (numIn % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean primeCalc2(long numIn) {

        // A prime number is a number which is divisible by only two numbers: 1 and itself.
        if (numIn <= 1) {
            return false;
        }

        if (numIn == 2) {
            return true;
        }

        for (int i = 3; i <= Math.sqrt(numIn); i++) {
            if (numIn % i == 0) {
                return false;
            }
        }
        return true;
    }
}
