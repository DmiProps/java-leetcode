package tasks;

import java.util.Arrays;

/** 976. Largest Perimeter Triangle */
public class Task976 {

    public static void main(String[] args) {
        int[] A = {3,2,3,4};
        System.out.println(new Task976().largestPerimeter(A));
    }

    public int largestPerimeter(int[] A) {
        if (A.length < 3)
            return 0;
        int ans = 0;
        boolean f = false;
        Arrays.sort(A);
        for (int s1 = A.length - 1; s1 > 1; s1--) {
            for (int s2 = s1 - 1; s2 > 0; s2--) {
                for (int s3 = s2 - 1; s3 >= 0; s3--) {
                    if (A[s1] >= A[s2] + A[s3]) {
                        f = true;
                        break;
                    }
                    return A[s1] + A[s2] + A[s3];
                }
                if (f) {
                    break;
                }
            }
            f = false;
        }
        return ans;
    }

}
