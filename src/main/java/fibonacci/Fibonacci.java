package fibonacci;

public class Fibonacci {

    public Fibonacci() {}

    public String generateFibonacciSeries(int n) {
        int a = 1;
        int b = 0;

        StringBuilder output = new StringBuilder();
        output.append(0);

        for (int i = 0; i < n-1; i++) {
            output.append(' ');
            output.append(a);
            a = a + b;
            b = a - b;
        }

        return output.toString();
    }
}