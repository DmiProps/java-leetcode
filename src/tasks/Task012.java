package tasks;

import java.util.HashMap;

/** 12. Integer to Roman */
public class Task012 {

    public static void runTest() {

        Task012 t = new Task012();

        System.out.println(t.intToRoman(3));
        System.out.println(t.intToRoman(4));
        System.out.println(t.intToRoman(9));
        System.out.println(t.intToRoman(58));
        System.out.println(t.intToRoman(1994));

    }

    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();

        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');
        int[] ar = {1, 5, 10, 50, 100, 500, 1000};
        int i = ar.length - 1;

        while (num > 0) {
            if (num >= ar[i]) {
                ans.append(map.get(ar[i]));
                num -= ar[i];
            } else if (i % 2 == 1 && num >= ar[i] - ar[i - 1]) {
                ans.append(map.get(ar[i - 1]));
                ans.append(map.get(ar[i]));
                num -= ar[i] - ar[i - 1];
                i--;
            } else if (i % 2 == 0 && i > 1 && num >= ar[i] - ar[i - 2]) {
                ans.append(map.get(ar[i - 2]));
                ans.append(map.get(ar[i]));
                num -= ar[i] - ar[i - 2];
                i -= 2;
            } else {
                i--;
            }
        }

        return ans.toString();
    }

}
