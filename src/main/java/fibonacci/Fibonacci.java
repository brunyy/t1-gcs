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

        for (int i = 0; i < n; i++ ) {
            output.append(' ');
            output.append(a);
            a = a + b;
            b = a - b;
        }
        output.deleteCharAt(0);

        System.out.print(output.toString());
    }
}