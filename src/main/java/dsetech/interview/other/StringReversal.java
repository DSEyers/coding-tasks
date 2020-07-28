package dsetech.interview.other;

public class StringReversal {

    public static void main(String[] args) {
        final String STRING_SOURCE = "Hello World!";
        System.out.println(StringReversal.getReserseString1(STRING_SOURCE));
        System.out.println(StringReversal.getReserseString2(STRING_SOURCE));
    }

    private static String getReserseString1(final String stringToReverse) {
        if (stringToReverse == null || stringToReverse.isEmpty()) return stringToReverse;

        final StringBuilder sbResult = new StringBuilder(stringToReverse.length());
        final char[] chars = stringToReverse.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            sbResult.append(chars[i]);
        }
        return sbResult.toString();
    }

    private static String getReserseString2(final String stringToReverse) {
        if (stringToReverse == null || stringToReverse.isEmpty()) return "";
        return getReserseString2(stringToReverse.substring(1)) + stringToReverse.charAt(0);
    }
}
