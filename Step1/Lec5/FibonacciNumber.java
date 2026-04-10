import java.util.Scanner;

public class FibonacciNumber {

    public static int fibonacciNumber(int n) {
        if(n <= 1) return n;
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibonacci Number of " + n + " is : " + fibonacciNumber(n));
        sc.close();
    }
}