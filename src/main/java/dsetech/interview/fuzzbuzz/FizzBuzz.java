package dsetech.interview.fuzzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz();
    }

    public static String getResult(final int numberToCompare) {

        final StringBuilder sbRet = new StringBuilder();
        if (numberToCompare % 3 == 0) {
            sbRet.append(Constants.FIZZBUZZ.FIZZ);
        }

        if (numberToCompare % 5 == 0) {
            sbRet.append(Constants.FIZZBUZZ.BUZZ);
        }

        if (sbRet.length() == 0) {
            // Not divisible by divisions above so return number
            sbRet.append(numberToCompare);
        }
        return sbRet.toString();
    }

    /**
     * Outputs whether where divisible by
     * 3: FIZZ
     * 5: Buzz,
     * Both 3&5: FizzBuz
     * Otherwise the number passed
     **/
    public static void fizzBuzz() {

        final int NUMBER_START = 1;
        final int NUMBER_UPTO = 100;

        // Loop though from 1 to 100
        for (int i = NUMBER_START; i <= NUMBER_UPTO; i++) {
            String result = getResult(i);
            System.out.println(result);
        }
    }
}
