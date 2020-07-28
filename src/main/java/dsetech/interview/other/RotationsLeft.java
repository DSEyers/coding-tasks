package dsetech.interview.other;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RotationsLeft {
    public static void main(String[] args) {
        System.out.println("Solution 1");
        final int[] solution1 = solution1(new int[]{3, 8, 9, 7, 6}, 3);

        System.out.println("\nSolution 2");
        final int[] solution2 = solution2(new int[]{3, 8, 9, 7, 6}, 3);
    }

    public static int[] solution1(int[] A, int K) {

        System.out.println("Start values: " + Arrays.toString(A));

        final List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

        Collections.rotate(list, K);

        final int[] primitive = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("End values:   " + Arrays.toString(primitive));
        return primitive;
    }

    public static int[] solution2(int[] A, int K) {

        System.out.println("Start values: " + Arrays.toString(A));
        final int[] arrayTarget = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            final int posRotate = (i + K) % A.length;
            arrayTarget[posRotate] = A[i];
        }

        System.out.println("End values:   " + Arrays.toString(arrayTarget));
        return arrayTarget;
    }
}
