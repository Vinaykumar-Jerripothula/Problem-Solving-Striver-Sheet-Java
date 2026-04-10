

import java.util.Scanner;

public class OneToNSum {

    public static int sumOfFirstNNaturalNumbers(int n) {

        if (n == 0) {
            return 0;
        }
        return n + sumOfFirstNNaturalNumbers(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N To find sum : ");
        int n = sc.nextInt();
        int sum = sumOfFirstNNaturalNumbers(n);
        System.out.println("The sum is : " + sum);
        sc.close();
    }
}
