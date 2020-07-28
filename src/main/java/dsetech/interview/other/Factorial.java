package dsetech.interview.other;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            final long line = Long.parseLong(scanner.nextLine());
            System.out.println(factorialCalc1(line));
            System.out.println(factorialCalc2(line));
        }
    }

    private static long factorialCalc1(long numIn) {

        if (numIn == 0 ) {
            return 1;
        }

        int fact = 1;
        for (int i = 1; i <= numIn; i++) {
            fact *= i;
        }
        return fact;
    }

    private static long factorialCalc2(long numIn) {

        if (numIn == 0 || numIn == 1) {
            return 1;
        }

        return numIn * factorialCalc2(numIn - 1);
    }
}
