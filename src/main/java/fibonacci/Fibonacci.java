package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder output = new StringBuilder();

        output.append(0);
        for (int i = 0; i < n-1; i++ ) {
            output.append(' ');
            output.append(a);
            a = a + b;
            b = a - b;
        }

        System.out.print(output.toString());
        System.out.println();
    }
}