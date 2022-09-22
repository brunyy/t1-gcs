package fibonacci;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int n = 10;

        int[] fib = new int[n+1];

        for (int i = 1; i < n+1; i++ ) {
            fib[i] = a;
            a = a + b;
            b = a - b;
        }

        System.out.println(Arrays.toString(fib));
    }
}