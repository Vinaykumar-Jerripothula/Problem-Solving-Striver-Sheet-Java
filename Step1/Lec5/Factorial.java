package step1.lec5;
import java.util.Scanner;

public class Factorial {
    
    public static int factorial(int n) {
        int t = n;
        if(n==1) return 1;
        return t * factorial(n-1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
        sc.close();
    }
}