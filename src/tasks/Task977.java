package tasks;

import java.util.Arrays;

/** 977. Squares of a Sorted Array */
public class Task977 {

    public static void main(String[] args) {

        int[] A = {-4, -1, 0, 3, 10};

        int[] ans = new Task977().sortedSquares(A);

        System.out.println(Arrays.toString(ans));

    }

    public int[] sortedSquares(int[] A) {

        int[] ans = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            ans[i] = A[i] * A[i];
        }

        Arrays.sort(ans);

        return ans;

    }

}
