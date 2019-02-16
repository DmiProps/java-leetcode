package tasks;

import java.util.function.DoubleSupplier;

/** 326. Power of Three */
public class Task326 {

    public static void main(String[] args) {
        System.out.println(new Task326().isPowerOfThree(27));
        System.out.println(new Task326().isPowerOfThree(0));
        System.out.println(new Task326().isPowerOfThree(1));
        System.out.println(new Task326().isPowerOfThree(45));
    }

    public boolean isPowerOfThree(int n) {
        String s = Integer.toString(n, 3);

        return s.matches("^10*$");
    }

}
