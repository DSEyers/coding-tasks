package dsetech.interview.fuzzbuzz2;

public class FizzBuzzResultString {

    public final static String FIZZBUZZ_FIZZ = "Fizz";
    public final static String FIZZBUZZ_BUZZ = "Buzz";

    final static int FIZZBUZZ_FIZZ_NO = 3;
    final static int FIZZBUZZ_BUZZ_NO = 5;

    public static void main(String[] args) {
        final String run = run(1, 10);
        System.out.println(run);
    }

    public static String run(int N, int M) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */

        final StringBuilder sbResult = new StringBuilder();
        for (int i = N; i <= M; i++) {
            final String result = getResultForNumber(i);
//            System.out.println(result);
            sbResult.append(result);

            // Add following if you want "," added between result elements
//            if (i != M) {
//                sbResult.append(",");
//            }
        }
        return sbResult.toString();
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
}
