package tasks;

import java.util.*;

/** 454. 4Sum II */
public class Task454 {

    public static void runTest() {

        int[] A = {1, 2}, B = {-2, -1}, C = {-1, 2}, D = {0, 2};

        System.out.println(new Task454().fourSumCount(A, B, C, D));
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int p, ans = 0;

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                p = C[i] + D[j];
                map.put(p, map.getOrDefault(p, 0) + 1);
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                p = A[i] + B[j];
                ans += map.getOrDefault(-p, 0);
            }
        }

        return ans;
    }

}
