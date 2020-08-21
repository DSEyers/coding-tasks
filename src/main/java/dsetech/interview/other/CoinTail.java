package dsetech.interview.other;

import java.util.Arrays;

public class CoinTail {

    final int COIN_VAL_HEAD = 0;
    final int COIN_VAL_TAIL = 1;

    public static void main(String[] args) {

        final CoinTail coinTail = new CoinTail();

        int iScenario = 1;
        System.out.println("Scenario " + iScenario++ + " expected flip result 1");
        System.out.println("\tResult min calculated: " + coinTail.solution(new int[]{1, 0, 1, 0, 1, 1}));

        System.out.println("Scenario " + iScenario++ + " expected flip result 2");
        System.out.println("\tResult min calculated: " + coinTail.solution(new int[]{1, 1, 0, 1, 1}));

        System.out.println("Scenario " + iScenario++ + " expected flip result 3");
        System.out.println("Expected flips result 0");
        System.out.println("\tResult min calculated: " + coinTail.solution(new int[]{0, 1, 0}));

        System.out.println("Scenario " + iScenario++ + " expected flip result 2");
        System.out.println("\tResult min calculated: " + coinTail.solution(new int[]{0, 1, 1, 0}));

        System.out.println("Scenario " + iScenario++ + " expected flip result 2");
        System.out.println("\tResult min calculated: " + coinTail.solution(null));

        System.out.println("Scenario " + iScenario++ + " expected flip result 2");
        System.out.println("\tResult min calculated: " + coinTail.solution(new int[]{}));
    }

    public int solution(int[] A) {

        System.out.println("Input \t" + Arrays.toString(A));
        if (A == null || A.length == 0) {
            System.out.println("\tflips for null/empty array: " + 0);
            return 0;
        }

        final int flipsZero = flipCoinsStartingWith(A, COIN_VAL_HEAD);

        // If no flips required for first permutation no point trying 2nd/final one
        if (flipsZero == 0) {
            System.out.println("\tResult 1 not required as first result required no flips");
            return flipsZero;
        }

        final int flipsOne = flipCoinsStartingWith(A, COIN_VAL_TAIL
        );
        return Math.min(flipsZero, flipsOne);
    }

    /**
     * determine number of flips needed on iinput to start with specified number in alternate sequence
     * @param coinSeq list of 0's and 1' (heads / tails)
     * @param coinStartWith 0 or 1 (heads or tails)
     * @return flips needed to achieve result
     */
    private int flipCoinsStartingWith(final int[] coinSeq, final int coinStartWith) {

        int flipCount = 0;
        int expectedCoin = coinStartWith;
        final int[] coinSeqFlipped = new int[coinSeq.length];   // Only include if want to see result of change
        for (int i = 0; i < coinSeq.length; i++) {

            if (coinSeq[i] != expectedCoin) {
                flipCount++;
            }
            coinSeqFlipped[i] = expectedCoin;
            expectedCoin = expectedCoin == COIN_VAL_HEAD ? COIN_VAL_TAIL : COIN_VAL_HEAD;
        }
        System.out.println("\tResult start with " + coinStartWith + "\t" + Arrays.toString(coinSeqFlipped) + "\tflips " + flipCount);
        return flipCount;
    }
}
