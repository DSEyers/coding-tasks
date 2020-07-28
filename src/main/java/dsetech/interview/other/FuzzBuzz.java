package dsetech.interview.other;

import java.util.Scanner;

public class FuzzBuzz {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter range start  number");
            final int numStart = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter range end number");
            final int numEnd = Integer.parseInt(scanner.nextLine());

            for (int i = numStart; i <= numEnd; i++) {
                System.out.println(isFuzzBuzz(i));
            }
        }
    }

    private static String isFuzzBuzz(int numIn) {

        final int NUM_FIZZ = 3;
        final int NUM_BUZZ = 5;

        final String WORD_FUZZ = "Fizz";
        final String WORD_BUZZ = "Buzz";

        final StringBuilder sbRet = new StringBuilder();
        if (numIn % NUM_FIZZ == 0) {
            sbRet.append(WORD_FUZZ);
        }

        if (numIn % NUM_BUZZ == 0) {
            sbRet.append(WORD_BUZZ);
        }

        if (sbRet.length() == 0) {
            sbRet.append(numIn);
        }

        return sbRet.toString();
    }
}
