import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int n ) {
        if(n==0||n==1) return false;
        for(int i = 2 ; i*i<n ; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(isPrime(n)) System.out.print(n + " is Prime.");
        else System.out.print(n+" Not a Prime.") ;
        sc.close();
    }    
}
