package tasks;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/** 973. K Closest Points to Origin */
public class Task973 {

    public static void main(String[] args) {

        int[][] points = {{3,3},{5,-1},{-2,4}};
        int K = 2;

        int[][] ans = new Task973().kClosest(points, K);

        for(int[] i : ans) {
            System.out.println(i[0] + ", " + i[1]);
        }

    }

    public int[][] kClosest(int[][] points, int K) {
        TreeMap<Integer, ArrayList<int[]>> map = new TreeMap<>();
        for(int[] i : points) {
            int d = i[0] * i[0] + i[1] * i[1];
            ArrayList<int[]> list = map.get(d);
            if(list == null) {
                list = new ArrayList<>();
                map.put(d, list);
            }
            list.add(i);
        }

        int[][] ans = new int[K][];
        int i = 0;
        for(Map.Entry<Integer, ArrayList<int[]>> e : map.entrySet()) {
            if(i >= K) {
                break;
            }
            for(int[] a : e.getValue()) {
                ans[i++] = a;
            }
        }
        return ans;
    }
}
