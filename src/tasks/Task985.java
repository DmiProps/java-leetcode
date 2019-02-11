package tasks;

import java.util.Arrays;

/** 985. Sum of Even Numbers After Queries */
public class Task985 {

    public static void main(String[] args) {

        // test 1.
        //int[] A = {1, 2, 3, 4};
        //int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};

        // test 2
        int[] A = {3, 2};
        int[][] queries = {{4, 0}, {3, 0}};

        int[] ans = new Task985().sumEvenAfterQueries(A, queries);

        System.out.println(Arrays.toString(ans));

    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ans = new int[A.length];
        int val = queries[0][0];
        int ind = queries[0][1];
        int sum = 0;

        A[ind] += val;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sum += A[i];
            }
        }
        ans[0] = sum;
        for (int i = 1; i < queries.length; i++) {
            val = queries[i][0];
            ind = queries[i][1];
            if (A[ind] % 2 == 0) {
                if (val % 2 == 0) {
                    sum += val;
                } else {
                    sum -= A[ind];
                }
            } else {
                if (val % 2 != 0) {
                    sum += (A[ind] + val);
                }
            }
            ans[i] = sum;
            A[ind] += val;
        }
        return ans;
    }

}
