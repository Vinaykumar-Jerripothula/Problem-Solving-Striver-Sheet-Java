import java.util.Scanner;

public class SumOfFirstNNumbers {

    public static int sumOfFirstNNumbers(int n) {
        
        if(n==1) return 1;
        return n + sumOfFirstNNumbers(n-1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of First " + n + " Numbers : " + sumOfFirstNNumbers(n));
    }
}