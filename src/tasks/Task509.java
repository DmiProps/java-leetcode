package tasks;

/** 509. Fibonacci Number */
public class Task509 {

    public static void main(String[] args) {
        System.out.println(new Task509().fib(4));
    }

    public int fib(int N) {
        int last = 1, ans = 1, p;
        switch (N) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            default:
                while (N-- > 2) {
                    p = ans;
                    ans += last;
                    last = p;
                }
                return ans;
        }
    }

}
