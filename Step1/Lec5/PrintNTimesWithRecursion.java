
import java.util.*;

public class PrintNTimesWithRecursion {

    public static void recursion(int n ) {
        if(n == 0) {
            return ;
        }
        System.out.println("Vinay Kumar J " + n);
        recursion(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times do you want to print : " );
        int n = sc.nextInt();
        recursion(n);
        sc.close();
    }
}