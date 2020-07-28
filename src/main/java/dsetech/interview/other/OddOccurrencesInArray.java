package dsetech.interview.other;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(solution(new int[]{9, 3}));
        System.out.println(solution(new int[]{9, 9}));
        System.out.println(solution(new int[]{9}));
        System.out.println(solution(new int[]{9, 9, 1}));
        System.out.println(solution(new int[]{9, 9, 1, 1}));
        System.out.println(solution(new int[]{9, 9, 9, 10}));
    }

    public static int solution(int[] A) {

        Arrays.sort(A);
        System.out.println("Sorted values: " + Arrays.toString(A));

        int lastNo = -1;
        int cntOccur = 0;
        boolean newValue = true;
        for (final int curVal : A) {

            newValue = curVal != lastNo;
            if (!newValue) {
                cntOccur++;
                continue;
            }

            // Check if only match found
            if (lastNo > -1 && cntOccur == 1) {
                break;
            }
            cntOccur = 1;
            lastNo = curVal;
        }

        return newValue ? lastNo : -1;
    }
}
