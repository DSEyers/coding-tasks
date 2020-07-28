package dsetech.interview.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        play10();
    }

    private static void play1() {
        // System.out.println("Enter numbers to add and press enter to calculate");
        try (final Scanner scanner = new Scanner(System.in)) {
            final String[] tokens = scanner.nextLine().split(" ");

            // Validate input
            BigDecimal result = BigDecimal.ZERO;
            for (final String token : tokens) {
                final long tmpToken;
                try {
                    result = result.add(new BigDecimal(token));

                } catch (NumberFormatException e) {
                    // Value entered is not a number (integer)
                    // System.out.println("Found non number value entered: " + token);
                    continue;
                }
            }
            // System.out.println("Values entered: " + Arrays.asList(tokens));
            System.out.println(result);
        }
    }

    private static void play2() {
        // System.out.println("Enter numbers to add and press enter to calculate");
        try (final Scanner scanner = new Scanner(System.in)) {
            final char[] chars = scanner.nextLine().toCharArray();

            BigDecimal result = BigDecimal.ZERO;
            for (char charCur : chars) {
                try {
                    System.out.println(charCur);
                    result = result.add(BigDecimal.valueOf(Character.getNumericValue(charCur)));

                } catch (NumberFormatException e) {
                    // Value entered is not a number (integer)
                    // System.out.println("Found non number value entered: " + token);
                    return;
                }
            }

            // System.out.println("Values entered: " + Arrays.asList(tokens));
            System.out.println(result);
        }
    }

    private static void play3() {
        // System.out.println("Enter a two digit number to calculate number of tens");
        try (final Scanner scanner = new Scanner(System.in)) {
            final int resultTens = scanner.nextInt() / 10;
            System.out.println(resultTens);
        }
    }

    private static void play4() {

        // System.out.println("Enter numbers to add and press enter to calculate");
        try (final Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String line = scanner.nextLine();
                final String[] tokens = line.split(" ");

                // Validate input
                final String tokenOne = tokens[0].trim();
                if (tokens.length == 1) {
                    if (tokenOne.equalsIgnoreCase("/exit")) {
                        System.out.println("Bye!");
                        return;
                    }

                    if (tokenOne.length() == 0) {
                        continue;
                    }
                }

                BigDecimal result = BigDecimal.ZERO;
                for (final String token : tokens) {

                    try {
                        result = result.add(new BigDecimal(token));


                    } catch (NumberFormatException e) {
                        // Value entered is not a number (integer)
                        // System.out.println("Found non number value entered: " + token);
                        continue;
                    }
                }
                System.out.println(result);
            }
        }
    }

    private static void play5() {
        final ArrayList<String> lines = new ArrayList<>(5);
        try (final Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                lines.add(scanner.nextLine());
            }
        }

        System.out.println("The form for " + lines.get(0)
                + " is completed. We will contact you if we need a chef that cooks " + lines.get(4)
                + " dishes.");
    }

    public static void play6() {

        try (final Scanner scanner = new Scanner(System.in)) {

            // Collect 4 numeric inputs (one per a line)
            final int aInp = Integer.parseInt(scanner.nextLine());
            final int bInp = Integer.parseInt(scanner.nextLine());
            final int cInp = Integer.parseInt(scanner.nextLine());
            final int dInp = Integer.parseInt(scanner.nextLine());

            // Calculate whether X (0 to 1K inclusive) in formula equates to 0.
            //  Formula: ax3 +bx2 + cx + d = 0 where x is value from 1 to 1,000
            int rootCounter = 0;
            for (int i = 0; i <= 1_000; i++) {
                final double a = aInp * Math.pow(i, 3);
                final double b = bInp * Math.pow(i, 2);
                final double c = cInp * Math.pow(i, 1);
                final double equationRes = a + b + c + dInp;

                if (equationRes == 0) {
                    System.out.println(i);

                    // Exit loop if cubic equation always has 3 roots (max hit / counter starts @0)
                    if (rootCounter == 2) {
                        break;
                    }
                    rootCounter++;
                }
            }
        }
    }

    public static void play7() {

        try (final Scanner scanner = new Scanner(System.in)) {

            // Prompt for start and end range values from user
            final int noStart = Integer.parseInt(scanner.nextLine());
            final int noEnd = Integer.parseInt(scanner.nextLine());

            double totalNo = 0;
            int cntMatches = 0;
            for (int i = noStart; i <= noEnd; i++) {
                if (i % 3 == 0) {
//                    System.out.println(i);
                    totalNo += i;
                    cntMatches++;
                }
            }

            System.out.println(totalNo / cntMatches);
        }
    }

    public static void play8() {

        try (final Scanner scanner = new Scanner(System.in)) {
            final int noOfSquirrels = Integer.parseInt(scanner.nextLine());
            final int noOfNuts = Integer.parseInt(scanner.nextLine());
            System.out.println(noOfNuts / noOfSquirrels);
        }
    }


    public static void play9() {

        try (final Scanner scanner = new Scanner(System.in)) {
            final int noStart = scanner.nextInt();
            final int noEndB4 = scanner.nextInt();
            for (int i = noStart; i < noEndB4; i++) {
                System.out.println(i);
            }
        }
    }

    public static boolean play10() {

        try (final Scanner scanner = new Scanner(System.in)) {
            final String line = scanner.nextLine();
            return line.charAt(0) == 'J' || line.charAt(0) == 'j';
        }
    }

//    public static boolean play11() {
//
//        try (final Scanner scanner = new Scanner(System.in)) {
//            final int entryOne = scanner.nextInt();
//            final int entryTwo = scanner.nextInt();
//            for (int i = entryOne; i < entryTwo; i++) {
//                 if (i ) {
//
//                 }
//
//            }
//        }
//    }

    public static boolean play12() {

        final List<Integer> numbers = new ArrayList<>(4);
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach(n -> {
            System.out.println(n);
        });
        return true;
    }
}