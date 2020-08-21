package dsetech.interview.fuzzbuzz1;

public class FizzBuzz {

    final static String FIZZBUZZ_FIZZ = "Fizz";
    final static String FIZZBUZZ_BUZZ = "Buzz";

    final static int FIZZBUZZ_FIZZ_NO = 3;
    final static int FIZZBUZZ_BUZZ_NO = 5;

    public static void main(String[] args) {

        final int NUMBER_START = 1;
        final int NUMBER_UPTO = 100;

        fizzBuzz(NUMBER_START, NUMBER_UPTO);
    }

    public static String getResultForNumber(final int numberToCompare) {

        final StringBuilder sbRet = new StringBuilder();
        if (numberToCompare % FIZZBUZZ_FIZZ_NO == 0) {
            sbRet.append(FIZZBUZZ_FIZZ);
        }

        if (numberToCompare % FIZZBUZZ_BUZZ_NO == 0) {
            sbRet.append(FIZZBUZZ_BUZZ);
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
     *
     * @param NUMBER_START number to start from
     * @param NUMBER_UPTO number to end at
     **/
    public static void fizzBuzz(final int NUMBER_START, final int NUMBER_UPTO) {

        // Loop though from START to END number
        for (int i = NUMBER_START; i <= NUMBER_UPTO; i++) {
            final String result = getResultForNumber(i);
            System.out.println(result);
        }
    }
}
