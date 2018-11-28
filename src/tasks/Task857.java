
package tasks;

import java.util.*;

/* Work slowly !!! */

/** 857. Minimum Cost to Hire K Workers */
public class Task857 {

    public static void runTest() {

        /*System.out.println(new Task857().mincostToHireWorkers(
                new int[]{3,1,10,10,1},
                new int[]{4,8,2,2,7},
                3)
        );*/
        /*System.out.println(new Task857().mincostToHireWorkers(
                new int[]{2},
                new int[]{14},
                1)
        );*/
        /*System.out.println(new Task857().mincostToHireWorkers(
                new int[]{1,2},
                new int[]{14,16},
                1)
        );*/
        /*System.out.println(new Task857().mincostToHireWorkers(
                new int[]{25,68,35,62,52,57,35,83,40,51},
                new int[]{147,97,251,129,438,443,120,366,362,343},
                6)
        );*/
        System.out.println(new Task857().mincostToHireWorkers(
                new int[]{4,5},
                new int[]{8,14},
                2)
        );

    }

    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {

        TreeMap<Integer, List<Double>> map = new TreeMap<>(); // quality -> list of q/w
        List<Double> list;

        for (int i = 0; i < quality.length; i++) {
            list = map.get(quality[i]);
            if (list == null) {
                list = new ArrayList<>();
                map.put(quality[i], list);
            }
            list.add((double)quality[i] / (double)wage[i]);
        }

        double[][] arr = new double[quality.length][2]; // [][0] - quality, [][1] - quality / wage
        int index = 0;
        for (Map.Entry<Integer, List<Double>> e : map.entrySet()) {
            for (double k : e.getValue()) {
                arr[index][0] = e.getKey();
                arr[index][1] = k;
                index++;
            }
        }

        double ans = -1., t;
        int k, j;
        for (int i = 0; i < quality.length; i++) {
            t = arr[i][0];
            k = K - 1;
            j = 0;
            while (k > 0 && j < quality.length) {
                if (j == i) {
                    j++;
                    continue;
                }
                if (arr[j][1] >= arr[i][1]) {
                    t += arr[j][0];
                    k--;
                }
                j++;
            }
            if (k == 0) {
                t /= arr[i][1];
                if (ans < 0 || t < ans) {
                    ans = t;
                }
            }
        }

        return ans;

    }

}
