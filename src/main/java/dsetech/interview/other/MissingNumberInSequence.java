package dsetech.interview.other;
import java.util.HashSet;
import java.util.Set;

public class MissingNumberInSequence {

    public static void main(String[] args) {
        int[] intArray1 = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(intArray1));

        int[] intArray2 = {1, 2, 3};
        System.out.println(solution(intArray2));

        int[] intArray3 = {-1, -3};
        System.out.println(solution(intArray3));

        int[] intArray4 = {};
        System.out.println(solution(intArray4));
    }

    public static int solution(int[] A) {

        // Optimation check we have a value in array to check
        if (A.length == 0) {
            return 1;
        }

        // Get unique sorted list of values
        final Set<Integer> mySet = new HashSet<>();
        for (final int i : A) {
            mySet.add(i);
        }

        // Find first number not in the list from 1 to N+1
        int iNumCur = 1;
        for (; iNumCur <= mySet.size(); iNumCur++) {
            if (!mySet.contains(iNumCur)) {
                return iNumCur;
            }
        }

        // Return next number after range as no missing numbers in range
        return iNumCur++;
    }
}
