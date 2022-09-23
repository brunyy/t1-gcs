package fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(fibonacci.generateFibonacciSeries(n));
        System.out.println();
    }
}