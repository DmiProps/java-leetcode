package tasks;

import java.util.*;

/** 961. N-Repeated Element in Size 2N Array */
public class Task961 {

    public static void main(String[] args) {

        int[] A = {5,1,5,2,5,3,5,4};

        int ans = new Task961().repeatedNTimes(A);

        System.out.println(ans);

    }

    public int repeatedNTimes(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return 0;
    }

}
