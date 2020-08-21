package dsetech.interview.other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringCon {

    public static void main(String[] args) {

        final String[] arrayRow1 = {"ds", "te", "ch", "dsetech"};
        // Unique [tedsch, teds, dstech, chds, chdste, dste]
        // Max item length 6

        final String[] arrayRow2 = {"abc", "yyy", "def", "csv"};
        // Unique [abcdef, defabc]
        // Max item length 6

        final String[] arrayRow3 = {"potato", "kayak", "banana", "racecar"};
        // Unique []
        // Max item length 0

        final String[] arrayRow4 = {"eva", "jqw", "tyn", "jan"};
        // Unique [evajqwtyn, jqweva, evajqw, tyneva, tynevajqw, jqwevatyn]
        // Max item length 9

        final String[][] inputArray = {
                arrayRow1,
                arrayRow2,
                arrayRow3,
                arrayRow4
        };

        final StringCon coinTail = new StringCon();
        for (String[] arrayRow : inputArray) {
            System.out.println("Input array " + arrayRow);
            final int maxResultElementLength = coinTail.solution(arrayRow);
            System.out.println("Max item length " + maxResultElementLength);
            System.out.println();
        }
    }

    public int solution(String[] A) {

        if (A == null || A.length == 0) {
            return 0;
        }

        final Set<String> uniqueWordSet = new LinkedHashSet<>();
        for (final String str : A) {

            if (!isUniqueCharacters(str)) {
                // skip adding words which have duplicate characters  e.g abb (skip), but abc (allowed)
                continue;
            }
            uniqueWordSet.add(str);
        }

        // Loop though unique word list which has no character in word more then once
        final Set<String> uniqueWordSetResults = new HashSet<>();
        for (final String curWord : uniqueWordSet) {

            // For Outer loop word loop though loop again adding each element sequentially
            String strCurConcat = curWord;
            for (final String strWordCompCur : uniqueWordSet) {
                if (strWordCompCur.equals(curWord)) {
                    // skip outer loop word using/comparing others to
                    continue;
                }
                strCurConcat += strWordCompCur;
                if (isUniqueCharacters(strCurConcat)) {
                    // skip adding words which have duplicate characters in, so abb (skip), but abc (allowed)
                    uniqueWordSetResults.add(strCurConcat);
                }
            }
        }

        System.out.println("Unique " + uniqueWordSetResults);
        return getListMaxItemLenth(uniqueWordSetResults);
    }

    /**
     * check if any character exist in string already
     *
     * @param strToCheck to check
     * @return true if unique, otherwise false
     */
    public boolean isUniqueCharacters(final String strToCheck) {
        final Set<Character> characters = strToCheck.chars()
                .mapToObj(chr -> (char) chr)
                .collect(Collectors.toSet());

        return characters.size() == strToCheck.length();
    }

    /**
     * Longest item length in the set
     *
     * @param uniqueWordSetResults set to look at
     * @return length of longest item(s)
     */
    private int getListMaxItemLenth(final Set<String> uniqueWordSetResults) {
        return uniqueWordSetResults.stream()
                .mapToInt(String::length)
                .filter(wordCur -> wordCur >= 0)
                .max()
                .orElse(0);
    }
}
