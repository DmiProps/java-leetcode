package tasks;

import java.util.ArrayList;
import java.util.List;

/** 989. Add to Array-Form of Integer */
public class Task989 {

    public static void main(String[] args) {

        // test 1
        int[] A1 = {2,7,4};
        System.out.println(new Task989().addToArrayForm(A1, 181));

        // test 2
        int[] A2 = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(new Task989().addToArrayForm(A2, 1));

    }

    public List<Integer> addToArrayForm(int[] A, int K) {

        List<Integer> ans = new ArrayList<>();
        int r = 0;
        int d = 0;
        while (K > 0 || r < A.length || d > 0) {

            d += K % 10 + (r >= A.length ? 0 : A[A.length - 1 - r]);
            K /= 10;
            ans.add(0, d % 10);
            d /= 10;
            r++;

        }

        return ans;

    }

}
