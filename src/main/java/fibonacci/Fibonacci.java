package fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] fib = new int[n+1];

        for (int i = 1; i < n+1; i++ ) {
            fib[i] = a;
            a = a + b;
            b = a - b;
        }

        System.out.println(Arrays.toString(fib));
    }
}