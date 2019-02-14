package tasks;

/** 953. Verifying an Alien Dictionary */
public class Task953 {

    public static void main(String[] args) {

        // test 1
        //String[] words = {"word","world","row"};
        //String order = "worldabcefghijkmnpqstuvxyz";

        // test 2
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        System.out.println(new Task953().isAlienSorted(words, order));
    }

    public boolean isAlienSorted(String[] words, String order) {
        int len, d;
        int[] weight = new int[26];
        for (int i = 0; i < 26; i++) {
            weight[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i+1];
            len = Math.min(w1.length(), w2.length());
            boolean f = false;
            for (int j = 0; j < len; j++) {
                d = weight[w1.charAt(j) - 'a'] - weight[w2.charAt(j) - 'a'];
                if (d > 0) {
                    return false;
                }
                if (d < 0) {
                    break;
                }
                if (j == len - 1) {
                    f = true;
                }
            }
            if (f && w1.length() > w2.length()) {
                return false;
            }
        }
        return true;
    }

}
