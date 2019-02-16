package tasks;

/** 231. Power of Two */
public class Task231 {

    public static void main(String[] args) {
        System.out.println(new Task231().isPowerOfTwo(1));
        System.out.println(new Task231().isPowerOfTwo(16));
        System.out.println(new Task231().isPowerOfTwo(218));
    }

    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n > 1) {
            if (n == (n / 2) * 2) {
                n /= 2;
            } else {
                return false;
            }
        }
        return true;
    }

}
