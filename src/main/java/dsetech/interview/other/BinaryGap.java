package dsetech.interview.other;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(getBinaryGapFromNumber(9));
        System.out.println(getBinaryGapFromNumber(529));
        System.out.println(getBinaryGapFromNumber(20));
        System.out.println(getBinaryGapFromNumber(30));
        System.out.println(getBinaryGapFromNumber(15));
    }

    public static long getBinaryGapFromNumber(final int numberToCheck) {

        final String binaryString = Integer.toBinaryString(numberToCheck);
        final int posOneStart = binaryString.indexOf('1');
        final int posOneLast = binaryString.lastIndexOf('1');

        int maxBinaryZeroGap = 0;
        int zeroCount = 0;
        for (int i = posOneStart + 1; i < posOneLast; i++) {
            final int curNum = Character.getNumericValue(binaryString.charAt(i));
            if (curNum == 0) {
                zeroCount++;
                maxBinaryZeroGap = Math.max(maxBinaryZeroGap, zeroCount);
                continue;
            }
            zeroCount = 0;
        }
        return maxBinaryZeroGap;
    }
}
