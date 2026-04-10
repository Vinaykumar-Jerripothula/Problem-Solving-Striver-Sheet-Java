
import java.util.Scanner;

public class OneToNUsingRecursion {

    public static void printOneToNUsingRecursion(int n )
    {
        if(n == 0)
        {
            return;
        }
        printOneToNUsingRecursion(n-1);
        //Backtracking
        System.out.println(n);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range to Print OneToN : ");
        int n = sc.nextInt();
        printOneToNUsingRecursion(n);
        sc.close();
    }
}
