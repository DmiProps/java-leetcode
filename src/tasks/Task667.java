package tasks;

/** 667. Beautiful Arrangement II */
public class Task667 {

    public static void runTest() {

        int[] ans = new Task667().constructArray(3, 2);
        //int[] ans = new Task667().constructArray(3, 1);
        for (int i : ans)
            System.out.print(i + ", ");

    }

    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int[] mmm = {1, n};
        int ind = 0;

        for (int i = 0; i < n; i++) {

            if (k == 1) {
                int s = ind == 0 ? 1 : -1;
                while (i < n) {
                    ans[i++] = mmm[ind];
                    mmm[ind] += s;
                }
                break;
            }

            ans[i] = mmm[ind];
            if (ind == 0) {
                mmm[0]++;
            } else {
                mmm[1]--;
            }
            ind = 1 - ind;
            k--;

        }

        return ans;
    }

}
